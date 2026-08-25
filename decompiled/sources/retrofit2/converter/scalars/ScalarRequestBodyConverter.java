package retrofit2.converter.scalars;

/* JADX INFO: loaded from: classes3.dex */
final class ScalarRequestBodyConverter<T> implements retrofit2.Converter<T, okhttp3.RequestBody> {
    public static final retrofit2.converter.scalars.ScalarRequestBodyConverter<java.lang.Object> INSTANCE = null;
    private static final okhttp3.MediaType MEDIA_TYPE = null;

    static {
            retrofit2.converter.scalars.ScalarRequestBodyConverter r0 = new retrofit2.converter.scalars.ScalarRequestBodyConverter
            r0.<init>()
            retrofit2.converter.scalars.ScalarRequestBodyConverter.INSTANCE = r0
            java.lang.String r0 = "text/plain; charset=UTF-8"
            okhttp3.MediaType r0 = okhttp3.MediaType.get(r0)
            retrofit2.converter.scalars.ScalarRequestBodyConverter.MEDIA_TYPE = r0
            return
    }

    private ScalarRequestBodyConverter() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // retrofit2.Converter
    public /* bridge */ /* synthetic */ okhttp3.RequestBody convert(java.lang.Object r1) throws java.io.IOException {
            r0 = this;
            okhttp3.RequestBody r1 = r0.convert2(r1)
            return r1
    }

    @Override // retrofit2.Converter
    /* JADX INFO: renamed from: convert, reason: avoid collision after fix types in other method */
    public okhttp3.RequestBody convert2(T r2) throws java.io.IOException {
            r1 = this;
            okhttp3.MediaType r0 = retrofit2.converter.scalars.ScalarRequestBodyConverter.MEDIA_TYPE
            java.lang.String r2 = java.lang.String.valueOf(r2)
            okhttp3.RequestBody r2 = okhttp3.RequestBody.create(r0, r2)
            return r2
    }
}
