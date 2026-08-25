package androidx.lifecycle;

/* JADX INFO: loaded from: classes.dex */
public class Transformations {



    private Transformations() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.MainThread
    public static <X, Y> androidx.lifecycle.LiveData<Y> map(@androidx.annotation.NonNull androidx.lifecycle.LiveData<X> r2, @androidx.annotation.NonNull androidx.arch.core.util.Function<X, Y> r3) {
            androidx.lifecycle.MediatorLiveData r0 = new androidx.lifecycle.MediatorLiveData
            r0.<init>()
            androidx.lifecycle.Transformations$1 r1 = new androidx.lifecycle.Transformations$1
            r1.<init>(r0, r3)
            r0.addSource(r2, r1)
            return r0
    }

    @androidx.annotation.MainThread
    public static <X, Y> androidx.lifecycle.LiveData<Y> switchMap(@androidx.annotation.NonNull androidx.lifecycle.LiveData<X> r2, @androidx.annotation.NonNull androidx.arch.core.util.Function<X, androidx.lifecycle.LiveData<Y>> r3) {
            androidx.lifecycle.MediatorLiveData r0 = new androidx.lifecycle.MediatorLiveData
            r0.<init>()
            androidx.lifecycle.Transformations$2 r1 = new androidx.lifecycle.Transformations$2
            r1.<init>(r3, r0)
            r0.addSource(r2, r1)
            return r0
    }
}
