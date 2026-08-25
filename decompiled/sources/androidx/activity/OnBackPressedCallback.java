package androidx.activity;

/* JADX INFO: loaded from: classes.dex */
public abstract class OnBackPressedCallback {
    private java.util.concurrent.CopyOnWriteArrayList<androidx.activity.Cancellable> mCancellables;
    private boolean mEnabled;
    private androidx.core.util.Consumer<java.lang.Boolean> mEnabledConsumer;

    public OnBackPressedCallback(boolean r2) {
            r1 = this;
            r1.<init>()
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            r1.mCancellables = r0
            r1.mEnabled = r2
            return
    }

    public final void addCancellable(@androidx.annotation.NonNull androidx.activity.Cancellable r2) {
            r1 = this;
            java.util.concurrent.CopyOnWriteArrayList<androidx.activity.Cancellable> r0 = r1.mCancellables
            r0.add(r2)
            return
    }

    @androidx.annotation.MainThread
    public abstract void handleOnBackPressed();

    @androidx.annotation.MainThread
    public final boolean isEnabled() {
            r1 = this;
            boolean r0 = r1.mEnabled
            return r0
    }

    @androidx.annotation.MainThread
    public final void remove() {
            r2 = this;
            java.util.concurrent.CopyOnWriteArrayList<androidx.activity.Cancellable> r0 = r2.mCancellables
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L16
            java.lang.Object r1 = r0.next()
            androidx.activity.Cancellable r1 = (androidx.activity.Cancellable) r1
            r1.cancel()
            goto L6
        L16:
            return
    }

    public final void removeCancellable(@androidx.annotation.NonNull androidx.activity.Cancellable r2) {
            r1 = this;
            java.util.concurrent.CopyOnWriteArrayList<androidx.activity.Cancellable> r0 = r1.mCancellables
            r0.remove(r2)
            return
    }

    @androidx.annotation.OptIn(markerClass = {androidx.core.os.BuildCompat.PrereleaseSdkCheck.class})
    @androidx.annotation.MainThread
    public final void setEnabled(boolean r2) {
            r1 = this;
            r1.mEnabled = r2
            androidx.core.util.Consumer<java.lang.Boolean> r0 = r1.mEnabledConsumer
            if (r0 == 0) goto Ld
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r0.accept(r2)
        Ld:
            return
    }

    public final void setIsEnabledConsumer(@androidx.annotation.Nullable androidx.core.util.Consumer<java.lang.Boolean> r1) {
            r0 = this;
            r0.mEnabledConsumer = r1
            return
    }
}
