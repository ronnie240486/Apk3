package retrofit2.converter.scalars;

/* JADX INFO: loaded from: classes2.dex */
final class ScalarResponseBodyConverters {

    public static final class BooleanResponseBodyConverter implements retrofit2.Converter<okhttp3.ResponseBody, java.lang.Boolean> {
        public static final retrofit2.converter.scalars.ScalarResponseBodyConverters.BooleanResponseBodyConverter INSTANCE = null;

        static {
                retrofit2.converter.scalars.ScalarResponseBodyConverters$BooleanResponseBodyConverter r0 = new retrofit2.converter.scalars.ScalarResponseBodyConverters$BooleanResponseBodyConverter
                r0.<init>()
                retrofit2.converter.scalars.ScalarResponseBodyConverters.BooleanResponseBodyConverter.INSTANCE = r0
                return
        }

        public BooleanResponseBodyConverter() {
                r0 = this;
                r0.<init>()
                return
        }

        /* JADX INFO: renamed from: convert, reason: avoid collision after fix types in other method */
        public java.lang.Boolean convert2(okhttp3.ResponseBody r1) throws java.io.IOException {
                r0 = this;
                java.lang.String r1 = r1.string()
                java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
                return r1
        }

        @Override // retrofit2.Converter
        public /* bridge */ /* synthetic */ java.lang.Boolean convert(okhttp3.ResponseBody r1) throws java.io.IOException {
                r0 = this;
                okhttp3.ResponseBody r1 = (okhttp3.ResponseBody) r1
                java.lang.Boolean r1 = r0.convert2(r1)
                return r1
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    public static final class ByteResponseBodyConverter implements retrofit2.Converter<okhttp3.ResponseBody, java.lang.Byte> {
        public static final retrofit2.converter.scalars.ScalarResponseBodyConverters.ByteResponseBodyConverter INSTANCE = null;

        static {
                retrofit2.converter.scalars.ScalarResponseBodyConverters$ByteResponseBodyConverter r0 = new retrofit2.converter.scalars.ScalarResponseBodyConverters$ByteResponseBodyConverter
                r0.<init>()
                retrofit2.converter.scalars.ScalarResponseBodyConverters.ByteResponseBodyConverter.INSTANCE = r0
                return
        }

        public ByteResponseBodyConverter() {
                r0 = this;
                r0.<init>()
                return
        }

        /* JADX INFO: renamed from: convert, reason: avoid collision after fix types in other method */
        public java.lang.Byte convert2(okhttp3.ResponseBody r1) throws java.io.IOException {
                r0 = this;
                java.lang.String r1 = r1.string()
                java.lang.Byte r1 = java.lang.Byte.valueOf(r1)
                return r1
        }

        @Override // retrofit2.Converter
        public /* bridge */ /* synthetic */ java.lang.Byte convert(okhttp3.ResponseBody r1) throws java.io.IOException {
                r0 = this;
                okhttp3.ResponseBody r1 = (okhttp3.ResponseBody) r1
                java.lang.Byte r1 = r0.convert2(r1)
                return r1
        }
    }

    public static final class CharacterResponseBodyConverter implements retrofit2.Converter<okhttp3.ResponseBody, java.lang.Character> {
        public static final retrofit2.converter.scalars.ScalarResponseBodyConverters.CharacterResponseBodyConverter INSTANCE = null;

        static {
                retrofit2.converter.scalars.ScalarResponseBodyConverters$CharacterResponseBodyConverter r0 = new retrofit2.converter.scalars.ScalarResponseBodyConverters$CharacterResponseBodyConverter
                r0.<init>()
                retrofit2.converter.scalars.ScalarResponseBodyConverters.CharacterResponseBodyConverter.INSTANCE = r0
                return
        }

        public CharacterResponseBodyConverter() {
                r0 = this;
                r0.<init>()
                return
        }

        /* JADX INFO: renamed from: convert, reason: avoid collision after fix types in other method */
        public java.lang.Character convert2(okhttp3.ResponseBody r3) throws java.io.IOException {
                r2 = this;
                java.lang.String r3 = r3.string()
                int r0 = r3.length()
                r1 = 1
                if (r0 != r1) goto L15
                r0 = 0
                char r3 = r3.charAt(r0)
                java.lang.Character r3 = java.lang.Character.valueOf(r3)
                return r3
            L15:
                java.io.IOException r0 = new java.io.IOException
                java.lang.String r1 = "Expected body of length 1 for Character conversion but was "
                java.lang.StringBuilder r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1)
                int r3 = r3.length()
                r1.append(r3)
                java.lang.String r3 = r1.toString()
                r0.<init>(r3)
                throw r0
        }

        @Override // retrofit2.Converter
        public /* bridge */ /* synthetic */ java.lang.Character convert(okhttp3.ResponseBody r1) throws java.io.IOException {
                r0 = this;
                okhttp3.ResponseBody r1 = (okhttp3.ResponseBody) r1
                java.lang.Character r1 = r0.convert2(r1)
                return r1
        }
    }

    public static final class DoubleResponseBodyConverter implements retrofit2.Converter<okhttp3.ResponseBody, java.lang.Double> {
        public static final retrofit2.converter.scalars.ScalarResponseBodyConverters.DoubleResponseBodyConverter INSTANCE = null;

        static {
                retrofit2.converter.scalars.ScalarResponseBodyConverters$DoubleResponseBodyConverter r0 = new retrofit2.converter.scalars.ScalarResponseBodyConverters$DoubleResponseBodyConverter
                r0.<init>()
                retrofit2.converter.scalars.ScalarResponseBodyConverters.DoubleResponseBodyConverter.INSTANCE = r0
                return
        }

        public DoubleResponseBodyConverter() {
                r0 = this;
                r0.<init>()
                return
        }

        /* JADX INFO: renamed from: convert, reason: avoid collision after fix types in other method */
        public java.lang.Double convert2(okhttp3.ResponseBody r1) throws java.io.IOException {
                r0 = this;
                java.lang.String r1 = r1.string()
                java.lang.Double r1 = java.lang.Double.valueOf(r1)
                return r1
        }

        @Override // retrofit2.Converter
        public /* bridge */ /* synthetic */ java.lang.Double convert(okhttp3.ResponseBody r1) throws java.io.IOException {
                r0 = this;
                okhttp3.ResponseBody r1 = (okhttp3.ResponseBody) r1
                java.lang.Double r1 = r0.convert2(r1)
                return r1
        }
    }

    public static final class FloatResponseBodyConverter implements retrofit2.Converter<okhttp3.ResponseBody, java.lang.Float> {
        public static final retrofit2.converter.scalars.ScalarResponseBodyConverters.FloatResponseBodyConverter INSTANCE = null;

        static {
                retrofit2.converter.scalars.ScalarResponseBodyConverters$FloatResponseBodyConverter r0 = new retrofit2.converter.scalars.ScalarResponseBodyConverters$FloatResponseBodyConverter
                r0.<init>()
                retrofit2.converter.scalars.ScalarResponseBodyConverters.FloatResponseBodyConverter.INSTANCE = r0
                return
        }

        public FloatResponseBodyConverter() {
                r0 = this;
                r0.<init>()
                return
        }

        /* JADX INFO: renamed from: convert, reason: avoid collision after fix types in other method */
        public java.lang.Float convert2(okhttp3.ResponseBody r1) throws java.io.IOException {
                r0 = this;
                java.lang.String r1 = r1.string()
                java.lang.Float r1 = java.lang.Float.valueOf(r1)
                return r1
        }

        @Override // retrofit2.Converter
        public /* bridge */ /* synthetic */ java.lang.Float convert(okhttp3.ResponseBody r1) throws java.io.IOException {
                r0 = this;
                okhttp3.ResponseBody r1 = (okhttp3.ResponseBody) r1
                java.lang.Float r1 = r0.convert2(r1)
                return r1
        }
    }

    public static final class IntegerResponseBodyConverter implements retrofit2.Converter<okhttp3.ResponseBody, java.lang.Integer> {
        public static final retrofit2.converter.scalars.ScalarResponseBodyConverters.IntegerResponseBodyConverter INSTANCE = null;

        static {
                retrofit2.converter.scalars.ScalarResponseBodyConverters$IntegerResponseBodyConverter r0 = new retrofit2.converter.scalars.ScalarResponseBodyConverters$IntegerResponseBodyConverter
                r0.<init>()
                retrofit2.converter.scalars.ScalarResponseBodyConverters.IntegerResponseBodyConverter.INSTANCE = r0
                return
        }

        public IntegerResponseBodyConverter() {
                r0 = this;
                r0.<init>()
                return
        }

        /* JADX INFO: renamed from: convert, reason: avoid collision after fix types in other method */
        public java.lang.Integer convert2(okhttp3.ResponseBody r1) throws java.io.IOException {
                r0 = this;
                java.lang.String r1 = r1.string()
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                return r1
        }

        @Override // retrofit2.Converter
        public /* bridge */ /* synthetic */ java.lang.Integer convert(okhttp3.ResponseBody r1) throws java.io.IOException {
                r0 = this;
                okhttp3.ResponseBody r1 = (okhttp3.ResponseBody) r1
                java.lang.Integer r1 = r0.convert2(r1)
                return r1
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    public static final class LongResponseBodyConverter implements retrofit2.Converter<okhttp3.ResponseBody, java.lang.Long> {
        public static final retrofit2.converter.scalars.ScalarResponseBodyConverters.LongResponseBodyConverter INSTANCE = null;

        static {
                retrofit2.converter.scalars.ScalarResponseBodyConverters$LongResponseBodyConverter r0 = new retrofit2.converter.scalars.ScalarResponseBodyConverters$LongResponseBodyConverter
                r0.<init>()
                retrofit2.converter.scalars.ScalarResponseBodyConverters.LongResponseBodyConverter.INSTANCE = r0
                return
        }

        public LongResponseBodyConverter() {
                r0 = this;
                r0.<init>()
                return
        }

        /* JADX INFO: renamed from: convert, reason: avoid collision after fix types in other method */
        public java.lang.Long convert2(okhttp3.ResponseBody r1) throws java.io.IOException {
                r0 = this;
                java.lang.String r1 = r1.string()
                java.lang.Long r1 = java.lang.Long.valueOf(r1)
                return r1
        }

        @Override // retrofit2.Converter
        public /* bridge */ /* synthetic */ java.lang.Long convert(okhttp3.ResponseBody r1) throws java.io.IOException {
                r0 = this;
                okhttp3.ResponseBody r1 = (okhttp3.ResponseBody) r1
                java.lang.Long r1 = r0.convert2(r1)
                return r1
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    public static final class ShortResponseBodyConverter implements retrofit2.Converter<okhttp3.ResponseBody, java.lang.Short> {
        public static final retrofit2.converter.scalars.ScalarResponseBodyConverters.ShortResponseBodyConverter INSTANCE = null;

        static {
                retrofit2.converter.scalars.ScalarResponseBodyConverters$ShortResponseBodyConverter r0 = new retrofit2.converter.scalars.ScalarResponseBodyConverters$ShortResponseBodyConverter
                r0.<init>()
                retrofit2.converter.scalars.ScalarResponseBodyConverters.ShortResponseBodyConverter.INSTANCE = r0
                return
        }

        public ShortResponseBodyConverter() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // retrofit2.Converter
        public /* bridge */ /* synthetic */ java.lang.Short convert(okhttp3.ResponseBody r1) throws java.io.IOException {
                r0 = this;
                okhttp3.ResponseBody r1 = (okhttp3.ResponseBody) r1
                java.lang.Short r1 = r0.convert2(r1)
                return r1
        }

        /* JADX INFO: renamed from: convert, reason: avoid collision after fix types in other method */
        public java.lang.Short convert2(okhttp3.ResponseBody r1) throws java.io.IOException {
                r0 = this;
                java.lang.String r1 = r1.string()
                java.lang.Short r1 = java.lang.Short.valueOf(r1)
                return r1
        }
    }

    public static final class StringResponseBodyConverter implements retrofit2.Converter<okhttp3.ResponseBody, java.lang.String> {
        public static final retrofit2.converter.scalars.ScalarResponseBodyConverters.StringResponseBodyConverter INSTANCE = null;

        static {
                retrofit2.converter.scalars.ScalarResponseBodyConverters$StringResponseBodyConverter r0 = new retrofit2.converter.scalars.ScalarResponseBodyConverters$StringResponseBodyConverter
                r0.<init>()
                retrofit2.converter.scalars.ScalarResponseBodyConverters.StringResponseBodyConverter.INSTANCE = r0
                return
        }

        public StringResponseBodyConverter() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // retrofit2.Converter
        public /* bridge */ /* synthetic */ java.lang.String convert(okhttp3.ResponseBody r1) throws java.io.IOException {
                r0 = this;
                okhttp3.ResponseBody r1 = (okhttp3.ResponseBody) r1
                java.lang.String r1 = r0.convert2(r1)
                return r1
        }

        /* JADX INFO: renamed from: convert, reason: avoid collision after fix types in other method */
        public java.lang.String convert2(okhttp3.ResponseBody r1) throws java.io.IOException {
                r0 = this;
                java.lang.String r1 = r1.string()
                return r1
        }
    }

    private ScalarResponseBodyConverters() {
            r0 = this;
            r0.<init>()
            return
    }
}
