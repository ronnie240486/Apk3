package retrofit2.converter.scalars;

/* JADX INFO: loaded from: classes2.dex */
public final class ScalarsConverterFactory extends retrofit2.Converter.Factory {
    private ScalarsConverterFactory() {
            r0 = this;
            r0.<init>()
            return
    }

    public static retrofit2.converter.scalars.ScalarsConverterFactory create() {
            retrofit2.converter.scalars.ScalarsConverterFactory r0 = new retrofit2.converter.scalars.ScalarsConverterFactory
            r0.<init>()
            return r0
    }

    @Override // retrofit2.Converter.Factory
    @javax.annotation.Nullable
    public retrofit2.Converter<?, okhttp3.RequestBody> requestBodyConverter(java.lang.reflect.Type r1, java.lang.annotation.Annotation[] r2, java.lang.annotation.Annotation[] r3, retrofit2.Retrofit r4) {
            r0 = this;
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            if (r1 == r2) goto L47
            java.lang.Class r2 = java.lang.Boolean.TYPE
            if (r1 == r2) goto L47
            java.lang.Class<java.lang.Boolean> r2 = java.lang.Boolean.class
            if (r1 == r2) goto L47
            java.lang.Class r2 = java.lang.Byte.TYPE
            if (r1 == r2) goto L47
            java.lang.Class<java.lang.Byte> r2 = java.lang.Byte.class
            if (r1 == r2) goto L47
            java.lang.Class r2 = java.lang.Character.TYPE
            if (r1 == r2) goto L47
            java.lang.Class<java.lang.Character> r2 = java.lang.Character.class
            if (r1 == r2) goto L47
            java.lang.Class r2 = java.lang.Double.TYPE
            if (r1 == r2) goto L47
            java.lang.Class<java.lang.Double> r2 = java.lang.Double.class
            if (r1 == r2) goto L47
            java.lang.Class r2 = java.lang.Float.TYPE
            if (r1 == r2) goto L47
            java.lang.Class<java.lang.Float> r2 = java.lang.Float.class
            if (r1 == r2) goto L47
            java.lang.Class r2 = java.lang.Integer.TYPE
            if (r1 == r2) goto L47
            java.lang.Class<java.lang.Integer> r2 = java.lang.Integer.class
            if (r1 == r2) goto L47
            java.lang.Class r2 = java.lang.Long.TYPE
            if (r1 == r2) goto L47
            java.lang.Class<java.lang.Long> r2 = java.lang.Long.class
            if (r1 == r2) goto L47
            java.lang.Class r2 = java.lang.Short.TYPE
            if (r1 == r2) goto L47
            java.lang.Class<java.lang.Short> r2 = java.lang.Short.class
            if (r1 != r2) goto L45
            goto L47
        L45:
            r1 = 0
            return r1
        L47:
            retrofit2.converter.scalars.ScalarRequestBodyConverter<java.lang.Object> r1 = retrofit2.converter.scalars.ScalarRequestBodyConverter.INSTANCE
            return r1
    }

    @Override // retrofit2.Converter.Factory
    @javax.annotation.Nullable
    public retrofit2.Converter<okhttp3.ResponseBody, ?> responseBodyConverter(java.lang.reflect.Type r1, java.lang.annotation.Annotation[] r2, retrofit2.Retrofit r3) {
            r0 = this;
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            if (r1 != r2) goto L7
            retrofit2.converter.scalars.ScalarResponseBodyConverters$StringResponseBodyConverter r1 = retrofit2.converter.scalars.ScalarResponseBodyConverters.StringResponseBodyConverter.INSTANCE
            return r1
        L7:
            java.lang.Class<java.lang.Boolean> r2 = java.lang.Boolean.class
            if (r1 == r2) goto L66
            java.lang.Class r2 = java.lang.Boolean.TYPE
            if (r1 != r2) goto L10
            goto L66
        L10:
            java.lang.Class<java.lang.Byte> r2 = java.lang.Byte.class
            if (r1 == r2) goto L63
            java.lang.Class r2 = java.lang.Byte.TYPE
            if (r1 != r2) goto L19
            goto L63
        L19:
            java.lang.Class<java.lang.Character> r2 = java.lang.Character.class
            if (r1 == r2) goto L60
            java.lang.Class r2 = java.lang.Character.TYPE
            if (r1 != r2) goto L22
            goto L60
        L22:
            java.lang.Class<java.lang.Double> r2 = java.lang.Double.class
            if (r1 == r2) goto L5d
            java.lang.Class r2 = java.lang.Double.TYPE
            if (r1 != r2) goto L2b
            goto L5d
        L2b:
            java.lang.Class<java.lang.Float> r2 = java.lang.Float.class
            if (r1 == r2) goto L5a
            java.lang.Class r2 = java.lang.Float.TYPE
            if (r1 != r2) goto L34
            goto L5a
        L34:
            java.lang.Class<java.lang.Integer> r2 = java.lang.Integer.class
            if (r1 == r2) goto L57
            java.lang.Class r2 = java.lang.Integer.TYPE
            if (r1 != r2) goto L3d
            goto L57
        L3d:
            java.lang.Class<java.lang.Long> r2 = java.lang.Long.class
            if (r1 == r2) goto L54
            java.lang.Class r2 = java.lang.Long.TYPE
            if (r1 != r2) goto L46
            goto L54
        L46:
            java.lang.Class<java.lang.Short> r2 = java.lang.Short.class
            if (r1 == r2) goto L51
            java.lang.Class r2 = java.lang.Short.TYPE
            if (r1 != r2) goto L4f
            goto L51
        L4f:
            r1 = 0
            return r1
        L51:
            retrofit2.converter.scalars.ScalarResponseBodyConverters$ShortResponseBodyConverter r1 = retrofit2.converter.scalars.ScalarResponseBodyConverters.ShortResponseBodyConverter.INSTANCE
            return r1
        L54:
            retrofit2.converter.scalars.ScalarResponseBodyConverters$LongResponseBodyConverter r1 = retrofit2.converter.scalars.ScalarResponseBodyConverters.LongResponseBodyConverter.INSTANCE
            return r1
        L57:
            retrofit2.converter.scalars.ScalarResponseBodyConverters$IntegerResponseBodyConverter r1 = retrofit2.converter.scalars.ScalarResponseBodyConverters.IntegerResponseBodyConverter.INSTANCE
            return r1
        L5a:
            retrofit2.converter.scalars.ScalarResponseBodyConverters$FloatResponseBodyConverter r1 = retrofit2.converter.scalars.ScalarResponseBodyConverters.FloatResponseBodyConverter.INSTANCE
            return r1
        L5d:
            retrofit2.converter.scalars.ScalarResponseBodyConverters$DoubleResponseBodyConverter r1 = retrofit2.converter.scalars.ScalarResponseBodyConverters.DoubleResponseBodyConverter.INSTANCE
            return r1
        L60:
            retrofit2.converter.scalars.ScalarResponseBodyConverters$CharacterResponseBodyConverter r1 = retrofit2.converter.scalars.ScalarResponseBodyConverters.CharacterResponseBodyConverter.INSTANCE
            return r1
        L63:
            retrofit2.converter.scalars.ScalarResponseBodyConverters$ByteResponseBodyConverter r1 = retrofit2.converter.scalars.ScalarResponseBodyConverters.ByteResponseBodyConverter.INSTANCE
            return r1
        L66:
            retrofit2.converter.scalars.ScalarResponseBodyConverters$BooleanResponseBodyConverter r1 = retrofit2.converter.scalars.ScalarResponseBodyConverters.BooleanResponseBodyConverter.INSTANCE
            return r1
    }
}
