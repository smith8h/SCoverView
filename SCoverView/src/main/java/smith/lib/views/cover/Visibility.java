package smith.lib.views.cover;

import androidx.annotation.NonNull;

public enum Visibility {
    GONE(0), VISIBLE(1);
    int id;

    Visibility(int id) {
        this.id = id;
    }

    @NonNull
    static Visibility fromId(int id) {
        for (Visibility f : values()) {
            if (f.id == id) return f;
        }
        throw new IllegalStateException("Enum is not a visibility option!");
    }
}

