package androidx.recyclerview.widget;

/* JADX INFO: loaded from: classes.dex */
public class AsyncListDiffer<T> {
    private static final java.util.concurrent.Executor sMainThreadExecutor = null;
    public final androidx.recyclerview.widget.AsyncDifferConfig<T> mConfig;

    @androidx.annotation.Nullable
    private java.util.List<T> mList;
    private final java.util.List<androidx.recyclerview.widget.AsyncListDiffer.ListListener<T>> mListeners;
    public java.util.concurrent.Executor mMainThreadExecutor;
    public int mMaxScheduledGeneration;

    @androidx.annotation.NonNull
    private java.util.List<T> mReadOnlyList;
    private final androidx.recyclerview.widget.ListUpdateCallback mUpdateCallback;


    /* JADX INFO: loaded from: classes2.dex */
    public interface ListListener<T> {
        void onCurrentListChanged(@androidx.annotation.NonNull java.util.List<T> r1, @androidx.annotation.NonNull java.util.List<T> r2);
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static class MainThreadExecutor implements java.util.concurrent.Executor {
        public final android.os.Handler mHandler;

        public MainThreadExecutor() {
                r2 = this;
                r2.<init>()
                android.os.Handler r0 = new android.os.Handler
                android.os.Looper r1 = android.os.Looper.getMainLooper()
                r0.<init>(r1)
                r2.mHandler = r0
                return
        }

        @Override // java.util.concurrent.Executor
        public void execute(@androidx.annotation.NonNull java.lang.Runnable r2) {
                r1 = this;
                android.os.Handler r0 = r1.mHandler
                r0.post(r2)
                return
        }
    }

    static {
            androidx.recyclerview.widget.AsyncListDiffer$MainThreadExecutor r0 = new androidx.recyclerview.widget.AsyncListDiffer$MainThreadExecutor
            r0.<init>()
            androidx.recyclerview.widget.AsyncListDiffer.sMainThreadExecutor = r0
            return
    }

    public AsyncListDiffer(@androidx.annotation.NonNull androidx.recyclerview.widget.ListUpdateCallback r2, @androidx.annotation.NonNull androidx.recyclerview.widget.AsyncDifferConfig<T> r3) {
            r1 = this;
            r1.<init>()
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            r1.mListeners = r0
            java.util.List r0 = java.util.Collections.emptyList()
            r1.mReadOnlyList = r0
            r1.mUpdateCallback = r2
            r1.mConfig = r3
            java.util.concurrent.Executor r2 = r3.getMainThreadExecutor()
            if (r2 == 0) goto L21
            java.util.concurrent.Executor r2 = r3.getMainThreadExecutor()
            r1.mMainThreadExecutor = r2
            goto L25
        L21:
            java.util.concurrent.Executor r2 = androidx.recyclerview.widget.AsyncListDiffer.sMainThreadExecutor
            r1.mMainThreadExecutor = r2
        L25:
            return
    }

    public AsyncListDiffer(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.Adapter r2, @androidx.annotation.NonNull androidx.recyclerview.widget.DiffUtil.ItemCallback<T> r3) {
            r1 = this;
            androidx.recyclerview.widget.AdapterListUpdateCallback r0 = new androidx.recyclerview.widget.AdapterListUpdateCallback
            r0.<init>(r2)
            androidx.recyclerview.widget.AsyncDifferConfig$Builder r2 = new androidx.recyclerview.widget.AsyncDifferConfig$Builder
            r2.<init>(r3)
            androidx.recyclerview.widget.AsyncDifferConfig r2 = r2.build()
            r1.<init>(r0, r2)
            return
    }

    private void onCurrentListChanged(@androidx.annotation.NonNull java.util.List<T> r4, @androidx.annotation.Nullable java.lang.Runnable r5) {
            r3 = this;
            java.util.List<androidx.recyclerview.widget.AsyncListDiffer$ListListener<T>> r0 = r3.mListeners
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L18
            java.lang.Object r1 = r0.next()
            androidx.recyclerview.widget.AsyncListDiffer$ListListener r1 = (androidx.recyclerview.widget.AsyncListDiffer.ListListener) r1
            java.util.List<T> r2 = r3.mReadOnlyList
            r1.onCurrentListChanged(r4, r2)
            goto L6
        L18:
            if (r5 == 0) goto L1d
            r5.run()
        L1d:
            return
    }

    public void addListListener(@androidx.annotation.NonNull androidx.recyclerview.widget.AsyncListDiffer.ListListener<T> r2) {
            r1 = this;
            java.util.List<androidx.recyclerview.widget.AsyncListDiffer$ListListener<T>> r0 = r1.mListeners
            r0.add(r2)
            return
    }

    @androidx.annotation.NonNull
    public java.util.List<T> getCurrentList() {
            r1 = this;
            java.util.List<T> r0 = r1.mReadOnlyList
            return r0
    }

    public final void latchList(@androidx.annotation.NonNull java.util.List<T> r2, @androidx.annotation.NonNull androidx.recyclerview.widget.DiffUtil.DiffResult r3, @androidx.annotation.Nullable java.lang.Runnable r4) {
            r1 = this;
            java.util.List<T> r0 = r1.mReadOnlyList
            r1.mList = r2
            java.util.List r2 = java.util.Collections.unmodifiableList(r2)
            r1.mReadOnlyList = r2
            androidx.recyclerview.widget.ListUpdateCallback r2 = r1.mUpdateCallback
            r3.dispatchUpdatesTo(r2)
            r1.onCurrentListChanged(r0, r4)
            return
    }

    public void removeListListener(@androidx.annotation.NonNull androidx.recyclerview.widget.AsyncListDiffer.ListListener<T> r2) {
            r1 = this;
            java.util.List<androidx.recyclerview.widget.AsyncListDiffer$ListListener<T>> r0 = r1.mListeners
            r0.remove(r2)
            return
    }

    public void submitList(@androidx.annotation.Nullable java.util.List<T> r2) {
            r1 = this;
            r0 = 0
            r1.submitList(r2, r0)
            return
    }

    public void submitList(@androidx.annotation.Nullable java.util.List<T> r9, @androidx.annotation.Nullable java.lang.Runnable r10) {
            r8 = this;
            int r0 = r8.mMaxScheduledGeneration
            int r5 = r0 + 1
            r8.mMaxScheduledGeneration = r5
            java.util.List<T> r3 = r8.mList
            if (r9 != r3) goto L10
            if (r10 == 0) goto Lf
            r10.run()
        Lf:
            return
        L10:
            java.util.List<T> r0 = r8.mReadOnlyList
            r1 = 0
            if (r9 != 0) goto L2b
            int r9 = r3.size()
            r2 = 0
            r8.mList = r2
            java.util.List r2 = java.util.Collections.emptyList()
            r8.mReadOnlyList = r2
            androidx.recyclerview.widget.ListUpdateCallback r2 = r8.mUpdateCallback
            r2.onRemoved(r1, r9)
            r8.onCurrentListChanged(r0, r10)
            return
        L2b:
            if (r3 != 0) goto L42
            r8.mList = r9
            java.util.List r2 = java.util.Collections.unmodifiableList(r9)
            r8.mReadOnlyList = r2
            androidx.recyclerview.widget.ListUpdateCallback r2 = r8.mUpdateCallback
            int r9 = r9.size()
            r2.onInserted(r1, r9)
            r8.onCurrentListChanged(r0, r10)
            return
        L42:
            androidx.recyclerview.widget.AsyncDifferConfig<T> r0 = r8.mConfig
            java.util.concurrent.Executor r0 = r0.getBackgroundThreadExecutor()
            androidx.recyclerview.widget.AsyncListDiffer$1 r7 = new androidx.recyclerview.widget.AsyncListDiffer$1
            r1 = r7
            r2 = r8
            r4 = r9
            r6 = r10
            r1.<init>(r2, r3, r4, r5, r6)
            r0.execute(r7)
            return
    }
}
