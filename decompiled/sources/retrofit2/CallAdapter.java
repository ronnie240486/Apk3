package retrofit2;

/* JADX INFO: loaded from: classes2.dex */
public interface CallAdapter<R, T> {

    /* JADX INFO: loaded from: classes3.dex */
    public static abstract class Factory {
        public Factory() {
                r0 = this;
                r0.<init>()
                return
        }

        @javax.annotation.Nullable
        public abstract retrofit2.CallAdapter<?, ?> get(java.lang.reflect.Type r1, java.lang.annotation.Annotation[] r2, retrofit2.Retrofit r3);
    }

    T adapt(retrofit2.Call<R> r1);

    java.lang.reflect.Type responseType();
}
