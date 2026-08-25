package androidx.core.app;

/* JADX INFO: loaded from: classes.dex */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class ComponentActivity extends android.app.Activity implements androidx.lifecycle.LifecycleOwner, androidx.core.view.KeyEventDispatcher.Component {
    private androidx.collection.SimpleArrayMap<java.lang.Class<? extends androidx.core.app.ComponentActivity.ExtraData>, androidx.core.app.ComponentActivity.ExtraData> mExtraDataMap;
    private androidx.lifecycle.LifecycleRegistry mLifecycleRegistry;

    /* JADX INFO: loaded from: classes2.dex */
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @java.lang.Deprecated
    public static class ExtraData {
        public ExtraData() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    public ComponentActivity() {
            r1 = this;
            r1.<init>()
            androidx.collection.SimpleArrayMap r0 = new androidx.collection.SimpleArrayMap
            r0.<init>()
            r1.mExtraDataMap = r0
            androidx.lifecycle.LifecycleRegistry r0 = new androidx.lifecycle.LifecycleRegistry
            r0.<init>(r1)
            r1.mLifecycleRegistry = r0
            return
    }

    @androidx.annotation.OptIn(markerClass = {androidx.core.os.BuildCompat.PrereleaseSdkCheck.class})
    private static boolean shouldSkipDump(@androidx.annotation.Nullable java.lang.String[] r4) {
            r0 = 0
            if (r4 == 0) goto L6b
            int r1 = r4.length
            if (r1 <= 0) goto L6b
            r4 = r4[r0]
            java.util.Objects.requireNonNull(r4)
            r1 = -1
            int r2 = r4.hashCode()
            r3 = 1
            switch(r2) {
                case -645125871: goto L41;
                case 100470631: goto L36;
                case 472614934: goto L2b;
                case 1159329357: goto L20;
                case 1455016274: goto L15;
                default: goto L14;
            }
        L14:
            goto L4b
        L15:
            java.lang.String r2 = "--autofill"
            boolean r4 = r4.equals(r2)
            if (r4 != 0) goto L1e
            goto L4b
        L1e:
            r1 = 4
            goto L4b
        L20:
            java.lang.String r2 = "--contentcapture"
            boolean r4 = r4.equals(r2)
            if (r4 != 0) goto L29
            goto L4b
        L29:
            r1 = 3
            goto L4b
        L2b:
            java.lang.String r2 = "--list-dumpables"
            boolean r4 = r4.equals(r2)
            if (r4 != 0) goto L34
            goto L4b
        L34:
            r1 = 2
            goto L4b
        L36:
            java.lang.String r2 = "--dump-dumpable"
            boolean r4 = r4.equals(r2)
            if (r4 != 0) goto L3f
            goto L4b
        L3f:
            r1 = 1
            goto L4b
        L41:
            java.lang.String r2 = "--translation"
            boolean r4 = r4.equals(r2)
            if (r4 != 0) goto L4a
            goto L4b
        L4a:
            r1 = 0
        L4b:
            switch(r1) {
                case 0: goto L64;
                case 1: goto L5f;
                case 2: goto L5f;
                case 3: goto L57;
                case 4: goto L4f;
                default: goto L4e;
            }
        L4e:
            goto L6b
        L4f:
            int r4 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r4 < r1) goto L56
            r0 = 1
        L56:
            return r0
        L57:
            int r4 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r4 < r1) goto L5e
            r0 = 1
        L5e:
            return r0
        L5f:
            boolean r4 = androidx.core.os.BuildCompat.isAtLeastT()
            return r4
        L64:
            int r4 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            if (r4 < r1) goto L6b
            r0 = 1
        L6b:
            return r0
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(android.view.KeyEvent r3) {
            r2 = this;
            android.view.Window r0 = r2.getWindow()
            android.view.View r0 = r0.getDecorView()
            if (r0 == 0) goto L12
            boolean r1 = androidx.core.view.KeyEventDispatcher.dispatchBeforeHierarchy(r0, r3)
            if (r1 == 0) goto L12
            r3 = 1
            return r3
        L12:
            boolean r3 = androidx.core.view.KeyEventDispatcher.dispatchKeyEvent(r2, r0, r2, r3)
            return r3
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(android.view.KeyEvent r2) {
            r1 = this;
            android.view.Window r0 = r1.getWindow()
            android.view.View r0 = r0.getDecorView()
            if (r0 == 0) goto L12
            boolean r0 = androidx.core.view.KeyEventDispatcher.dispatchBeforeHierarchy(r0, r2)
            if (r0 == 0) goto L12
            r2 = 1
            return r2
        L12:
            boolean r2 = super.dispatchKeyShortcutEvent(r2)
            return r2
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @java.lang.Deprecated
    public <T extends androidx.core.app.ComponentActivity.ExtraData> T getExtraData(java.lang.Class<T> r2) {
            r1 = this;
            androidx.collection.SimpleArrayMap<java.lang.Class<? extends androidx.core.app.ComponentActivity$ExtraData>, androidx.core.app.ComponentActivity$ExtraData> r0 = r1.mExtraDataMap
            java.lang.Object r2 = r0.get(r2)
            androidx.core.app.ComponentActivity$ExtraData r2 = (androidx.core.app.ComponentActivity.ExtraData) r2
            return r2
    }

    @androidx.annotation.NonNull
    public androidx.lifecycle.Lifecycle getLifecycle() {
            r1 = this;
            androidx.lifecycle.LifecycleRegistry r0 = r1.mLifecycleRegistry
            return r0
    }

    @Override // android.app.Activity
    @android.annotation.SuppressLint({"RestrictedApi"})
    public void onCreate(@androidx.annotation.Nullable android.os.Bundle r1) {
            r0 = this;
            super.onCreate(r1)
            androidx.lifecycle.ReportFragment.injectIfNeededIn(r0)
            return
    }

    @Override // android.app.Activity
    @androidx.annotation.CallSuper
    public void onSaveInstanceState(@androidx.annotation.NonNull android.os.Bundle r3) {
            r2 = this;
            androidx.lifecycle.LifecycleRegistry r0 = r2.mLifecycleRegistry
            androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.CREATED
            r0.markState(r1)
            super.onSaveInstanceState(r3)
            return
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @java.lang.Deprecated
    public void putExtraData(androidx.core.app.ComponentActivity.ExtraData r3) {
            r2 = this;
            androidx.collection.SimpleArrayMap<java.lang.Class<? extends androidx.core.app.ComponentActivity$ExtraData>, androidx.core.app.ComponentActivity$ExtraData> r0 = r2.mExtraDataMap
            java.lang.Class r1 = r3.getClass()
            r0.put(r1, r3)
            return
    }

    @Override // androidx.core.view.KeyEventDispatcher.Component
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public boolean superDispatchKeyEvent(@androidx.annotation.NonNull android.view.KeyEvent r1) {
            r0 = this;
            boolean r1 = super.dispatchKeyEvent(r1)
            return r1
    }
}
