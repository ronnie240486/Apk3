package androidx.lifecycle;

/* JADX INFO: loaded from: classes2.dex */
public class ViewTreeLifecycleOwner {
    private ViewTreeLifecycleOwner() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.Nullable
    public static androidx.lifecycle.LifecycleOwner get(@androidx.annotation.NonNull android.view.View r2) {
            int r0 = androidx.lifecycle.runtime.R.id.view_tree_lifecycle_owner
            java.lang.Object r0 = r2.getTag(r0)
            androidx.lifecycle.LifecycleOwner r0 = (androidx.lifecycle.LifecycleOwner) r0
            if (r0 == 0) goto Lb
            return r0
        Lb:
            android.view.ViewParent r2 = r2.getParent()
        Lf:
            if (r0 != 0) goto L24
            boolean r1 = r2 instanceof android.view.View
            if (r1 == 0) goto L24
            android.view.View r2 = (android.view.View) r2
            int r0 = androidx.lifecycle.runtime.R.id.view_tree_lifecycle_owner
            java.lang.Object r0 = r2.getTag(r0)
            androidx.lifecycle.LifecycleOwner r0 = (androidx.lifecycle.LifecycleOwner) r0
            android.view.ViewParent r2 = r2.getParent()
            goto Lf
        L24:
            return r0
    }

    public static void set(@androidx.annotation.NonNull android.view.View r1, @androidx.annotation.Nullable androidx.lifecycle.LifecycleOwner r2) {
            int r0 = androidx.lifecycle.runtime.R.id.view_tree_lifecycle_owner
            r1.setTag(r0, r2)
            return
    }
}
