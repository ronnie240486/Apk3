package androidx.lifecycle;

/* JADX INFO: loaded from: classes2.dex */
public interface DefaultLifecycleObserver extends androidx.lifecycle.FullLifecycleObserver {

    /* JADX INFO: renamed from: androidx.lifecycle.DefaultLifecycleObserver$-CC, reason: invalid class name */
    /* JADX INFO: loaded from: classes.dex */
    public final /* synthetic */ class CC {
        public static void $default$onCreate(androidx.lifecycle.DefaultLifecycleObserver r0, @androidx.annotation.NonNull androidx.lifecycle.LifecycleOwner r1) {
                return
        }

        public static void $default$onDestroy(androidx.lifecycle.DefaultLifecycleObserver r0, @androidx.annotation.NonNull androidx.lifecycle.LifecycleOwner r1) {
                return
        }

        public static void $default$onPause(androidx.lifecycle.DefaultLifecycleObserver r0, @androidx.annotation.NonNull androidx.lifecycle.LifecycleOwner r1) {
                return
        }

        public static void $default$onResume(androidx.lifecycle.DefaultLifecycleObserver r0, @androidx.annotation.NonNull androidx.lifecycle.LifecycleOwner r1) {
                return
        }

        public static void $default$onStart(androidx.lifecycle.DefaultLifecycleObserver r0, @androidx.annotation.NonNull androidx.lifecycle.LifecycleOwner r1) {
                return
        }

        public static void $default$onStop(androidx.lifecycle.DefaultLifecycleObserver r0, @androidx.annotation.NonNull androidx.lifecycle.LifecycleOwner r1) {
                return
        }
    }

    @Override // androidx.lifecycle.FullLifecycleObserver
    void onCreate(@androidx.annotation.NonNull androidx.lifecycle.LifecycleOwner r1);

    @Override // androidx.lifecycle.FullLifecycleObserver
    void onDestroy(@androidx.annotation.NonNull androidx.lifecycle.LifecycleOwner r1);

    @Override // androidx.lifecycle.FullLifecycleObserver
    void onPause(@androidx.annotation.NonNull androidx.lifecycle.LifecycleOwner r1);

    @Override // androidx.lifecycle.FullLifecycleObserver
    void onResume(@androidx.annotation.NonNull androidx.lifecycle.LifecycleOwner r1);

    @Override // androidx.lifecycle.FullLifecycleObserver
    void onStart(@androidx.annotation.NonNull androidx.lifecycle.LifecycleOwner r1);

    @Override // androidx.lifecycle.FullLifecycleObserver
    void onStop(@androidx.annotation.NonNull androidx.lifecycle.LifecycleOwner r1);
}
