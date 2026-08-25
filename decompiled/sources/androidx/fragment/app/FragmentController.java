package androidx.fragment.app;

/* JADX INFO: loaded from: classes.dex */
public class FragmentController {
    private final androidx.fragment.app.FragmentHostCallback<?> mHost;

    private FragmentController(androidx.fragment.app.FragmentHostCallback<?> r1) {
            r0 = this;
            r0.<init>()
            r0.mHost = r1
            return
    }

    @androidx.annotation.NonNull
    public static androidx.fragment.app.FragmentController createController(@androidx.annotation.NonNull androidx.fragment.app.FragmentHostCallback<?> r2) {
            androidx.fragment.app.FragmentController r0 = new androidx.fragment.app.FragmentController
            java.lang.String r1 = "callbacks == null"
            java.lang.Object r2 = androidx.core.util.Preconditions.checkNotNull(r2, r1)
            androidx.fragment.app.FragmentHostCallback r2 = (androidx.fragment.app.FragmentHostCallback) r2
            r0.<init>(r2)
            return r0
    }

    public void attachHost(@androidx.annotation.Nullable androidx.fragment.app.Fragment r3) {
            r2 = this;
            androidx.fragment.app.FragmentHostCallback<?> r0 = r2.mHost
            androidx.fragment.app.FragmentManager r1 = r0.mFragmentManager
            r1.attachController(r0, r0, r3)
            return
    }

    public void dispatchActivityCreated() {
            r1 = this;
            androidx.fragment.app.FragmentHostCallback<?> r0 = r1.mHost
            androidx.fragment.app.FragmentManager r0 = r0.mFragmentManager
            r0.dispatchActivityCreated()
            return
    }

    public void dispatchConfigurationChanged(@androidx.annotation.NonNull android.content.res.Configuration r2) {
            r1 = this;
            androidx.fragment.app.FragmentHostCallback<?> r0 = r1.mHost
            androidx.fragment.app.FragmentManager r0 = r0.mFragmentManager
            r0.dispatchConfigurationChanged(r2)
            return
    }

    public boolean dispatchContextItemSelected(@androidx.annotation.NonNull android.view.MenuItem r2) {
            r1 = this;
            androidx.fragment.app.FragmentHostCallback<?> r0 = r1.mHost
            androidx.fragment.app.FragmentManager r0 = r0.mFragmentManager
            boolean r2 = r0.dispatchContextItemSelected(r2)
            return r2
    }

    public void dispatchCreate() {
            r1 = this;
            androidx.fragment.app.FragmentHostCallback<?> r0 = r1.mHost
            androidx.fragment.app.FragmentManager r0 = r0.mFragmentManager
            r0.dispatchCreate()
            return
    }

    public boolean dispatchCreateOptionsMenu(@androidx.annotation.NonNull android.view.Menu r2, @androidx.annotation.NonNull android.view.MenuInflater r3) {
            r1 = this;
            androidx.fragment.app.FragmentHostCallback<?> r0 = r1.mHost
            androidx.fragment.app.FragmentManager r0 = r0.mFragmentManager
            boolean r2 = r0.dispatchCreateOptionsMenu(r2, r3)
            return r2
    }

    public void dispatchDestroy() {
            r1 = this;
            androidx.fragment.app.FragmentHostCallback<?> r0 = r1.mHost
            androidx.fragment.app.FragmentManager r0 = r0.mFragmentManager
            r0.dispatchDestroy()
            return
    }

    public void dispatchDestroyView() {
            r1 = this;
            androidx.fragment.app.FragmentHostCallback<?> r0 = r1.mHost
            androidx.fragment.app.FragmentManager r0 = r0.mFragmentManager
            r0.dispatchDestroyView()
            return
    }

    public void dispatchLowMemory() {
            r1 = this;
            androidx.fragment.app.FragmentHostCallback<?> r0 = r1.mHost
            androidx.fragment.app.FragmentManager r0 = r0.mFragmentManager
            r0.dispatchLowMemory()
            return
    }

    public void dispatchMultiWindowModeChanged(boolean r2) {
            r1 = this;
            androidx.fragment.app.FragmentHostCallback<?> r0 = r1.mHost
            androidx.fragment.app.FragmentManager r0 = r0.mFragmentManager
            r0.dispatchMultiWindowModeChanged(r2)
            return
    }

    public boolean dispatchOptionsItemSelected(@androidx.annotation.NonNull android.view.MenuItem r2) {
            r1 = this;
            androidx.fragment.app.FragmentHostCallback<?> r0 = r1.mHost
            androidx.fragment.app.FragmentManager r0 = r0.mFragmentManager
            boolean r2 = r0.dispatchOptionsItemSelected(r2)
            return r2
    }

    public void dispatchOptionsMenuClosed(@androidx.annotation.NonNull android.view.Menu r2) {
            r1 = this;
            androidx.fragment.app.FragmentHostCallback<?> r0 = r1.mHost
            androidx.fragment.app.FragmentManager r0 = r0.mFragmentManager
            r0.dispatchOptionsMenuClosed(r2)
            return
    }

    public void dispatchPause() {
            r1 = this;
            androidx.fragment.app.FragmentHostCallback<?> r0 = r1.mHost
            androidx.fragment.app.FragmentManager r0 = r0.mFragmentManager
            r0.dispatchPause()
            return
    }

    public void dispatchPictureInPictureModeChanged(boolean r2) {
            r1 = this;
            androidx.fragment.app.FragmentHostCallback<?> r0 = r1.mHost
            androidx.fragment.app.FragmentManager r0 = r0.mFragmentManager
            r0.dispatchPictureInPictureModeChanged(r2)
            return
    }

    public boolean dispatchPrepareOptionsMenu(@androidx.annotation.NonNull android.view.Menu r2) {
            r1 = this;
            androidx.fragment.app.FragmentHostCallback<?> r0 = r1.mHost
            androidx.fragment.app.FragmentManager r0 = r0.mFragmentManager
            boolean r2 = r0.dispatchPrepareOptionsMenu(r2)
            return r2
    }

    @java.lang.Deprecated
    public void dispatchReallyStop() {
            r0 = this;
            return
    }

    public void dispatchResume() {
            r1 = this;
            androidx.fragment.app.FragmentHostCallback<?> r0 = r1.mHost
            androidx.fragment.app.FragmentManager r0 = r0.mFragmentManager
            r0.dispatchResume()
            return
    }

    public void dispatchStart() {
            r1 = this;
            androidx.fragment.app.FragmentHostCallback<?> r0 = r1.mHost
            androidx.fragment.app.FragmentManager r0 = r0.mFragmentManager
            r0.dispatchStart()
            return
    }

    public void dispatchStop() {
            r1 = this;
            androidx.fragment.app.FragmentHostCallback<?> r0 = r1.mHost
            androidx.fragment.app.FragmentManager r0 = r0.mFragmentManager
            r0.dispatchStop()
            return
    }

    @java.lang.Deprecated
    public void doLoaderDestroy() {
            r0 = this;
            return
    }

    @java.lang.Deprecated
    public void doLoaderRetain() {
            r0 = this;
            return
    }

    @java.lang.Deprecated
    public void doLoaderStart() {
            r0 = this;
            return
    }

    @java.lang.Deprecated
    public void doLoaderStop(boolean r1) {
            r0 = this;
            return
    }

    @java.lang.Deprecated
    public void dumpLoaders(@androidx.annotation.NonNull java.lang.String r1, @androidx.annotation.Nullable java.io.FileDescriptor r2, @androidx.annotation.NonNull java.io.PrintWriter r3, @androidx.annotation.Nullable java.lang.String[] r4) {
            r0 = this;
            return
    }

    public boolean execPendingActions() {
            r2 = this;
            androidx.fragment.app.FragmentHostCallback<?> r0 = r2.mHost
            androidx.fragment.app.FragmentManager r0 = r0.mFragmentManager
            r1 = 1
            boolean r0 = r0.execPendingActions(r1)
            return r0
    }

    @androidx.annotation.Nullable
    public androidx.fragment.app.Fragment findFragmentByWho(@androidx.annotation.NonNull java.lang.String r2) {
            r1 = this;
            androidx.fragment.app.FragmentHostCallback<?> r0 = r1.mHost
            androidx.fragment.app.FragmentManager r0 = r0.mFragmentManager
            androidx.fragment.app.Fragment r2 = r0.findFragmentByWho(r2)
            return r2
    }

    @androidx.annotation.NonNull
    public java.util.List<androidx.fragment.app.Fragment> getActiveFragments(@android.annotation.SuppressLint({"UnknownNullness"}) java.util.List<androidx.fragment.app.Fragment> r1) {
            r0 = this;
            androidx.fragment.app.FragmentHostCallback<?> r1 = r0.mHost
            androidx.fragment.app.FragmentManager r1 = r1.mFragmentManager
            java.util.List r1 = r1.getActiveFragments()
            return r1
    }

    public int getActiveFragmentsCount() {
            r1 = this;
            androidx.fragment.app.FragmentHostCallback<?> r0 = r1.mHost
            androidx.fragment.app.FragmentManager r0 = r0.mFragmentManager
            int r0 = r0.getActiveFragmentCount()
            return r0
    }

    @androidx.annotation.NonNull
    public androidx.fragment.app.FragmentManager getSupportFragmentManager() {
            r1 = this;
            androidx.fragment.app.FragmentHostCallback<?> r0 = r1.mHost
            androidx.fragment.app.FragmentManager r0 = r0.mFragmentManager
            return r0
    }

    @android.annotation.SuppressLint({"UnknownNullness"})
    @java.lang.Deprecated
    public androidx.loader.app.LoaderManager getSupportLoaderManager() {
            r2 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Loaders are managed separately from FragmentController, use LoaderManager.getInstance() to obtain a LoaderManager."
            r0.<init>(r1)
            throw r0
    }

    public void noteStateNotSaved() {
            r1 = this;
            androidx.fragment.app.FragmentHostCallback<?> r0 = r1.mHost
            androidx.fragment.app.FragmentManager r0 = r0.mFragmentManager
            r0.noteStateNotSaved()
            return
    }

    @androidx.annotation.Nullable
    public android.view.View onCreateView(@androidx.annotation.Nullable android.view.View r2, @androidx.annotation.NonNull java.lang.String r3, @androidx.annotation.NonNull android.content.Context r4, @androidx.annotation.NonNull android.util.AttributeSet r5) {
            r1 = this;
            androidx.fragment.app.FragmentHostCallback<?> r0 = r1.mHost
            androidx.fragment.app.FragmentManager r0 = r0.mFragmentManager
            android.view.LayoutInflater$Factory2 r0 = r0.getLayoutInflaterFactory()
            android.view.View r2 = r0.onCreateView(r2, r3, r4, r5)
            return r2
    }

    @java.lang.Deprecated
    public void reportLoaderStart() {
            r0 = this;
            return
    }

    @java.lang.Deprecated
    public void restoreAllState(@androidx.annotation.Nullable android.os.Parcelable r2, @androidx.annotation.Nullable androidx.fragment.app.FragmentManagerNonConfig r3) {
            r1 = this;
            androidx.fragment.app.FragmentHostCallback<?> r0 = r1.mHost
            androidx.fragment.app.FragmentManager r0 = r0.mFragmentManager
            r0.restoreAllState(r2, r3)
            return
    }

    @java.lang.Deprecated
    public void restoreAllState(@androidx.annotation.Nullable android.os.Parcelable r4, @androidx.annotation.Nullable java.util.List<androidx.fragment.app.Fragment> r5) {
            r3 = this;
            androidx.fragment.app.FragmentHostCallback<?> r0 = r3.mHost
            androidx.fragment.app.FragmentManager r0 = r0.mFragmentManager
            androidx.fragment.app.FragmentManagerNonConfig r1 = new androidx.fragment.app.FragmentManagerNonConfig
            r2 = 0
            r1.<init>(r5, r2, r2)
            r0.restoreAllState(r4, r1)
            return
    }

    @java.lang.Deprecated
    public void restoreLoaderNonConfig(@android.annotation.SuppressLint({"UnknownNullness"}) androidx.collection.SimpleArrayMap<java.lang.String, androidx.loader.app.LoaderManager> r1) {
            r0 = this;
            return
    }

    public void restoreSaveState(@androidx.annotation.Nullable android.os.Parcelable r3) {
            r2 = this;
            androidx.fragment.app.FragmentHostCallback<?> r0 = r2.mHost
            boolean r1 = r0 instanceof androidx.lifecycle.ViewModelStoreOwner
            if (r1 == 0) goto Lc
            androidx.fragment.app.FragmentManager r0 = r0.mFragmentManager
            r0.restoreSaveState(r3)
            return
        Lc:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r0 = "Your FragmentHostCallback must implement ViewModelStoreOwner to call restoreSaveState(). Call restoreAllState()  if you're still using retainNestedNonConfig()."
            r3.<init>(r0)
            throw r3
    }

    @androidx.annotation.Nullable
    @java.lang.Deprecated
    public androidx.collection.SimpleArrayMap<java.lang.String, androidx.loader.app.LoaderManager> retainLoaderNonConfig() {
            r1 = this;
            r0 = 0
            return r0
    }

    @androidx.annotation.Nullable
    @java.lang.Deprecated
    public androidx.fragment.app.FragmentManagerNonConfig retainNestedNonConfig() {
            r1 = this;
            androidx.fragment.app.FragmentHostCallback<?> r0 = r1.mHost
            androidx.fragment.app.FragmentManager r0 = r0.mFragmentManager
            androidx.fragment.app.FragmentManagerNonConfig r0 = r0.retainNonConfig()
            return r0
    }

    @androidx.annotation.Nullable
    @java.lang.Deprecated
    public java.util.List<androidx.fragment.app.Fragment> retainNonConfig() {
            r2 = this;
            androidx.fragment.app.FragmentHostCallback<?> r0 = r2.mHost
            androidx.fragment.app.FragmentManager r0 = r0.mFragmentManager
            androidx.fragment.app.FragmentManagerNonConfig r0 = r0.retainNonConfig()
            if (r0 == 0) goto L1a
            java.util.Collection r1 = r0.getFragments()
            if (r1 == 0) goto L1a
            java.util.ArrayList r1 = new java.util.ArrayList
            java.util.Collection r0 = r0.getFragments()
            r1.<init>(r0)
            goto L1b
        L1a:
            r1 = 0
        L1b:
            return r1
    }

    @androidx.annotation.Nullable
    public android.os.Parcelable saveAllState() {
            r1 = this;
            androidx.fragment.app.FragmentHostCallback<?> r0 = r1.mHost
            androidx.fragment.app.FragmentManager r0 = r0.mFragmentManager
            android.os.Parcelable r0 = r0.saveAllState()
            return r0
    }
}
