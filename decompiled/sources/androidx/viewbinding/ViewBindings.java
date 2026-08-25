package androidx.viewbinding;

/* JADX INFO: loaded from: classes2.dex */
public class ViewBindings {
    private ViewBindings() {
            r0 = this;
            r0.<init>()
            return
    }

    public static <T extends android.view.View> T findChildViewById(android.view.View r5, int r6) {
            boolean r0 = r5 instanceof android.view.ViewGroup
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            r0 = r5
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            int r2 = r0.getChildCount()
            r3 = 0
        Le:
            if (r3 >= r2) goto L1e
            android.view.View r4 = r0.getChildAt(r3)
            android.view.View r4 = r4.findViewById(r6)
            if (r4 == 0) goto L1b
            return r4
        L1b:
            int r3 = r3 + 1
            goto Le
        L1e:
            return r1
    }
}
