package androidx.leanback.widget;

/* JADX INFO: loaded from: classes2.dex */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
public class Util {
    private Util() {
            r0 = this;
            r0.<init>()
            return
    }

    public static boolean isDescendant(android.view.ViewGroup r2, android.view.View r3) {
        L0:
            r0 = 0
            if (r3 == 0) goto L13
            if (r3 != r2) goto L7
            r2 = 1
            return r2
        L7:
            android.view.ViewParent r3 = r3.getParent()
            boolean r1 = r3 instanceof android.view.View
            if (r1 != 0) goto L10
            return r0
        L10:
            android.view.View r3 = (android.view.View) r3
            goto L0
        L13:
            return r0
    }
}
