package smith.lib.views.cover;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.StringRes;

public class SCoverView extends RelativeLayout {

    private Context context;

    private TextView tv;
    private ImageView iv;
    
    @SuppressLint("ResourceAsColor")
    public SCoverView(Context context, AttributeSet attr) {
    	super(context, attr);
        init(context, attr);
    }

    public SCoverView(Context context) {
        super(context);
        init(context, null);
    }

    private void init(Context context, AttributeSet attributeSet) {
        this.context = context;
        inflate(context, R.layout.scover_layout, this);
        tv = findViewById(R.id.tv);
        iv = findViewById(R.id.iv);

        if (attributeSet != null) {
            TypedArray attrs = context.obtainStyledAttributes(attributeSet, R.styleable.SCoverView, 0, 0);

            float textSize = attrs.getDimensionPixelSize(R.styleable.SCoverView_textSize, 16);
            tv.setTextSize(textSize);

            int shadeColor = attrs.getColor(R.styleable.SCoverView_textShadeColor, Color.BLACK);
            tv.setBackground(shadeColor(shadeColor, 0));

            int textColor = attrs.getColor(R.styleable.SCoverView_textColor, Color.WHITE);
            tv.setTextColor(textColor);

            int textPadding = attrs.getDimensionPixelSize(R.styleable.SCoverView_textPadding, 12);
            tv.setPaddingRelative(textPadding, textPadding, textPadding, textPadding);

            int corners = attrs.getDimensionPixelSize(R.styleable.SCoverView_corners, 10);
            setBackground(shadeColor(Color.TRANSPARENT, corners));

            tv.setText(attrs.getString(R.styleable.SCoverView_text));
            iv.setImageResource(attrs.getResourceId(R.styleable.SCoverView_image, R.drawable.img));

            setClipToOutline(true);
            attrs.recycle();
        }
    }

    public void setImageResource(@DrawableRes int resource) {
        iv.setImageResource(resource);
    }

    public void setImageDrawable(int drawable) {
        iv.setImageResource(drawable);
    }

    public void setImageBitmap(int bitmap) {
        iv.setImageResource(bitmap);
    }

    public void setText(CharSequence charSequence) {
        tv.setText(charSequence);
    }

    public void setText(@StringRes int stringResource) {
        tv.setText(stringResource);
    }

    public void setTextShadeColor(@ColorInt int color) {
        tv.setBackground(shadeColor(color, 0));
    }

    public void setTextColor(@ColorInt int color) {
        tv.setTextColor(color);
    }

    public void setTextPadding(int padding) {
        int textPadding = dpToPx(padding);
        tv.setPaddingRelative(textPadding, textPadding, textPadding, textPadding);
    }

    public void serCorners(int corners) {
        int corner = dpToPx(corners);
        setBackground(shadeColor(Color.TRANSPARENT, corner));
        setClipToOutline(true);
    }

    @NonNull
    private Drawable shadeColor(int color, float corners) {
    	GradientDrawable mainLayout = new GradientDrawable();
        mainLayout.setColors(new int[] { Color.TRANSPARENT, color });
        mainLayout.setCornerRadius(corners);
        mainLayout.setOrientation(GradientDrawable.Orientation.TOP_BOTTOM);
        return mainLayout;
    }

    protected int dpToPx(int dp) {
        float density = context.getResources().getDisplayMetrics().density;
        return Math.round(dp * density);
    }
    
}