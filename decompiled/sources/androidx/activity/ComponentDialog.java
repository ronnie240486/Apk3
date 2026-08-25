package androidx.activity;

/* JADX INFO: compiled from: ComponentDialog.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u001b\b\u0007\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\b\b\u0003\u0010\u001f\u001a\u00020\u000b¢\u0006\u0004\b \u0010!J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\u0006\u0010\u0007\u001a\u00020\u0006J\u0006\u0010\t\u001a\u00020\bJ\b\u0010\n\u001a\u00020\u0004H\u0017J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\u001a\u0010\r\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016J\u001a\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u0012\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u00138BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\""}, d2 = {"Landroidx/activity/ComponentDialog;", "Landroid/app/Dialog;", "Landroidx/lifecycle/LifecycleOwner;", "Landroidx/activity/OnBackPressedDispatcherOwner;", "", "initViewTreeOwners", "Landroidx/lifecycle/Lifecycle;", "getLifecycle", "Landroidx/activity/OnBackPressedDispatcher;", "getOnBackPressedDispatcher", "onBackPressed", "", "layoutResID", "setContentView", "Landroid/view/View;", "view", "Landroid/view/ViewGroup$LayoutParams;", "params", "addContentView", "Landroidx/lifecycle/LifecycleRegistry;", "_lifecycleRegistry", "Landroidx/lifecycle/LifecycleRegistry;", "onBackPressedDispatcher", "Landroidx/activity/OnBackPressedDispatcher;", "getOnBackPressedDispatcher$annotations", "()V", "getLifecycleRegistry", "()Landroidx/lifecycle/LifecycleRegistry;", "lifecycleRegistry", "Landroid/content/Context;", "context", "themeResId", "<init>", "(Landroid/content/Context;I)V", "activity_release"}, k = 1, mv = {1, 7, 1})
public class ComponentDialog extends android.app.Dialog implements androidx.lifecycle.LifecycleOwner, androidx.activity.OnBackPressedDispatcherOwner {

    @org.jetbrains.annotations.Nullable
    private androidx.lifecycle.LifecycleRegistry _lifecycleRegistry;

    @org.jetbrains.annotations.NotNull
    private final androidx.activity.OnBackPressedDispatcher onBackPressedDispatcher;

    public static /* synthetic */ void $r8$lambda$3VrmmHeIN9Sasz9FquQXdvV7x_o(androidx.activity.ComponentDialog r0) {
            m1onBackPressedDispatcher$lambda1(r0)
            return
    }

    @kotlin.jvm.JvmOverloads
    public ComponentDialog(@org.jetbrains.annotations.NotNull android.content.Context r4) {
            r3 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = 0
            r1 = 2
            r2 = 0
            r3.<init>(r4, r0, r1, r2)
            return
    }

    @kotlin.jvm.JvmOverloads
    public ComponentDialog(@org.jetbrains.annotations.NotNull android.content.Context r2, @androidx.annotation.StyleRes int r3) {
            r1 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r1.<init>(r2, r3)
            androidx.activity.OnBackPressedDispatcher r2 = new androidx.activity.OnBackPressedDispatcher
            androidx.activity.ComponentDialog$$ExternalSyntheticLambda0 r3 = new androidx.activity.ComponentDialog$$ExternalSyntheticLambda0
            r0 = 0
            r3.<init>(r1, r0)
            r2.<init>(r3)
            r1.onBackPressedDispatcher = r2
            return
    }

    public /* synthetic */ ComponentDialog(android.content.Context r1, int r2, int r3, kotlin.jvm.internal.DefaultConstructorMarker r4) {
            r0 = this;
            r3 = r3 & 2
            if (r3 == 0) goto L5
            r2 = 0
        L5:
            r0.<init>(r1, r2)
            return
    }

    private final androidx.lifecycle.LifecycleRegistry getLifecycleRegistry() {
            r1 = this;
            androidx.lifecycle.LifecycleRegistry r0 = r1._lifecycleRegistry
            if (r0 != 0) goto Lb
            androidx.lifecycle.LifecycleRegistry r0 = new androidx.lifecycle.LifecycleRegistry
            r0.<init>(r1)
            r1._lifecycleRegistry = r0
        Lb:
            return r0
    }

    private static /* synthetic */ void getOnBackPressedDispatcher$annotations() {
            return
    }

    private final void initViewTreeOwners() {
            r2 = this;
            android.view.Window r0 = r2.getWindow()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            android.view.View r0 = r0.getDecorView()
            androidx.lifecycle.ViewTreeLifecycleOwner.set(r0, r2)
            android.view.Window r0 = r2.getWindow()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            android.view.View r0 = r0.getDecorView()
            java.lang.String r1 = "window!!.decorView"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            androidx.activity.ViewTreeOnBackPressedDispatcherOwner.set(r0, r2)
            return
    }

    /* JADX INFO: renamed from: onBackPressedDispatcher$lambda-1, reason: not valid java name */
    private static final void m1onBackPressedDispatcher$lambda1(androidx.activity.ComponentDialog r1) {
            java.lang.String r0 = "this$0"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            super.onBackPressed()
            return
    }

    @Override // android.app.Dialog
    public void addContentView(@org.jetbrains.annotations.NotNull android.view.View r2, @org.jetbrains.annotations.Nullable android.view.ViewGroup.LayoutParams r3) {
            r1 = this;
            java.lang.String r0 = "view"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r1.initViewTreeOwners()
            super.addContentView(r2, r3)
            return
    }

    @Override // androidx.lifecycle.LifecycleOwner
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.Lifecycle getLifecycle() {
            r1 = this;
            androidx.lifecycle.LifecycleRegistry r0 = r1.getLifecycleRegistry()
            return r0
    }

    @Override // androidx.activity.OnBackPressedDispatcherOwner
    @org.jetbrains.annotations.NotNull
    public final androidx.activity.OnBackPressedDispatcher getOnBackPressedDispatcher() {
            r1 = this;
            androidx.activity.OnBackPressedDispatcher r0 = r1.onBackPressedDispatcher
            return r0
    }

    @Override // android.app.Dialog
    @androidx.annotation.CallSuper
    public void onBackPressed() {
            r1 = this;
            androidx.activity.OnBackPressedDispatcher r0 = r1.onBackPressedDispatcher
            r0.onBackPressed()
            return
    }

    @Override // android.app.Dialog
    @androidx.annotation.CallSuper
    public void onCreate(@org.jetbrains.annotations.Nullable android.os.Bundle r2) {
            r1 = this;
            super.onCreate(r2)
            int r2 = android.os.Build.VERSION.SDK_INT
            r0 = 33
            if (r2 < r0) goto L12
            androidx.activity.OnBackPressedDispatcher r2 = r1.onBackPressedDispatcher
            android.window.OnBackInvokedDispatcher r0 = r1.getOnBackInvokedDispatcher()
            r2.setOnBackInvokedDispatcher(r0)
        L12:
            androidx.lifecycle.LifecycleRegistry r2 = r1.getLifecycleRegistry()
            androidx.lifecycle.Lifecycle$Event r0 = androidx.lifecycle.Lifecycle.Event.ON_CREATE
            r2.handleLifecycleEvent(r0)
            return
    }

    @Override // android.app.Dialog
    @androidx.annotation.CallSuper
    public void onStart() {
            r2 = this;
            super.onStart()
            androidx.lifecycle.LifecycleRegistry r0 = r2.getLifecycleRegistry()
            androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.Event.ON_RESUME
            r0.handleLifecycleEvent(r1)
            return
    }

    @Override // android.app.Dialog
    @androidx.annotation.CallSuper
    public void onStop() {
            r2 = this;
            androidx.lifecycle.LifecycleRegistry r0 = r2.getLifecycleRegistry()
            androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.Event.ON_DESTROY
            r0.handleLifecycleEvent(r1)
            r0 = 0
            r2._lifecycleRegistry = r0
            super.onStop()
            return
    }

    @Override // android.app.Dialog
    public void setContentView(int r1) {
            r0 = this;
            r0.initViewTreeOwners()
            super.setContentView(r1)
            return
    }

    @Override // android.app.Dialog
    public void setContentView(@org.jetbrains.annotations.NotNull android.view.View r2) {
            r1 = this;
            java.lang.String r0 = "view"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r1.initViewTreeOwners()
            super.setContentView(r2)
            return
    }

    @Override // android.app.Dialog
    public void setContentView(@org.jetbrains.annotations.NotNull android.view.View r2, @org.jetbrains.annotations.Nullable android.view.ViewGroup.LayoutParams r3) {
            r1 = this;
            java.lang.String r0 = "view"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r1.initViewTreeOwners()
            super.setContentView(r2, r3)
            return
    }
}
