package androidx.fragment.app;

/* JADX INFO: loaded from: classes2.dex */
@java.lang.Deprecated
public class FragmentManagerNonConfig {

    @androidx.annotation.Nullable
    private final java.util.Map<java.lang.String, androidx.fragment.app.FragmentManagerNonConfig> mChildNonConfigs;

    @androidx.annotation.Nullable
    private final java.util.Collection<androidx.fragment.app.Fragment> mFragments;

    @androidx.annotation.Nullable
    private final java.util.Map<java.lang.String, androidx.lifecycle.ViewModelStore> mViewModelStores;

    public FragmentManagerNonConfig(@androidx.annotation.Nullable java.util.Collection<androidx.fragment.app.Fragment> r1, @androidx.annotation.Nullable java.util.Map<java.lang.String, androidx.fragment.app.FragmentManagerNonConfig> r2, @androidx.annotation.Nullable java.util.Map<java.lang.String, androidx.lifecycle.ViewModelStore> r3) {
            r0 = this;
            r0.<init>()
            r0.mFragments = r1
            r0.mChildNonConfigs = r2
            r0.mViewModelStores = r3
            return
    }

    @androidx.annotation.Nullable
    public final java.util.Map<java.lang.String, androidx.fragment.app.FragmentManagerNonConfig> getChildNonConfigs() {
            r1 = this;
            java.util.Map<java.lang.String, androidx.fragment.app.FragmentManagerNonConfig> r0 = r1.mChildNonConfigs
            return r0
    }

    @androidx.annotation.Nullable
    public final java.util.Collection<androidx.fragment.app.Fragment> getFragments() {
            r1 = this;
            java.util.Collection<androidx.fragment.app.Fragment> r0 = r1.mFragments
            return r0
    }

    @androidx.annotation.Nullable
    public final java.util.Map<java.lang.String, androidx.lifecycle.ViewModelStore> getViewModelStores() {
            r1 = this;
            java.util.Map<java.lang.String, androidx.lifecycle.ViewModelStore> r0 = r1.mViewModelStores
            return r0
    }
}
