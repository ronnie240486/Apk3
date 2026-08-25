package com.google.android.material.snackbar;

/* JADX INFO: loaded from: classes2.dex */
class SnackbarManager {
    private static final int LONG_DURATION_MS = 2750;
    private static final int SHORT_DURATION_MS = 1500;
    private static com.google.android.material.snackbar.SnackbarManager snackbarManager;

    @androidx.annotation.Nullable
    private com.google.android.material.snackbar.SnackbarManager.SnackbarRecord currentSnackbar;

    @androidx.annotation.NonNull
    private final android.os.Handler handler;

    @androidx.annotation.NonNull
    private final java.lang.Object lock;

    @androidx.annotation.Nullable
    private com.google.android.material.snackbar.SnackbarManager.SnackbarRecord nextSnackbar;


    public interface Callback {
        void dismiss(int r1);

        void show();
    }

    /* JADX INFO: loaded from: classes.dex */
    public static class SnackbarRecord {

        @androidx.annotation.NonNull
        public final java.lang.ref.WeakReference<com.google.android.material.snackbar.SnackbarManager.Callback> callback;
        public int duration;
        public boolean paused;

        public SnackbarRecord(int r2, com.google.android.material.snackbar.SnackbarManager.Callback r3) {
                r1 = this;
                r1.<init>()
                java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
                r0.<init>(r3)
                r1.callback = r0
                r1.duration = r2
                return
        }
    }

    private SnackbarManager() {
            r3 = this;
            r3.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r3.lock = r0
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            com.google.android.material.snackbar.SnackbarManager$1 r2 = new com.google.android.material.snackbar.SnackbarManager$1
            r2.<init>(r3)
            r0.<init>(r1, r2)
            r3.handler = r0
            return
    }

    private boolean cancelSnackbarLocked(@androidx.annotation.NonNull com.google.android.material.snackbar.SnackbarManager.SnackbarRecord r3, int r4) {
            r2 = this;
            java.lang.ref.WeakReference<com.google.android.material.snackbar.SnackbarManager$Callback> r0 = r3.callback
            java.lang.Object r0 = r0.get()
            com.google.android.material.snackbar.SnackbarManager$Callback r0 = (com.google.android.material.snackbar.SnackbarManager.Callback) r0
            if (r0 == 0) goto L14
            android.os.Handler r1 = r2.handler
            r1.removeCallbacksAndMessages(r3)
            r0.dismiss(r4)
            r3 = 1
            return r3
        L14:
            r3 = 0
            return r3
    }

    public static com.google.android.material.snackbar.SnackbarManager getInstance() {
            com.google.android.material.snackbar.SnackbarManager r0 = com.google.android.material.snackbar.SnackbarManager.snackbarManager
            if (r0 != 0) goto Lb
            com.google.android.material.snackbar.SnackbarManager r0 = new com.google.android.material.snackbar.SnackbarManager
            r0.<init>()
            com.google.android.material.snackbar.SnackbarManager.snackbarManager = r0
        Lb:
            com.google.android.material.snackbar.SnackbarManager r0 = com.google.android.material.snackbar.SnackbarManager.snackbarManager
            return r0
    }

    private boolean isCurrentSnackbarLocked(com.google.android.material.snackbar.SnackbarManager.Callback r4) {
            r3 = this;
            com.google.android.material.snackbar.SnackbarManager$SnackbarRecord r0 = r3.currentSnackbar
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L19
            java.util.Objects.requireNonNull(r0)
            if (r4 == 0) goto L15
            java.lang.ref.WeakReference<com.google.android.material.snackbar.SnackbarManager$Callback> r0 = r0.callback
            java.lang.Object r0 = r0.get()
            if (r0 != r4) goto L15
            r4 = 1
            goto L16
        L15:
            r4 = 0
        L16:
            if (r4 == 0) goto L19
            goto L1a
        L19:
            r1 = 0
        L1a:
            return r1
    }

    private boolean isNextSnackbarLocked(com.google.android.material.snackbar.SnackbarManager.Callback r4) {
            r3 = this;
            com.google.android.material.snackbar.SnackbarManager$SnackbarRecord r0 = r3.nextSnackbar
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L19
            java.util.Objects.requireNonNull(r0)
            if (r4 == 0) goto L15
            java.lang.ref.WeakReference<com.google.android.material.snackbar.SnackbarManager$Callback> r0 = r0.callback
            java.lang.Object r0 = r0.get()
            if (r0 != r4) goto L15
            r4 = 1
            goto L16
        L15:
            r4 = 0
        L16:
            if (r4 == 0) goto L19
            goto L1a
        L19:
            r1 = 0
        L1a:
            return r1
    }

    private void scheduleTimeoutLocked(@androidx.annotation.NonNull com.google.android.material.snackbar.SnackbarManager.SnackbarRecord r5) {
            r4 = this;
            int r0 = r5.duration
            r1 = -2
            if (r0 != r1) goto L6
            return
        L6:
            r1 = 2750(0xabe, float:3.854E-42)
            if (r0 <= 0) goto Lb
            goto L13
        Lb:
            r2 = -1
            if (r0 != r2) goto L11
            r0 = 1500(0x5dc, float:2.102E-42)
            goto L13
        L11:
            r0 = 2750(0xabe, float:3.854E-42)
        L13:
            android.os.Handler r1 = r4.handler
            r1.removeCallbacksAndMessages(r5)
            android.os.Handler r1 = r4.handler
            r2 = 0
            android.os.Message r5 = android.os.Message.obtain(r1, r2, r5)
            long r2 = (long) r0
            r1.sendMessageDelayed(r5, r2)
            return
    }

    private void showNextSnackbarLocked() {
            r2 = this;
            com.google.android.material.snackbar.SnackbarManager$SnackbarRecord r0 = r2.nextSnackbar
            if (r0 == 0) goto L19
            r2.currentSnackbar = r0
            r1 = 0
            r2.nextSnackbar = r1
            java.lang.ref.WeakReference<com.google.android.material.snackbar.SnackbarManager$Callback> r0 = r0.callback
            java.lang.Object r0 = r0.get()
            com.google.android.material.snackbar.SnackbarManager$Callback r0 = (com.google.android.material.snackbar.SnackbarManager.Callback) r0
            if (r0 == 0) goto L17
            r0.show()
            goto L19
        L17:
            r2.currentSnackbar = r1
        L19:
            return
    }

    public void dismiss(com.google.android.material.snackbar.SnackbarManager.Callback r3, int r4) {
            r2 = this;
            java.lang.Object r0 = r2.lock
            monitor-enter(r0)
            boolean r1 = r2.isCurrentSnackbarLocked(r3)     // Catch: java.lang.Throwable -> L1c
            if (r1 == 0) goto Lf
            com.google.android.material.snackbar.SnackbarManager$SnackbarRecord r3 = r2.currentSnackbar     // Catch: java.lang.Throwable -> L1c
            r2.cancelSnackbarLocked(r3, r4)     // Catch: java.lang.Throwable -> L1c
            goto L1a
        Lf:
            boolean r3 = r2.isNextSnackbarLocked(r3)     // Catch: java.lang.Throwable -> L1c
            if (r3 == 0) goto L1a
            com.google.android.material.snackbar.SnackbarManager$SnackbarRecord r3 = r2.nextSnackbar     // Catch: java.lang.Throwable -> L1c
            r2.cancelSnackbarLocked(r3, r4)     // Catch: java.lang.Throwable -> L1c
        L1a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1c
            return
        L1c:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1c
            throw r3
    }

    public final void handleTimeout(@androidx.annotation.NonNull com.google.android.material.snackbar.SnackbarManager.SnackbarRecord r3) {
            r2 = this;
            java.lang.Object r0 = r2.lock
            monitor-enter(r0)
            com.google.android.material.snackbar.SnackbarManager$SnackbarRecord r1 = r2.currentSnackbar     // Catch: java.lang.Throwable -> L11
            if (r1 == r3) goto Lb
            com.google.android.material.snackbar.SnackbarManager$SnackbarRecord r1 = r2.nextSnackbar     // Catch: java.lang.Throwable -> L11
            if (r1 != r3) goto Lf
        Lb:
            r1 = 2
            r2.cancelSnackbarLocked(r3, r1)     // Catch: java.lang.Throwable -> L11
        Lf:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            return
        L11:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            throw r3
    }

    public boolean isCurrent(com.google.android.material.snackbar.SnackbarManager.Callback r2) {
            r1 = this;
            java.lang.Object r0 = r1.lock
            monitor-enter(r0)
            boolean r2 = r1.isCurrentSnackbarLocked(r2)     // Catch: java.lang.Throwable -> L9
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
            return r2
        L9:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
            throw r2
    }

    public boolean isCurrentOrNext(com.google.android.material.snackbar.SnackbarManager.Callback r3) {
            r2 = this;
            java.lang.Object r0 = r2.lock
            monitor-enter(r0)
            boolean r1 = r2.isCurrentSnackbarLocked(r3)     // Catch: java.lang.Throwable -> L15
            if (r1 != 0) goto L12
            boolean r3 = r2.isNextSnackbarLocked(r3)     // Catch: java.lang.Throwable -> L15
            if (r3 == 0) goto L10
            goto L12
        L10:
            r3 = 0
            goto L13
        L12:
            r3 = 1
        L13:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L15
            return r3
        L15:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L15
            throw r3
    }

    public void onDismissed(com.google.android.material.snackbar.SnackbarManager.Callback r2) {
            r1 = this;
            java.lang.Object r0 = r1.lock
            monitor-enter(r0)
            boolean r2 = r1.isCurrentSnackbarLocked(r2)     // Catch: java.lang.Throwable -> L15
            if (r2 == 0) goto L13
            r2 = 0
            r1.currentSnackbar = r2     // Catch: java.lang.Throwable -> L15
            com.google.android.material.snackbar.SnackbarManager$SnackbarRecord r2 = r1.nextSnackbar     // Catch: java.lang.Throwable -> L15
            if (r2 == 0) goto L13
            r1.showNextSnackbarLocked()     // Catch: java.lang.Throwable -> L15
        L13:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L15
            return
        L15:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L15
            throw r2
    }

    public void onShown(com.google.android.material.snackbar.SnackbarManager.Callback r2) {
            r1 = this;
            java.lang.Object r0 = r1.lock
            monitor-enter(r0)
            boolean r2 = r1.isCurrentSnackbarLocked(r2)     // Catch: java.lang.Throwable -> L10
            if (r2 == 0) goto Le
            com.google.android.material.snackbar.SnackbarManager$SnackbarRecord r2 = r1.currentSnackbar     // Catch: java.lang.Throwable -> L10
            r1.scheduleTimeoutLocked(r2)     // Catch: java.lang.Throwable -> L10
        Le:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
            return
        L10:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
            throw r2
    }

    public void pauseTimeout(com.google.android.material.snackbar.SnackbarManager.Callback r3) {
            r2 = this;
            java.lang.Object r0 = r2.lock
            monitor-enter(r0)
            boolean r3 = r2.isCurrentSnackbarLocked(r3)     // Catch: java.lang.Throwable -> L19
            if (r3 == 0) goto L17
            com.google.android.material.snackbar.SnackbarManager$SnackbarRecord r3 = r2.currentSnackbar     // Catch: java.lang.Throwable -> L19
            boolean r1 = r3.paused     // Catch: java.lang.Throwable -> L19
            if (r1 != 0) goto L17
            r1 = 1
            r3.paused = r1     // Catch: java.lang.Throwable -> L19
            android.os.Handler r1 = r2.handler     // Catch: java.lang.Throwable -> L19
            r1.removeCallbacksAndMessages(r3)     // Catch: java.lang.Throwable -> L19
        L17:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
            return
        L19:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
            throw r3
    }

    public void restoreTimeoutIfPaused(com.google.android.material.snackbar.SnackbarManager.Callback r3) {
            r2 = this;
            java.lang.Object r0 = r2.lock
            monitor-enter(r0)
            boolean r3 = r2.isCurrentSnackbarLocked(r3)     // Catch: java.lang.Throwable -> L17
            if (r3 == 0) goto L15
            com.google.android.material.snackbar.SnackbarManager$SnackbarRecord r3 = r2.currentSnackbar     // Catch: java.lang.Throwable -> L17
            boolean r1 = r3.paused     // Catch: java.lang.Throwable -> L17
            if (r1 == 0) goto L15
            r1 = 0
            r3.paused = r1     // Catch: java.lang.Throwable -> L17
            r2.scheduleTimeoutLocked(r3)     // Catch: java.lang.Throwable -> L17
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L17
            return
        L17:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L17
            throw r3
    }

    public void show(int r3, com.google.android.material.snackbar.SnackbarManager.Callback r4) {
            r2 = this;
            java.lang.Object r0 = r2.lock
            monitor-enter(r0)
            boolean r1 = r2.isCurrentSnackbarLocked(r4)     // Catch: java.lang.Throwable -> L40
            if (r1 == 0) goto L19
            com.google.android.material.snackbar.SnackbarManager$SnackbarRecord r4 = r2.currentSnackbar     // Catch: java.lang.Throwable -> L40
            r4.duration = r3     // Catch: java.lang.Throwable -> L40
            android.os.Handler r3 = r2.handler     // Catch: java.lang.Throwable -> L40
            r3.removeCallbacksAndMessages(r4)     // Catch: java.lang.Throwable -> L40
            com.google.android.material.snackbar.SnackbarManager$SnackbarRecord r3 = r2.currentSnackbar     // Catch: java.lang.Throwable -> L40
            r2.scheduleTimeoutLocked(r3)     // Catch: java.lang.Throwable -> L40
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L40
            return
        L19:
            boolean r1 = r2.isNextSnackbarLocked(r4)     // Catch: java.lang.Throwable -> L40
            if (r1 == 0) goto L24
            com.google.android.material.snackbar.SnackbarManager$SnackbarRecord r4 = r2.nextSnackbar     // Catch: java.lang.Throwable -> L40
            r4.duration = r3     // Catch: java.lang.Throwable -> L40
            goto L2b
        L24:
            com.google.android.material.snackbar.SnackbarManager$SnackbarRecord r1 = new com.google.android.material.snackbar.SnackbarManager$SnackbarRecord     // Catch: java.lang.Throwable -> L40
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> L40
            r2.nextSnackbar = r1     // Catch: java.lang.Throwable -> L40
        L2b:
            com.google.android.material.snackbar.SnackbarManager$SnackbarRecord r3 = r2.currentSnackbar     // Catch: java.lang.Throwable -> L40
            if (r3 == 0) goto L38
            r4 = 4
            boolean r3 = r2.cancelSnackbarLocked(r3, r4)     // Catch: java.lang.Throwable -> L40
            if (r3 == 0) goto L38
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L40
            return
        L38:
            r3 = 0
            r2.currentSnackbar = r3     // Catch: java.lang.Throwable -> L40
            r2.showNextSnackbarLocked()     // Catch: java.lang.Throwable -> L40
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L40
            return
        L40:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L40
            throw r3
    }
}
