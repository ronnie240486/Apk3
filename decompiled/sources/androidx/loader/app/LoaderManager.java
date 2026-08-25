package androidx.loader.app;

/* JADX INFO: loaded from: classes.dex */
public abstract class LoaderManager {

    public interface LoaderCallbacks<D> {
        @androidx.annotation.NonNull
        @androidx.annotation.MainThread
        androidx.loader.content.Loader<D> onCreateLoader(int r1, @androidx.annotation.Nullable android.os.Bundle r2);

        @androidx.annotation.MainThread
        void onLoadFinished(@androidx.annotation.NonNull androidx.loader.content.Loader<D> r1, D r2);

        @androidx.annotation.MainThread
        void onLoaderReset(@androidx.annotation.NonNull androidx.loader.content.Loader<D> r1);
    }

    public LoaderManager() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void enableDebugLogging(boolean r0) {
            androidx.loader.app.LoaderManagerImpl.DEBUG = r0
            return
    }

    @androidx.annotation.NonNull
    public static <T extends androidx.lifecycle.LifecycleOwner & androidx.lifecycle.ViewModelStoreOwner> androidx.loader.app.LoaderManager getInstance(@androidx.annotation.NonNull T r2) {
            androidx.loader.app.LoaderManagerImpl r0 = new androidx.loader.app.LoaderManagerImpl
            r1 = r2
            androidx.lifecycle.ViewModelStoreOwner r1 = (androidx.lifecycle.ViewModelStoreOwner) r1
            androidx.lifecycle.ViewModelStore r1 = r1.getViewModelStore()
            r0.<init>(r2, r1)
            return r0
    }

    @androidx.annotation.MainThread
    public abstract void destroyLoader(int r1);

    @java.lang.Deprecated
    public abstract void dump(java.lang.String r1, java.io.FileDescriptor r2, java.io.PrintWriter r3, java.lang.String[] r4);

    @androidx.annotation.Nullable
    public abstract <D> androidx.loader.content.Loader<D> getLoader(int r1);

    public boolean hasRunningLoaders() {
            r1 = this;
            r0 = 0
            return r0
    }

    @androidx.annotation.NonNull
    @androidx.annotation.MainThread
    public abstract <D> androidx.loader.content.Loader<D> initLoader(int r1, @androidx.annotation.Nullable android.os.Bundle r2, @androidx.annotation.NonNull androidx.loader.app.LoaderManager.LoaderCallbacks<D> r3);

    public abstract void markForRedelivery();

    @androidx.annotation.NonNull
    @androidx.annotation.MainThread
    public abstract <D> androidx.loader.content.Loader<D> restartLoader(int r1, @androidx.annotation.Nullable android.os.Bundle r2, @androidx.annotation.NonNull androidx.loader.app.LoaderManager.LoaderCallbacks<D> r3);
}
