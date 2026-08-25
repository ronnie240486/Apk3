package androidx.appcompat.resources;

/* JADX INFO: loaded from: classes2.dex */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
public final class Compatibility {

    @androidx.annotation.RequiresApi(15)
    public static class Api15Impl {
        private Api15Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        public static void getValueForDensity(@androidx.annotation.NonNull android.content.res.Resources r0, int r1, int r2, @androidx.annotation.NonNull android.util.TypedValue r3, boolean r4) {
                r0.getValueForDensity(r1, r2, r3, r4)
                return
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    @androidx.annotation.RequiresApi(18)
    public static class Api18Impl {
        private Api18Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        public static void setAutoCancel(@androidx.annotation.NonNull android.animation.ObjectAnimator r0, boolean r1) {
                r0.setAutoCancel(r1)
                return
        }
    }

    @androidx.annotation.RequiresApi(21)
    public static class Api21Impl {
        private Api21Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.NonNull
        @androidx.annotation.DoNotInline
        public static android.graphics.drawable.Drawable createFromXmlInner(@androidx.annotation.NonNull android.content.res.Resources r0, @androidx.annotation.NonNull org.xmlpull.v1.XmlPullParser r1, @androidx.annotation.NonNull android.util.AttributeSet r2, @androidx.annotation.Nullable android.content.res.Resources.Theme r3) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException {
                android.graphics.drawable.Drawable r0 = android.graphics.drawable.Drawable.createFromXmlInner(r0, r1, r2, r3)
                return r0
        }

        @androidx.annotation.DoNotInline
        public static int getChangingConfigurations(@androidx.annotation.NonNull android.content.res.TypedArray r0) {
                int r0 = r0.getChangingConfigurations()
                return r0
        }

        @androidx.annotation.DoNotInline
        public static void inflate(@androidx.annotation.NonNull android.graphics.drawable.Drawable r0, @androidx.annotation.NonNull android.content.res.Resources r1, @androidx.annotation.NonNull org.xmlpull.v1.XmlPullParser r2, @androidx.annotation.NonNull android.util.AttributeSet r3, @androidx.annotation.Nullable android.content.res.Resources.Theme r4) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException {
                r0.inflate(r1, r2, r3, r4)
                return
        }
    }

    private Compatibility() {
            r0 = this;
            r0.<init>()
            return
    }
}
