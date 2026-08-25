package androidx.activity;

/* JADX INFO: loaded from: classes3.dex */
public final class OnBackPressedDispatcher {
    private boolean mBackInvokedCallbackRegistered;
    private androidx.core.util.Consumer<java.lang.Boolean> mEnabledConsumer;

    @androidx.annotation.Nullable
    private final java.lang.Runnable mFallbackOnBackPressed;
    private android.window.OnBackInvokedDispatcher mInvokedDispatcher;
    private android.window.OnBackInvokedCallback mOnBackInvokedCallback;
    public final java.util.ArrayDeque<androidx.activity.OnBackPressedCallback> mOnBackPressedCallbacks;

    /* JADX INFO: loaded from: classes.dex */
    @androidx.annotation.RequiresApi(33)
    public static class Api33Impl {
        private Api33Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        public static android.window.OnBackInvokedCallback createOnBackInvokedCallback(java.lang.Runnable r1) {
                java.util.Objects.requireNonNull(r1)
                androidx.activity.OnBackPressedDispatcher$Api33Impl$$ExternalSyntheticLambda0 r0 = new androidx.activity.OnBackPressedDispatcher$Api33Impl$$ExternalSyntheticLambda0
                r0.<init>(r1)
                return r0
        }

        @androidx.annotation.DoNotInline
        public static void registerOnBackInvokedCallback(java.lang.Object r0, int r1, java.lang.Object r2) {
                android.window.OnBackInvokedDispatcher r0 = (android.window.OnBackInvokedDispatcher) r0
                android.window.OnBackInvokedCallback r2 = (android.window.OnBackInvokedCallback) r2
                r0.registerOnBackInvokedCallback(r1, r2)
                return
        }

        @androidx.annotation.DoNotInline
        public static void unregisterOnBackInvokedCallback(java.lang.Object r0, java.lang.Object r1) {
                android.window.OnBackInvokedDispatcher r0 = (android.window.OnBackInvokedDispatcher) r0
                android.window.OnBackInvokedCallback r1 = (android.window.OnBackInvokedCallback) r1
                r0.unregisterOnBackInvokedCallback(r1)
                return
        }
    }

    public class LifecycleOnBackPressedCancellable implements androidx.lifecycle.LifecycleEventObserver, androidx.activity.Cancellable {

        @androidx.annotation.Nullable
        private androidx.activity.Cancellable mCurrentCancellable;
        private final androidx.lifecycle.Lifecycle mLifecycle;
        private final androidx.activity.OnBackPressedCallback mOnBackPressedCallback;
        public final /* synthetic */ androidx.activity.OnBackPressedDispatcher this$0;

        public LifecycleOnBackPressedCancellable(@androidx.annotation.NonNull androidx.activity.OnBackPressedDispatcher r1, @androidx.annotation.NonNull androidx.lifecycle.Lifecycle r2, androidx.activity.OnBackPressedCallback r3) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.mLifecycle = r2
                r0.mOnBackPressedCallback = r3
                r2.addObserver(r0)
                return
        }

        @Override // androidx.activity.Cancellable
        public void cancel() {
                r1 = this;
                androidx.lifecycle.Lifecycle r0 = r1.mLifecycle
                r0.removeObserver(r1)
                androidx.activity.OnBackPressedCallback r0 = r1.mOnBackPressedCallback
                r0.removeCancellable(r1)
                androidx.activity.Cancellable r0 = r1.mCurrentCancellable
                if (r0 == 0) goto L14
                r0.cancel()
                r0 = 0
                r1.mCurrentCancellable = r0
            L14:
                return
        }

        @Override // androidx.lifecycle.LifecycleEventObserver
        public void onStateChanged(@androidx.annotation.NonNull androidx.lifecycle.LifecycleOwner r1, @androidx.annotation.NonNull androidx.lifecycle.Lifecycle.Event r2) {
                r0 = this;
                androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.Event.ON_START
                if (r2 != r1) goto Lf
                androidx.activity.OnBackPressedDispatcher r1 = r0.this$0
                androidx.activity.OnBackPressedCallback r2 = r0.mOnBackPressedCallback
                androidx.activity.Cancellable r1 = r1.addCancellableCallback(r2)
                r0.mCurrentCancellable = r1
                goto L22
            Lf:
                androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.Event.ON_STOP
                if (r2 != r1) goto L1b
                androidx.activity.Cancellable r1 = r0.mCurrentCancellable
                if (r1 == 0) goto L22
                r1.cancel()
                goto L22
            L1b:
                androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.Event.ON_DESTROY
                if (r2 != r1) goto L22
                r0.cancel()
            L22:
                return
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class OnBackPressedCancellable implements androidx.activity.Cancellable {
        private final androidx.activity.OnBackPressedCallback mOnBackPressedCallback;
        public final /* synthetic */ androidx.activity.OnBackPressedDispatcher this$0;

        public OnBackPressedCancellable(androidx.activity.OnBackPressedDispatcher r1, androidx.activity.OnBackPressedCallback r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.mOnBackPressedCallback = r2
                return
        }

        @Override // androidx.activity.Cancellable
        @androidx.annotation.OptIn(markerClass = {androidx.core.os.BuildCompat.PrereleaseSdkCheck.class})
        public void cancel() {
                r2 = this;
                androidx.activity.OnBackPressedDispatcher r0 = r2.this$0
                java.util.ArrayDeque<androidx.activity.OnBackPressedCallback> r0 = r0.mOnBackPressedCallbacks
                androidx.activity.OnBackPressedCallback r1 = r2.mOnBackPressedCallback
                r0.remove(r1)
                androidx.activity.OnBackPressedCallback r0 = r2.mOnBackPressedCallback
                r0.removeCancellable(r2)
                boolean r0 = androidx.core.os.BuildCompat.isAtLeastT()
                if (r0 == 0) goto L1f
                androidx.activity.OnBackPressedCallback r0 = r2.mOnBackPressedCallback
                r1 = 0
                r0.setIsEnabledConsumer(r1)
                androidx.activity.OnBackPressedDispatcher r0 = r2.this$0
                r0.updateBackInvokedCallbackState()
            L1f:
                return
        }
    }

    public static /* synthetic */ void $r8$lambda$_OyTAhjGr9tgm4CqoN01pHmhslA(androidx.activity.OnBackPressedDispatcher r0, java.lang.Boolean r1) {
            r0.lambda$new$0(r1)
            return
    }

    public OnBackPressedDispatcher() {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            return
    }

    @androidx.annotation.OptIn(markerClass = {androidx.core.os.BuildCompat.PrereleaseSdkCheck.class})
    public OnBackPressedDispatcher(@androidx.annotation.Nullable java.lang.Runnable r2) {
            r1 = this;
            r1.<init>()
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            r0.<init>()
            r1.mOnBackPressedCallbacks = r0
            r0 = 0
            r1.mBackInvokedCallbackRegistered = r0
            r1.mFallbackOnBackPressed = r2
            boolean r2 = androidx.core.os.BuildCompat.isAtLeastT()
            if (r2 == 0) goto L28
            androidx.activity.OnBackPressedDispatcher$$ExternalSyntheticLambda0 r2 = new androidx.activity.OnBackPressedDispatcher$$ExternalSyntheticLambda0
            r2.<init>(r1)
            r1.mEnabledConsumer = r2
            androidx.activity.ComponentDialog$$ExternalSyntheticLambda0 r2 = new androidx.activity.ComponentDialog$$ExternalSyntheticLambda0
            r0 = 2
            r2.<init>(r1, r0)
            android.window.OnBackInvokedCallback r2 = androidx.activity.OnBackPressedDispatcher.Api33Impl.createOnBackInvokedCallback(r2)
            r1.mOnBackInvokedCallback = r2
        L28:
            return
    }

    private /* synthetic */ void lambda$new$0(java.lang.Boolean r1) {
            r0 = this;
            boolean r1 = androidx.core.os.BuildCompat.isAtLeastT()
            if (r1 == 0) goto L9
            r0.updateBackInvokedCallbackState()
        L9:
            return
    }

    @androidx.annotation.MainThread
    public void addCallback(@androidx.annotation.NonNull androidx.activity.OnBackPressedCallback r1) {
            r0 = this;
            r0.addCancellableCallback(r1)
            return
    }

    @androidx.annotation.OptIn(markerClass = {androidx.core.os.BuildCompat.PrereleaseSdkCheck.class})
    @android.annotation.SuppressLint({"LambdaLast"})
    @androidx.annotation.MainThread
    public void addCallback(@androidx.annotation.NonNull androidx.lifecycle.LifecycleOwner r3, @androidx.annotation.NonNull androidx.activity.OnBackPressedCallback r4) {
            r2 = this;
            androidx.lifecycle.Lifecycle r3 = r3.getLifecycle()
            androidx.lifecycle.Lifecycle$State r0 = r3.getCurrentState()
            androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.DESTROYED
            if (r0 != r1) goto Ld
            return
        Ld:
            androidx.activity.OnBackPressedDispatcher$LifecycleOnBackPressedCancellable r0 = new androidx.activity.OnBackPressedDispatcher$LifecycleOnBackPressedCancellable
            r0.<init>(r2, r3, r4)
            r4.addCancellable(r0)
            boolean r3 = androidx.core.os.BuildCompat.isAtLeastT()
            if (r3 == 0) goto L23
            r2.updateBackInvokedCallbackState()
            androidx.core.util.Consumer<java.lang.Boolean> r3 = r2.mEnabledConsumer
            r4.setIsEnabledConsumer(r3)
        L23:
            return
    }

    @androidx.annotation.NonNull
    @androidx.annotation.OptIn(markerClass = {androidx.core.os.BuildCompat.PrereleaseSdkCheck.class})
    @androidx.annotation.MainThread
    public final androidx.activity.Cancellable addCancellableCallback(@androidx.annotation.NonNull androidx.activity.OnBackPressedCallback r3) {
            r2 = this;
            java.util.ArrayDeque<androidx.activity.OnBackPressedCallback> r0 = r2.mOnBackPressedCallbacks
            r0.add(r3)
            androidx.activity.OnBackPressedDispatcher$OnBackPressedCancellable r0 = new androidx.activity.OnBackPressedDispatcher$OnBackPressedCancellable
            r0.<init>(r2, r3)
            r3.addCancellable(r0)
            boolean r1 = androidx.core.os.BuildCompat.isAtLeastT()
            if (r1 == 0) goto L1b
            r2.updateBackInvokedCallbackState()
            androidx.core.util.Consumer<java.lang.Boolean> r1 = r2.mEnabledConsumer
            r3.setIsEnabledConsumer(r1)
        L1b:
            return r0
    }

    @androidx.annotation.MainThread
    public boolean hasEnabledCallbacks() {
            r2 = this;
            java.util.ArrayDeque<androidx.activity.OnBackPressedCallback> r0 = r2.mOnBackPressedCallbacks
            java.util.Iterator r0 = r0.descendingIterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1a
            java.lang.Object r1 = r0.next()
            androidx.activity.OnBackPressedCallback r1 = (androidx.activity.OnBackPressedCallback) r1
            boolean r1 = r1.isEnabled()
            if (r1 == 0) goto L6
            r0 = 1
            return r0
        L1a:
            r0 = 0
            return r0
    }

    @androidx.annotation.MainThread
    public void onBackPressed() {
            r3 = this;
            java.util.ArrayDeque<androidx.activity.OnBackPressedCallback> r0 = r3.mOnBackPressedCallbacks
            java.util.Iterator r0 = r0.descendingIterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1c
            java.lang.Object r1 = r0.next()
            androidx.activity.OnBackPressedCallback r1 = (androidx.activity.OnBackPressedCallback) r1
            boolean r2 = r1.isEnabled()
            if (r2 == 0) goto L6
            r1.handleOnBackPressed()
            return
        L1c:
            java.lang.Runnable r0 = r3.mFallbackOnBackPressed
            if (r0 == 0) goto L23
            r0.run()
        L23:
            return
    }

    @androidx.annotation.RequiresApi(33)
    public void setOnBackInvokedDispatcher(@androidx.annotation.NonNull android.window.OnBackInvokedDispatcher r1) {
            r0 = this;
            r0.mInvokedDispatcher = r1
            r0.updateBackInvokedCallbackState()
            return
    }

    @androidx.annotation.RequiresApi(33)
    public final void updateBackInvokedCallbackState() {
            r4 = this;
            boolean r0 = r4.hasEnabledCallbacks()
            android.window.OnBackInvokedDispatcher r1 = r4.mInvokedDispatcher
            if (r1 == 0) goto L25
            r2 = 0
            if (r0 == 0) goto L18
            boolean r3 = r4.mBackInvokedCallbackRegistered
            if (r3 != 0) goto L18
            android.window.OnBackInvokedCallback r0 = r4.mOnBackInvokedCallback
            androidx.activity.OnBackPressedDispatcher.Api33Impl.registerOnBackInvokedCallback(r1, r2, r0)
            r0 = 1
            r4.mBackInvokedCallbackRegistered = r0
            goto L25
        L18:
            if (r0 != 0) goto L25
            boolean r0 = r4.mBackInvokedCallbackRegistered
            if (r0 == 0) goto L25
            android.window.OnBackInvokedCallback r0 = r4.mOnBackInvokedCallback
            androidx.activity.OnBackPressedDispatcher.Api33Impl.unregisterOnBackInvokedCallback(r1, r0)
            r4.mBackInvokedCallbackRegistered = r2
        L25:
            return
    }
}
