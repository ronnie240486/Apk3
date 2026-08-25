package androidx.fragment.app;

/* JADX INFO: loaded from: classes3.dex */
public abstract class FragmentContainer {
    public FragmentContainer() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.NonNull
    @java.lang.Deprecated
    public androidx.fragment.app.Fragment instantiate(@androidx.annotation.NonNull android.content.Context r1, @androidx.annotation.NonNull java.lang.String r2, @androidx.annotation.Nullable android.os.Bundle r3) {
            r0 = this;
            androidx.fragment.app.Fragment r1 = androidx.fragment.app.Fragment.instantiate(r1, r2, r3)
            return r1
    }

    @androidx.annotation.Nullable
    public abstract android.view.View onFindViewById(@androidx.annotation.IdRes int r1);

    public abstract boolean onHasView();
}
