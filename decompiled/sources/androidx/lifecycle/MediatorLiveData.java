package androidx.lifecycle;

/* JADX INFO: loaded from: classes.dex */
public class MediatorLiveData<T> extends androidx.lifecycle.MutableLiveData<T> {
    private androidx.arch.core.internal.SafeIterableMap<androidx.lifecycle.LiveData<?>, androidx.lifecycle.MediatorLiveData.Source<?>> mSources;

    public static class Source<V> implements androidx.lifecycle.Observer<V> {
        public final androidx.lifecycle.LiveData<V> mLiveData;
        public final androidx.lifecycle.Observer<? super V> mObserver;
        public int mVersion;

        public Source(androidx.lifecycle.LiveData<V> r2, androidx.lifecycle.Observer<? super V> r3) {
                r1 = this;
                r1.<init>()
                r0 = -1
                r1.mVersion = r0
                r1.mLiveData = r2
                r1.mObserver = r3
                return
        }

        @Override // androidx.lifecycle.Observer
        public void onChanged(@androidx.annotation.Nullable V r3) {
                r2 = this;
                int r0 = r2.mVersion
                androidx.lifecycle.LiveData<V> r1 = r2.mLiveData
                int r1 = r1.getVersion()
                if (r0 == r1) goto L17
                androidx.lifecycle.LiveData<V> r0 = r2.mLiveData
                int r0 = r0.getVersion()
                r2.mVersion = r0
                androidx.lifecycle.Observer<? super V> r0 = r2.mObserver
                r0.onChanged(r3)
            L17:
                return
        }
    }

    public MediatorLiveData() {
            r1 = this;
            r1.<init>()
            androidx.arch.core.internal.SafeIterableMap r0 = new androidx.arch.core.internal.SafeIterableMap
            r0.<init>()
            r1.mSources = r0
            return
    }

    @androidx.annotation.MainThread
    public <S> void addSource(@androidx.annotation.NonNull androidx.lifecycle.LiveData<S> r4, @androidx.annotation.NonNull androidx.lifecycle.Observer<? super S> r5) {
            r3 = this;
            androidx.lifecycle.MediatorLiveData$Source r0 = new androidx.lifecycle.MediatorLiveData$Source
            r0.<init>(r4, r5)
            androidx.arch.core.internal.SafeIterableMap<androidx.lifecycle.LiveData<?>, androidx.lifecycle.MediatorLiveData$Source<?>> r1 = r3.mSources
            java.lang.Object r1 = r1.putIfAbsent(r4, r0)
            androidx.lifecycle.MediatorLiveData$Source r1 = (androidx.lifecycle.MediatorLiveData.Source) r1
            if (r1 == 0) goto L1c
            androidx.lifecycle.Observer<? super V> r2 = r1.mObserver
            if (r2 != r5) goto L14
            goto L1c
        L14:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "This source was already added with the different observer"
            r4.<init>(r5)
            throw r4
        L1c:
            if (r1 == 0) goto L1f
            return
        L1f:
            boolean r5 = r3.hasActiveObservers()
            if (r5 == 0) goto L28
            r4.observeForever(r0)
        L28:
            return
    }

    @Override // androidx.lifecycle.LiveData
    @androidx.annotation.CallSuper
    public final void onActive() {
            r3 = this;
            androidx.arch.core.internal.SafeIterableMap<androidx.lifecycle.LiveData<?>, androidx.lifecycle.MediatorLiveData$Source<?>> r0 = r3.mSources
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1e
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r1 = r1.getValue()
            androidx.lifecycle.MediatorLiveData$Source r1 = (androidx.lifecycle.MediatorLiveData.Source) r1
            androidx.lifecycle.LiveData<V> r2 = r1.mLiveData
            r2.observeForever(r1)
            goto L6
        L1e:
            return
    }

    @Override // androidx.lifecycle.LiveData
    @androidx.annotation.CallSuper
    public final void onInactive() {
            r3 = this;
            androidx.arch.core.internal.SafeIterableMap<androidx.lifecycle.LiveData<?>, androidx.lifecycle.MediatorLiveData$Source<?>> r0 = r3.mSources
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1e
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r1 = r1.getValue()
            androidx.lifecycle.MediatorLiveData$Source r1 = (androidx.lifecycle.MediatorLiveData.Source) r1
            androidx.lifecycle.LiveData<V> r2 = r1.mLiveData
            r2.removeObserver(r1)
            goto L6
        L1e:
            return
    }

    @androidx.annotation.MainThread
    public <S> void removeSource(@androidx.annotation.NonNull androidx.lifecycle.LiveData<S> r2) {
            r1 = this;
            androidx.arch.core.internal.SafeIterableMap<androidx.lifecycle.LiveData<?>, androidx.lifecycle.MediatorLiveData$Source<?>> r0 = r1.mSources
            java.lang.Object r2 = r0.remove(r2)
            androidx.lifecycle.MediatorLiveData$Source r2 = (androidx.lifecycle.MediatorLiveData.Source) r2
            if (r2 == 0) goto Lf
            androidx.lifecycle.LiveData<V> r0 = r2.mLiveData
            r0.removeObserver(r2)
        Lf:
            return
    }
}
