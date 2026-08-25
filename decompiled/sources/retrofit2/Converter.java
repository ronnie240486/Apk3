package retrofit2;

/* JADX INFO: loaded from: classes2.dex */
public interface Converter<F, T> {

    /* JADX INFO: loaded from: classes3.dex */
    public static abstract class Factory {
        public Factory() {
                r0 = this;
                r0.<init>()
                return
        }

        @javax.annotation.Nullable
        public retrofit2.Converter<?, okhttp3.RequestBody> requestBodyConverter(java.lang.reflect.Type r1, java.lang.annotation.Annotation[] r2, java.lang.annotation.Annotation[] r3, retrofit2.Retrofit r4) {
                r0 = this;
                r1 = 0
                return r1
        }

        @javax.annotation.Nullable
        public retrofit2.Converter<okhttp3.ResponseBody, ?> responseBodyConverter(java.lang.reflect.Type r1, java.lang.annotation.Annotation[] r2, retrofit2.Retrofit r3) {
                r0 = this;
                r1 = 0
                return r1
        }

        @javax.annotation.Nullable
        public retrofit2.Converter<?, java.lang.String> stringConverter(java.lang.reflect.Type r1, java.lang.annotation.Annotation[] r2, retrofit2.Retrofit r3) {
                r0 = this;
                r1 = 0
                return r1
        }
    }

    @javax.annotation.Nullable
    T convert(F r1) throws java.io.IOException;
}
