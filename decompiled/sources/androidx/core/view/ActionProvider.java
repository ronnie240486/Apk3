package androidx.core.view;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ActionProvider {
    private static final java.lang.String TAG = "ActionProvider(support)";
    private final android.content.Context mContext;
    private androidx.core.view.ActionProvider.SubUiVisibilityListener mSubUiVisibilityListener;
    private androidx.core.view.ActionProvider.VisibilityListener mVisibilityListener;

    /* JADX INFO: loaded from: classes.dex */
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public interface SubUiVisibilityListener {
        void onSubUiVisibilityChanged(boolean r1);
    }

    public interface VisibilityListener {
        void onActionProviderVisibilityChanged(boolean r1);
    }

    public ActionProvider(@androidx.annotation.NonNull android.content.Context r1) {
            r0 = this;
            r0.<init>()
            r0.mContext = r1
            return
    }

    @androidx.annotation.NonNull
    public android.content.Context getContext() {
            r1 = this;
            android.content.Context r0 = r1.mContext
            return r0
    }

    public boolean hasSubMenu() {
            r1 = this;
            r0 = 0
            return r0
    }

    public boolean isVisible() {
            r1 = this;
            r0 = 1
            return r0
    }

    @androidx.annotation.NonNull
    public abstract android.view.View onCreateActionView();

    @androidx.annotation.NonNull
    public android.view.View onCreateActionView(@androidx.annotation.NonNull android.view.MenuItem r1) {
            r0 = this;
            android.view.View r1 = r0.onCreateActionView()
            return r1
    }

    public boolean onPerformDefaultAction() {
            r1 = this;
            r0 = 0
            return r0
    }

    public void onPrepareSubMenu(@androidx.annotation.NonNull android.view.SubMenu r1) {
            r0 = this;
            return
    }

    public boolean overridesItemVisibility() {
            r1 = this;
            r0 = 0
            return r0
    }

    public void refreshVisibility() {
            r2 = this;
            androidx.core.view.ActionProvider$VisibilityListener r0 = r2.mVisibilityListener
            if (r0 == 0) goto L13
            boolean r0 = r2.overridesItemVisibility()
            if (r0 == 0) goto L13
            androidx.core.view.ActionProvider$VisibilityListener r0 = r2.mVisibilityListener
            boolean r1 = r2.isVisible()
            r0.onActionProviderVisibilityChanged(r1)
        L13:
            return
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void reset() {
            r1 = this;
            r0 = 0
            r1.mVisibilityListener = r0
            r1.mSubUiVisibilityListener = r0
            return
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSubUiVisibilityListener(@androidx.annotation.Nullable androidx.core.view.ActionProvider.SubUiVisibilityListener r1) {
            r0 = this;
            r0.mSubUiVisibilityListener = r1
            return
    }

    public void setVisibilityListener(@androidx.annotation.Nullable androidx.core.view.ActionProvider.VisibilityListener r3) {
            r2 = this;
            androidx.core.view.ActionProvider$VisibilityListener r0 = r2.mVisibilityListener
            if (r0 == 0) goto L26
            if (r3 == 0) goto L26
            java.lang.String r0 = "setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this "
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            java.lang.Class r1 = r2.getClass()
            java.lang.String r1 = r1.getSimpleName()
            r0.append(r1)
            java.lang.String r1 = " instance while it is still in use somewhere else?"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "ActionProvider(support)"
            android.util.Log.w(r1, r0)
        L26:
            r2.mVisibilityListener = r3
            return
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void subUiVisibilityChanged(boolean r2) {
            r1 = this;
            androidx.core.view.ActionProvider$SubUiVisibilityListener r0 = r1.mSubUiVisibilityListener
            if (r0 == 0) goto L7
            r0.onSubUiVisibilityChanged(r2)
        L7:
            return
    }
}
