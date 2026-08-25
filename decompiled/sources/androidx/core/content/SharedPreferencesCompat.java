package androidx.core.content;

/* JADX INFO: loaded from: classes.dex */
@java.lang.Deprecated
public final class SharedPreferencesCompat {

    @java.lang.Deprecated
    public static final class EditorCompat {
        private static androidx.core.content.SharedPreferencesCompat.EditorCompat sInstance;
        private final androidx.core.content.SharedPreferencesCompat.EditorCompat.Helper mHelper;

        /* JADX INFO: loaded from: classes2.dex */
        public static class Helper {
            public Helper() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            public void apply(@androidx.annotation.NonNull android.content.SharedPreferences.Editor r1) {
                    r0 = this;
                    r1.apply()     // Catch: java.lang.AbstractMethodError -> L4
                    goto L7
                L4:
                    r1.commit()
                L7:
                    return
            }
        }

        private EditorCompat() {
                r1 = this;
                r1.<init>()
                androidx.core.content.SharedPreferencesCompat$EditorCompat$Helper r0 = new androidx.core.content.SharedPreferencesCompat$EditorCompat$Helper
                r0.<init>()
                r1.mHelper = r0
                return
        }

        @java.lang.Deprecated
        public static androidx.core.content.SharedPreferencesCompat.EditorCompat getInstance() {
                androidx.core.content.SharedPreferencesCompat$EditorCompat r0 = androidx.core.content.SharedPreferencesCompat.EditorCompat.sInstance
                if (r0 != 0) goto Lb
                androidx.core.content.SharedPreferencesCompat$EditorCompat r0 = new androidx.core.content.SharedPreferencesCompat$EditorCompat
                r0.<init>()
                androidx.core.content.SharedPreferencesCompat.EditorCompat.sInstance = r0
            Lb:
                androidx.core.content.SharedPreferencesCompat$EditorCompat r0 = androidx.core.content.SharedPreferencesCompat.EditorCompat.sInstance
                return r0
        }

        @java.lang.Deprecated
        public void apply(@androidx.annotation.NonNull android.content.SharedPreferences.Editor r2) {
                r1 = this;
                androidx.core.content.SharedPreferencesCompat$EditorCompat$Helper r0 = r1.mHelper
                r0.apply(r2)
                return
        }
    }

    private SharedPreferencesCompat() {
            r0 = this;
            r0.<init>()
            return
    }
}
