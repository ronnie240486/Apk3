package androidx.lifecycle;

/* JADX INFO: loaded from: classes2.dex */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class ReportFragment extends android.app.Fragment {
    public static final /* synthetic */ int $r8$clinit = 0;
    private static final java.lang.String REPORT_FRAGMENT_TAG = "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag";
    private androidx.lifecycle.ReportFragment.ActivityInitializationListener mProcessListener;

    /* JADX INFO: loaded from: classes3.dex */
    public interface ActivityInitializationListener {
        void onCreate();

        void onResume();

        void onStart();
    }

    @androidx.annotation.RequiresApi(29)
    public static class LifecycleCallbacks implements android.app.Application.ActivityLifecycleCallbacks {
        public LifecycleCallbacks() {
                r0 = this;
                r0.<init>()
                return
        }

        public static void registerIn(android.app.Activity r1) {
                androidx.lifecycle.ReportFragment$LifecycleCallbacks r0 = new androidx.lifecycle.ReportFragment$LifecycleCallbacks
                r0.<init>()
                r1.registerActivityLifecycleCallbacks(r0)
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(@androidx.annotation.NonNull android.app.Activity r1, @androidx.annotation.Nullable android.os.Bundle r2) {
                r0 = this;
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(@androidx.annotation.NonNull android.app.Activity r1) {
                r0 = this;
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(@androidx.annotation.NonNull android.app.Activity r1) {
                r0 = this;
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostCreated(@androidx.annotation.NonNull android.app.Activity r1, @androidx.annotation.Nullable android.os.Bundle r2) {
                r0 = this;
                androidx.lifecycle.Lifecycle$Event r2 = androidx.lifecycle.Lifecycle.Event.ON_CREATE
                androidx.lifecycle.ReportFragment.dispatch(r1, r2)
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(@androidx.annotation.NonNull android.app.Activity r2) {
                r1 = this;
                androidx.lifecycle.Lifecycle$Event r0 = androidx.lifecycle.Lifecycle.Event.ON_RESUME
                androidx.lifecycle.ReportFragment.dispatch(r2, r0)
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(@androidx.annotation.NonNull android.app.Activity r2) {
                r1 = this;
                androidx.lifecycle.Lifecycle$Event r0 = androidx.lifecycle.Lifecycle.Event.ON_START
                androidx.lifecycle.ReportFragment.dispatch(r2, r0)
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreDestroyed(@androidx.annotation.NonNull android.app.Activity r2) {
                r1 = this;
                androidx.lifecycle.Lifecycle$Event r0 = androidx.lifecycle.Lifecycle.Event.ON_DESTROY
                androidx.lifecycle.ReportFragment.dispatch(r2, r0)
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPrePaused(@androidx.annotation.NonNull android.app.Activity r2) {
                r1 = this;
                androidx.lifecycle.Lifecycle$Event r0 = androidx.lifecycle.Lifecycle.Event.ON_PAUSE
                androidx.lifecycle.ReportFragment.dispatch(r2, r0)
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreStopped(@androidx.annotation.NonNull android.app.Activity r2) {
                r1 = this;
                androidx.lifecycle.Lifecycle$Event r0 = androidx.lifecycle.Lifecycle.Event.ON_STOP
                androidx.lifecycle.ReportFragment.dispatch(r2, r0)
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(@androidx.annotation.NonNull android.app.Activity r1) {
                r0 = this;
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(@androidx.annotation.NonNull android.app.Activity r1, @androidx.annotation.NonNull android.os.Bundle r2) {
                r0 = this;
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(@androidx.annotation.NonNull android.app.Activity r1) {
                r0 = this;
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(@androidx.annotation.NonNull android.app.Activity r1) {
                r0 = this;
                return
        }
    }

    public ReportFragment() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void dispatch(@androidx.annotation.NonNull android.app.Activity r1, @androidx.annotation.NonNull androidx.lifecycle.Lifecycle.Event r2) {
            boolean r0 = r1 instanceof androidx.lifecycle.LifecycleRegistryOwner
            if (r0 == 0) goto Le
            androidx.lifecycle.LifecycleRegistryOwner r1 = (androidx.lifecycle.LifecycleRegistryOwner) r1
            androidx.lifecycle.LifecycleRegistry r1 = r1.getLifecycle()
            r1.handleLifecycleEvent(r2)
            return
        Le:
            boolean r0 = r1 instanceof androidx.lifecycle.LifecycleOwner
            if (r0 == 0) goto L21
            androidx.lifecycle.LifecycleOwner r1 = (androidx.lifecycle.LifecycleOwner) r1
            androidx.lifecycle.Lifecycle r1 = r1.getLifecycle()
            boolean r0 = r1 instanceof androidx.lifecycle.LifecycleRegistry
            if (r0 == 0) goto L21
            androidx.lifecycle.LifecycleRegistry r1 = (androidx.lifecycle.LifecycleRegistry) r1
            r1.handleLifecycleEvent(r2)
        L21:
            return
    }

    private void dispatch(@androidx.annotation.NonNull androidx.lifecycle.Lifecycle.Event r3) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 >= r1) goto Ld
            android.app.Activity r0 = r2.getActivity()
            dispatch(r0, r3)
        Ld:
            return
    }

    private void dispatchCreate(androidx.lifecycle.ReportFragment.ActivityInitializationListener r1) {
            r0 = this;
            if (r1 == 0) goto L5
            r1.onCreate()
        L5:
            return
    }

    private void dispatchResume(androidx.lifecycle.ReportFragment.ActivityInitializationListener r1) {
            r0 = this;
            if (r1 == 0) goto L5
            r1.onResume()
        L5:
            return
    }

    private void dispatchStart(androidx.lifecycle.ReportFragment.ActivityInitializationListener r1) {
            r0 = this;
            if (r1 == 0) goto L5
            r1.onStart()
        L5:
            return
    }

    public static void injectIfNeededIn(android.app.Activity r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto L9
            androidx.lifecycle.ReportFragment.LifecycleCallbacks.registerIn(r3)
        L9:
            android.app.FragmentManager r3 = r3.getFragmentManager()
            java.lang.String r0 = "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag"
            android.app.Fragment r1 = r3.findFragmentByTag(r0)
            if (r1 != 0) goto L28
            android.app.FragmentTransaction r1 = r3.beginTransaction()
            androidx.lifecycle.ReportFragment r2 = new androidx.lifecycle.ReportFragment
            r2.<init>()
            android.app.FragmentTransaction r0 = r1.add(r2, r0)
            r0.commit()
            r3.executePendingTransactions()
        L28:
            return
    }

    @Override // android.app.Fragment
    public void onActivityCreated(android.os.Bundle r1) {
            r0 = this;
            super.onActivityCreated(r1)
            androidx.lifecycle.ReportFragment$ActivityInitializationListener r1 = r0.mProcessListener
            r0.dispatchCreate(r1)
            androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.Event.ON_CREATE
            r0.dispatch(r1)
            return
    }

    @Override // android.app.Fragment
    public void onDestroy() {
            r1 = this;
            super.onDestroy()
            androidx.lifecycle.Lifecycle$Event r0 = androidx.lifecycle.Lifecycle.Event.ON_DESTROY
            r1.dispatch(r0)
            r0 = 0
            r1.mProcessListener = r0
            return
    }

    @Override // android.app.Fragment
    public void onPause() {
            r1 = this;
            super.onPause()
            androidx.lifecycle.Lifecycle$Event r0 = androidx.lifecycle.Lifecycle.Event.ON_PAUSE
            r1.dispatch(r0)
            return
    }

    @Override // android.app.Fragment
    public void onResume() {
            r1 = this;
            super.onResume()
            androidx.lifecycle.ReportFragment$ActivityInitializationListener r0 = r1.mProcessListener
            r1.dispatchResume(r0)
            androidx.lifecycle.Lifecycle$Event r0 = androidx.lifecycle.Lifecycle.Event.ON_RESUME
            r1.dispatch(r0)
            return
    }

    @Override // android.app.Fragment
    public void onStart() {
            r1 = this;
            super.onStart()
            androidx.lifecycle.ReportFragment$ActivityInitializationListener r0 = r1.mProcessListener
            r1.dispatchStart(r0)
            androidx.lifecycle.Lifecycle$Event r0 = androidx.lifecycle.Lifecycle.Event.ON_START
            r1.dispatch(r0)
            return
    }

    @Override // android.app.Fragment
    public void onStop() {
            r1 = this;
            super.onStop()
            androidx.lifecycle.Lifecycle$Event r0 = androidx.lifecycle.Lifecycle.Event.ON_STOP
            r1.dispatch(r0)
            return
    }

    public final void setProcessListener(androidx.lifecycle.ReportFragment.ActivityInitializationListener r1) {
            r0 = this;
            r0.mProcessListener = r1
            return
    }
}
