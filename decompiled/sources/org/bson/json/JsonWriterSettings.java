package org.bson.json;

/* JADX INFO: loaded from: classes2.dex */
public class JsonWriterSettings extends org.bson.BsonWriterSettings {
    private static final org.bson.json.ExtendedJsonBinaryConverter EXTENDED_JSON_BINARY_CONVERTER = null;
    private static final org.bson.json.ExtendedJsonDateTimeConverter EXTENDED_JSON_DATE_TIME_CONVERTER = null;
    private static final org.bson.json.ExtendedJsonDecimal128Converter EXTENDED_JSON_DECIMAL_128_CONVERTER = null;
    private static final org.bson.json.ExtendedJsonDoubleConverter EXTENDED_JSON_DOUBLE_CONVERTER = null;
    private static final org.bson.json.ExtendedJsonInt32Converter EXTENDED_JSON_INT_32_CONVERTER = null;
    private static final org.bson.json.ExtendedJsonInt64Converter EXTENDED_JSON_INT_64_CONVERTER = null;
    private static final org.bson.json.ExtendedJsonMaxKeyConverter EXTENDED_JSON_MAX_KEY_CONVERTER = null;
    private static final org.bson.json.ExtendedJsonMinKeyConverter EXTENDED_JSON_MIN_KEY_CONVERTER = null;
    private static final org.bson.json.ExtendedJsonObjectIdConverter EXTENDED_JSON_OBJECT_ID_CONVERTER = null;
    private static final org.bson.json.ExtendedJsonRegularExpressionConverter EXTENDED_JSON_REGULAR_EXPRESSION_CONVERTER = null;
    private static final org.bson.json.ExtendedJsonTimestampConverter EXTENDED_JSON_TIMESTAMP_CONVERTER = null;
    private static final org.bson.json.ExtendedJsonUndefinedConverter EXTENDED_JSON_UNDEFINED_CONVERTER = null;
    private static final org.bson.json.JsonBooleanConverter JSON_BOOLEAN_CONVERTER = null;
    private static final org.bson.json.JsonDoubleConverter JSON_DOUBLE_CONVERTER = null;
    private static final org.bson.json.JsonInt32Converter JSON_INT_32_CONVERTER = null;
    private static final org.bson.json.JsonNullConverter JSON_NULL_CONVERTER = null;
    private static final org.bson.json.JsonStringConverter JSON_STRING_CONVERTER = null;
    private static final org.bson.json.JsonSymbolConverter JSON_SYMBOL_CONVERTER = null;
    private static final org.bson.json.LegacyExtendedJsonBinaryConverter LEGACY_EXTENDED_JSON_BINARY_CONVERTER = null;
    private static final org.bson.json.LegacyExtendedJsonDateTimeConverter LEGACY_EXTENDED_JSON_DATE_TIME_CONVERTER = null;
    private static final org.bson.json.LegacyExtendedJsonRegularExpressionConverter LEGACY_EXTENDED_JSON_REGULAR_EXPRESSION_CONVERTER = null;
    private static final org.bson.json.RelaxedExtendedJsonDateTimeConverter RELAXED_EXTENDED_JSON_DATE_TIME_CONVERTER = null;
    private static final org.bson.json.RelaxedExtendedJsonDoubleConverter RELAXED_EXTENDED_JSON_DOUBLE_CONVERTER = null;
    private static final org.bson.json.RelaxedExtendedJsonInt64Converter RELAXED_JSON_INT_64_CONVERTER = null;
    private static final org.bson.json.ShellBinaryConverter SHELL_BINARY_CONVERTER = null;
    private static final org.bson.json.ShellDateTimeConverter SHELL_DATE_TIME_CONVERTER = null;
    private static final org.bson.json.ShellDecimal128Converter SHELL_DECIMAL_128_CONVERTER = null;
    private static final org.bson.json.ShellInt64Converter SHELL_INT_64_CONVERTER = null;
    private static final org.bson.json.ShellMaxKeyConverter SHELL_MAX_KEY_CONVERTER = null;
    private static final org.bson.json.ShellMinKeyConverter SHELL_MIN_KEY_CONVERTER = null;
    private static final org.bson.json.ShellObjectIdConverter SHELL_OBJECT_ID_CONVERTER = null;
    private static final org.bson.json.ShellRegularExpressionConverter SHELL_REGULAR_EXPRESSION_CONVERTER = null;
    private static final org.bson.json.ShellTimestampConverter SHELL_TIMESTAMP_CONVERTER = null;
    private static final org.bson.json.ShellUndefinedConverter SHELL_UNDEFINED_CONVERTER = null;
    private final org.bson.json.Converter<org.bson.BsonBinary> binaryConverter;
    private final org.bson.json.Converter<java.lang.Boolean> booleanConverter;
    private final org.bson.json.Converter<java.lang.Long> dateTimeConverter;
    private final org.bson.json.Converter<org.bson.types.Decimal128> decimal128Converter;
    private final org.bson.json.Converter<java.lang.Double> doubleConverter;
    private final boolean indent;
    private final java.lang.String indentCharacters;
    private final org.bson.json.Converter<java.lang.Integer> int32Converter;
    private final org.bson.json.Converter<java.lang.Long> int64Converter;
    private final org.bson.json.Converter<java.lang.String> javaScriptConverter;
    private final org.bson.json.Converter<org.bson.BsonMaxKey> maxKeyConverter;
    private final int maxLength;
    private final org.bson.json.Converter<org.bson.BsonMinKey> minKeyConverter;
    private final java.lang.String newLineCharacters;
    private final org.bson.json.Converter<org.bson.BsonNull> nullConverter;
    private final org.bson.json.Converter<org.bson.types.ObjectId> objectIdConverter;
    private final org.bson.json.JsonMode outputMode;
    private final org.bson.json.Converter<org.bson.BsonRegularExpression> regularExpressionConverter;
    private final org.bson.json.Converter<java.lang.String> stringConverter;
    private final org.bson.json.Converter<java.lang.String> symbolConverter;
    private final org.bson.json.Converter<org.bson.BsonTimestamp> timestampConverter;
    private final org.bson.json.Converter<org.bson.BsonUndefined> undefinedConverter;

    /* JADX INFO: renamed from: org.bson.json.JsonWriterSettings$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    /* JADX INFO: loaded from: classes3.dex */
    public static final class Builder {
        private org.bson.json.Converter<org.bson.BsonBinary> binaryConverter;
        private org.bson.json.Converter<java.lang.Boolean> booleanConverter;
        private org.bson.json.Converter<java.lang.Long> dateTimeConverter;
        private org.bson.json.Converter<org.bson.types.Decimal128> decimal128Converter;
        private org.bson.json.Converter<java.lang.Double> doubleConverter;
        private boolean indent;
        private java.lang.String indentCharacters;
        private org.bson.json.Converter<java.lang.Integer> int32Converter;
        private org.bson.json.Converter<java.lang.Long> int64Converter;
        private org.bson.json.Converter<java.lang.String> javaScriptConverter;
        private org.bson.json.Converter<org.bson.BsonMaxKey> maxKeyConverter;
        private int maxLength;
        private org.bson.json.Converter<org.bson.BsonMinKey> minKeyConverter;
        private java.lang.String newLineCharacters;
        private org.bson.json.Converter<org.bson.BsonNull> nullConverter;
        private org.bson.json.Converter<org.bson.types.ObjectId> objectIdConverter;
        private org.bson.json.JsonMode outputMode;
        private org.bson.json.Converter<org.bson.BsonRegularExpression> regularExpressionConverter;
        private org.bson.json.Converter<java.lang.String> stringConverter;
        private org.bson.json.Converter<java.lang.String> symbolConverter;
        private org.bson.json.Converter<org.bson.BsonTimestamp> timestampConverter;
        private org.bson.json.Converter<org.bson.BsonUndefined> undefinedConverter;

        private Builder() {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = "line.separator"
                java.lang.String r0 = java.lang.System.getProperty(r0)
                r1.newLineCharacters = r0
                java.lang.String r0 = "  "
                r1.indentCharacters = r0
                org.bson.json.JsonMode r0 = org.bson.json.JsonMode.RELAXED
                r1.outputMode = r0
                return
        }

        public /* synthetic */ Builder(org.bson.json.JsonWriterSettings.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public static /* synthetic */ boolean access$100(org.bson.json.JsonWriterSettings.Builder r0) {
                boolean r0 = r0.indent
                return r0
        }

        public static /* synthetic */ org.bson.json.Converter access$1000(org.bson.json.JsonWriterSettings.Builder r0) {
                org.bson.json.Converter<java.lang.Integer> r0 = r0.int32Converter
                return r0
        }

        public static /* synthetic */ org.bson.json.Converter access$1100(org.bson.json.JsonWriterSettings.Builder r0) {
                org.bson.json.Converter<java.lang.String> r0 = r0.symbolConverter
                return r0
        }

        public static /* synthetic */ org.bson.json.Converter access$1200(org.bson.json.JsonWriterSettings.Builder r0) {
                org.bson.json.Converter<java.lang.String> r0 = r0.javaScriptConverter
                return r0
        }

        public static /* synthetic */ org.bson.json.Converter access$1300(org.bson.json.JsonWriterSettings.Builder r0) {
                org.bson.json.Converter<org.bson.BsonMinKey> r0 = r0.minKeyConverter
                return r0
        }

        public static /* synthetic */ org.bson.json.Converter access$1400(org.bson.json.JsonWriterSettings.Builder r0) {
                org.bson.json.Converter<org.bson.BsonMaxKey> r0 = r0.maxKeyConverter
                return r0
        }

        public static /* synthetic */ org.bson.json.Converter access$1500(org.bson.json.JsonWriterSettings.Builder r0) {
                org.bson.json.Converter<org.bson.BsonUndefined> r0 = r0.undefinedConverter
                return r0
        }

        public static /* synthetic */ org.bson.json.Converter access$1600(org.bson.json.JsonWriterSettings.Builder r0) {
                org.bson.json.Converter<java.lang.Long> r0 = r0.dateTimeConverter
                return r0
        }

        public static /* synthetic */ org.bson.json.Converter access$1700(org.bson.json.JsonWriterSettings.Builder r0) {
                org.bson.json.Converter<org.bson.BsonBinary> r0 = r0.binaryConverter
                return r0
        }

        public static /* synthetic */ org.bson.json.Converter access$1800(org.bson.json.JsonWriterSettings.Builder r0) {
                org.bson.json.Converter<java.lang.Long> r0 = r0.int64Converter
                return r0
        }

        public static /* synthetic */ org.bson.json.Converter access$1900(org.bson.json.JsonWriterSettings.Builder r0) {
                org.bson.json.Converter<org.bson.types.Decimal128> r0 = r0.decimal128Converter
                return r0
        }

        public static /* synthetic */ java.lang.String access$200(org.bson.json.JsonWriterSettings.Builder r0) {
                java.lang.String r0 = r0.newLineCharacters
                return r0
        }

        public static /* synthetic */ org.bson.json.Converter access$2000(org.bson.json.JsonWriterSettings.Builder r0) {
                org.bson.json.Converter<org.bson.types.ObjectId> r0 = r0.objectIdConverter
                return r0
        }

        public static /* synthetic */ org.bson.json.Converter access$2100(org.bson.json.JsonWriterSettings.Builder r0) {
                org.bson.json.Converter<org.bson.BsonTimestamp> r0 = r0.timestampConverter
                return r0
        }

        public static /* synthetic */ org.bson.json.Converter access$2200(org.bson.json.JsonWriterSettings.Builder r0) {
                org.bson.json.Converter<org.bson.BsonRegularExpression> r0 = r0.regularExpressionConverter
                return r0
        }

        public static /* synthetic */ java.lang.String access$300(org.bson.json.JsonWriterSettings.Builder r0) {
                java.lang.String r0 = r0.indentCharacters
                return r0
        }

        public static /* synthetic */ org.bson.json.JsonMode access$400(org.bson.json.JsonWriterSettings.Builder r0) {
                org.bson.json.JsonMode r0 = r0.outputMode
                return r0
        }

        public static /* synthetic */ int access$500(org.bson.json.JsonWriterSettings.Builder r0) {
                int r0 = r0.maxLength
                return r0
        }

        public static /* synthetic */ org.bson.json.Converter access$600(org.bson.json.JsonWriterSettings.Builder r0) {
                org.bson.json.Converter<org.bson.BsonNull> r0 = r0.nullConverter
                return r0
        }

        public static /* synthetic */ org.bson.json.Converter access$700(org.bson.json.JsonWriterSettings.Builder r0) {
                org.bson.json.Converter<java.lang.String> r0 = r0.stringConverter
                return r0
        }

        public static /* synthetic */ org.bson.json.Converter access$800(org.bson.json.JsonWriterSettings.Builder r0) {
                org.bson.json.Converter<java.lang.Boolean> r0 = r0.booleanConverter
                return r0
        }

        public static /* synthetic */ org.bson.json.Converter access$900(org.bson.json.JsonWriterSettings.Builder r0) {
                org.bson.json.Converter<java.lang.Double> r0 = r0.doubleConverter
                return r0
        }

        public org.bson.json.JsonWriterSettings.Builder binaryConverter(org.bson.json.Converter<org.bson.BsonBinary> r1) {
                r0 = this;
                r0.binaryConverter = r1
                return r0
        }

        public org.bson.json.JsonWriterSettings.Builder booleanConverter(org.bson.json.Converter<java.lang.Boolean> r1) {
                r0 = this;
                r0.booleanConverter = r1
                return r0
        }

        public org.bson.json.JsonWriterSettings build() {
                r2 = this;
                org.bson.json.JsonWriterSettings r0 = new org.bson.json.JsonWriterSettings
                r1 = 0
                r0.<init>(r2, r1)
                return r0
        }

        public org.bson.json.JsonWriterSettings.Builder dateTimeConverter(org.bson.json.Converter<java.lang.Long> r1) {
                r0 = this;
                r0.dateTimeConverter = r1
                return r0
        }

        public org.bson.json.JsonWriterSettings.Builder decimal128Converter(org.bson.json.Converter<org.bson.types.Decimal128> r1) {
                r0 = this;
                r0.decimal128Converter = r1
                return r0
        }

        public org.bson.json.JsonWriterSettings.Builder doubleConverter(org.bson.json.Converter<java.lang.Double> r1) {
                r0 = this;
                r0.doubleConverter = r1
                return r0
        }

        public org.bson.json.JsonWriterSettings.Builder indent(boolean r1) {
                r0 = this;
                r0.indent = r1
                return r0
        }

        public org.bson.json.JsonWriterSettings.Builder indentCharacters(java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = "indentCharacters"
                org.bson.assertions.Assertions.notNull(r0, r2)
                r1.indentCharacters = r2
                return r1
        }

        public org.bson.json.JsonWriterSettings.Builder int32Converter(org.bson.json.Converter<java.lang.Integer> r1) {
                r0 = this;
                r0.int32Converter = r1
                return r0
        }

        public org.bson.json.JsonWriterSettings.Builder int64Converter(org.bson.json.Converter<java.lang.Long> r1) {
                r0 = this;
                r0.int64Converter = r1
                return r0
        }

        public org.bson.json.JsonWriterSettings.Builder javaScriptConverter(org.bson.json.Converter<java.lang.String> r1) {
                r0 = this;
                r0.javaScriptConverter = r1
                return r0
        }

        public org.bson.json.JsonWriterSettings.Builder maxKeyConverter(org.bson.json.Converter<org.bson.BsonMaxKey> r1) {
                r0 = this;
                r0.maxKeyConverter = r1
                return r0
        }

        public org.bson.json.JsonWriterSettings.Builder maxLength(int r3) {
                r2 = this;
                if (r3 < 0) goto L4
                r0 = 1
                goto L5
            L4:
                r0 = 0
            L5:
                java.lang.String r1 = "maxLength >= 0"
                org.bson.assertions.Assertions.isTrueArgument(r1, r0)
                r2.maxLength = r3
                return r2
        }

        public org.bson.json.JsonWriterSettings.Builder minKeyConverter(org.bson.json.Converter<org.bson.BsonMinKey> r1) {
                r0 = this;
                r0.minKeyConverter = r1
                return r0
        }

        public org.bson.json.JsonWriterSettings.Builder newLineCharacters(java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = "newLineCharacters"
                org.bson.assertions.Assertions.notNull(r0, r2)
                r1.newLineCharacters = r2
                return r1
        }

        public org.bson.json.JsonWriterSettings.Builder nullConverter(org.bson.json.Converter<org.bson.BsonNull> r1) {
                r0 = this;
                r0.nullConverter = r1
                return r0
        }

        public org.bson.json.JsonWriterSettings.Builder objectIdConverter(org.bson.json.Converter<org.bson.types.ObjectId> r1) {
                r0 = this;
                r0.objectIdConverter = r1
                return r0
        }

        public org.bson.json.JsonWriterSettings.Builder outputMode(org.bson.json.JsonMode r2) {
                r1 = this;
                java.lang.String r0 = "outputMode"
                org.bson.assertions.Assertions.notNull(r0, r2)
                r1.outputMode = r2
                return r1
        }

        public org.bson.json.JsonWriterSettings.Builder regularExpressionConverter(org.bson.json.Converter<org.bson.BsonRegularExpression> r1) {
                r0 = this;
                r0.regularExpressionConverter = r1
                return r0
        }

        public org.bson.json.JsonWriterSettings.Builder stringConverter(org.bson.json.Converter<java.lang.String> r1) {
                r0 = this;
                r0.stringConverter = r1
                return r0
        }

        public org.bson.json.JsonWriterSettings.Builder symbolConverter(org.bson.json.Converter<java.lang.String> r1) {
                r0 = this;
                r0.symbolConverter = r1
                return r0
        }

        public org.bson.json.JsonWriterSettings.Builder timestampConverter(org.bson.json.Converter<org.bson.BsonTimestamp> r1) {
                r0 = this;
                r0.timestampConverter = r1
                return r0
        }

        public org.bson.json.JsonWriterSettings.Builder undefinedConverter(org.bson.json.Converter<org.bson.BsonUndefined> r1) {
                r0 = this;
                r0.undefinedConverter = r1
                return r0
        }
    }

    static {
            org.bson.json.JsonNullConverter r0 = new org.bson.json.JsonNullConverter
            r0.<init>()
            org.bson.json.JsonWriterSettings.JSON_NULL_CONVERTER = r0
            org.bson.json.JsonStringConverter r0 = new org.bson.json.JsonStringConverter
            r0.<init>()
            org.bson.json.JsonWriterSettings.JSON_STRING_CONVERTER = r0
            org.bson.json.JsonBooleanConverter r0 = new org.bson.json.JsonBooleanConverter
            r0.<init>()
            org.bson.json.JsonWriterSettings.JSON_BOOLEAN_CONVERTER = r0
            org.bson.json.JsonDoubleConverter r0 = new org.bson.json.JsonDoubleConverter
            r0.<init>()
            org.bson.json.JsonWriterSettings.JSON_DOUBLE_CONVERTER = r0
            org.bson.json.ExtendedJsonDoubleConverter r0 = new org.bson.json.ExtendedJsonDoubleConverter
            r0.<init>()
            org.bson.json.JsonWriterSettings.EXTENDED_JSON_DOUBLE_CONVERTER = r0
            org.bson.json.RelaxedExtendedJsonDoubleConverter r0 = new org.bson.json.RelaxedExtendedJsonDoubleConverter
            r0.<init>()
            org.bson.json.JsonWriterSettings.RELAXED_EXTENDED_JSON_DOUBLE_CONVERTER = r0
            org.bson.json.JsonInt32Converter r0 = new org.bson.json.JsonInt32Converter
            r0.<init>()
            org.bson.json.JsonWriterSettings.JSON_INT_32_CONVERTER = r0
            org.bson.json.ExtendedJsonInt32Converter r0 = new org.bson.json.ExtendedJsonInt32Converter
            r0.<init>()
            org.bson.json.JsonWriterSettings.EXTENDED_JSON_INT_32_CONVERTER = r0
            org.bson.json.JsonSymbolConverter r0 = new org.bson.json.JsonSymbolConverter
            r0.<init>()
            org.bson.json.JsonWriterSettings.JSON_SYMBOL_CONVERTER = r0
            org.bson.json.ExtendedJsonMinKeyConverter r0 = new org.bson.json.ExtendedJsonMinKeyConverter
            r0.<init>()
            org.bson.json.JsonWriterSettings.EXTENDED_JSON_MIN_KEY_CONVERTER = r0
            org.bson.json.ShellMinKeyConverter r0 = new org.bson.json.ShellMinKeyConverter
            r0.<init>()
            org.bson.json.JsonWriterSettings.SHELL_MIN_KEY_CONVERTER = r0
            org.bson.json.ExtendedJsonMaxKeyConverter r0 = new org.bson.json.ExtendedJsonMaxKeyConverter
            r0.<init>()
            org.bson.json.JsonWriterSettings.EXTENDED_JSON_MAX_KEY_CONVERTER = r0
            org.bson.json.ShellMaxKeyConverter r0 = new org.bson.json.ShellMaxKeyConverter
            r0.<init>()
            org.bson.json.JsonWriterSettings.SHELL_MAX_KEY_CONVERTER = r0
            org.bson.json.ExtendedJsonUndefinedConverter r0 = new org.bson.json.ExtendedJsonUndefinedConverter
            r0.<init>()
            org.bson.json.JsonWriterSettings.EXTENDED_JSON_UNDEFINED_CONVERTER = r0
            org.bson.json.ShellUndefinedConverter r0 = new org.bson.json.ShellUndefinedConverter
            r0.<init>()
            org.bson.json.JsonWriterSettings.SHELL_UNDEFINED_CONVERTER = r0
            org.bson.json.LegacyExtendedJsonDateTimeConverter r0 = new org.bson.json.LegacyExtendedJsonDateTimeConverter
            r0.<init>()
            org.bson.json.JsonWriterSettings.LEGACY_EXTENDED_JSON_DATE_TIME_CONVERTER = r0
            org.bson.json.ExtendedJsonDateTimeConverter r0 = new org.bson.json.ExtendedJsonDateTimeConverter
            r0.<init>()
            org.bson.json.JsonWriterSettings.EXTENDED_JSON_DATE_TIME_CONVERTER = r0
            org.bson.json.RelaxedExtendedJsonDateTimeConverter r0 = new org.bson.json.RelaxedExtendedJsonDateTimeConverter
            r0.<init>()
            org.bson.json.JsonWriterSettings.RELAXED_EXTENDED_JSON_DATE_TIME_CONVERTER = r0
            org.bson.json.ShellDateTimeConverter r0 = new org.bson.json.ShellDateTimeConverter
            r0.<init>()
            org.bson.json.JsonWriterSettings.SHELL_DATE_TIME_CONVERTER = r0
            org.bson.json.ExtendedJsonBinaryConverter r0 = new org.bson.json.ExtendedJsonBinaryConverter
            r0.<init>()
            org.bson.json.JsonWriterSettings.EXTENDED_JSON_BINARY_CONVERTER = r0
            org.bson.json.LegacyExtendedJsonBinaryConverter r0 = new org.bson.json.LegacyExtendedJsonBinaryConverter
            r0.<init>()
            org.bson.json.JsonWriterSettings.LEGACY_EXTENDED_JSON_BINARY_CONVERTER = r0
            org.bson.json.ShellBinaryConverter r0 = new org.bson.json.ShellBinaryConverter
            r0.<init>()
            org.bson.json.JsonWriterSettings.SHELL_BINARY_CONVERTER = r0
            org.bson.json.ExtendedJsonInt64Converter r0 = new org.bson.json.ExtendedJsonInt64Converter
            r0.<init>()
            org.bson.json.JsonWriterSettings.EXTENDED_JSON_INT_64_CONVERTER = r0
            org.bson.json.RelaxedExtendedJsonInt64Converter r0 = new org.bson.json.RelaxedExtendedJsonInt64Converter
            r0.<init>()
            org.bson.json.JsonWriterSettings.RELAXED_JSON_INT_64_CONVERTER = r0
            org.bson.json.ShellInt64Converter r0 = new org.bson.json.ShellInt64Converter
            r0.<init>()
            org.bson.json.JsonWriterSettings.SHELL_INT_64_CONVERTER = r0
            org.bson.json.ExtendedJsonDecimal128Converter r0 = new org.bson.json.ExtendedJsonDecimal128Converter
            r0.<init>()
            org.bson.json.JsonWriterSettings.EXTENDED_JSON_DECIMAL_128_CONVERTER = r0
            org.bson.json.ShellDecimal128Converter r0 = new org.bson.json.ShellDecimal128Converter
            r0.<init>()
            org.bson.json.JsonWriterSettings.SHELL_DECIMAL_128_CONVERTER = r0
            org.bson.json.ExtendedJsonObjectIdConverter r0 = new org.bson.json.ExtendedJsonObjectIdConverter
            r0.<init>()
            org.bson.json.JsonWriterSettings.EXTENDED_JSON_OBJECT_ID_CONVERTER = r0
            org.bson.json.ShellObjectIdConverter r0 = new org.bson.json.ShellObjectIdConverter
            r0.<init>()
            org.bson.json.JsonWriterSettings.SHELL_OBJECT_ID_CONVERTER = r0
            org.bson.json.ExtendedJsonTimestampConverter r0 = new org.bson.json.ExtendedJsonTimestampConverter
            r0.<init>()
            org.bson.json.JsonWriterSettings.EXTENDED_JSON_TIMESTAMP_CONVERTER = r0
            org.bson.json.ShellTimestampConverter r0 = new org.bson.json.ShellTimestampConverter
            r0.<init>()
            org.bson.json.JsonWriterSettings.SHELL_TIMESTAMP_CONVERTER = r0
            org.bson.json.ExtendedJsonRegularExpressionConverter r0 = new org.bson.json.ExtendedJsonRegularExpressionConverter
            r0.<init>()
            org.bson.json.JsonWriterSettings.EXTENDED_JSON_REGULAR_EXPRESSION_CONVERTER = r0
            org.bson.json.LegacyExtendedJsonRegularExpressionConverter r0 = new org.bson.json.LegacyExtendedJsonRegularExpressionConverter
            r0.<init>()
            org.bson.json.JsonWriterSettings.LEGACY_EXTENDED_JSON_REGULAR_EXPRESSION_CONVERTER = r0
            org.bson.json.ShellRegularExpressionConverter r0 = new org.bson.json.ShellRegularExpressionConverter
            r0.<init>()
            org.bson.json.JsonWriterSettings.SHELL_REGULAR_EXPRESSION_CONVERTER = r0
            return
    }

    @java.lang.Deprecated
    public JsonWriterSettings() {
            r2 = this;
            org.bson.json.JsonWriterSettings$Builder r0 = builder()
            org.bson.json.JsonMode r1 = org.bson.json.JsonMode.STRICT
            org.bson.json.JsonWriterSettings$Builder r0 = r0.outputMode(r1)
            r2.<init>(r0)
            return
    }

    @java.lang.Deprecated
    public JsonWriterSettings(org.bson.json.JsonMode r2) {
            r1 = this;
            org.bson.json.JsonWriterSettings$Builder r0 = builder()
            org.bson.json.JsonWriterSettings$Builder r2 = r0.outputMode(r2)
            r1.<init>(r2)
            return
    }

    @java.lang.Deprecated
    public JsonWriterSettings(org.bson.json.JsonMode r2, java.lang.String r3) {
            r1 = this;
            org.bson.json.JsonWriterSettings$Builder r0 = builder()
            org.bson.json.JsonWriterSettings$Builder r2 = r0.outputMode(r2)
            r0 = 1
            org.bson.json.JsonWriterSettings$Builder r2 = r2.indent(r0)
            org.bson.json.JsonWriterSettings$Builder r2 = r2.indentCharacters(r3)
            r1.<init>(r2)
            return
    }

    @java.lang.Deprecated
    public JsonWriterSettings(org.bson.json.JsonMode r2, java.lang.String r3, java.lang.String r4) {
            r1 = this;
            org.bson.json.JsonWriterSettings$Builder r0 = builder()
            org.bson.json.JsonWriterSettings$Builder r2 = r0.outputMode(r2)
            r0 = 1
            org.bson.json.JsonWriterSettings$Builder r2 = r2.indent(r0)
            org.bson.json.JsonWriterSettings$Builder r2 = r2.indentCharacters(r3)
            org.bson.json.JsonWriterSettings$Builder r2 = r2.newLineCharacters(r4)
            r1.<init>(r2)
            return
    }

    @java.lang.Deprecated
    public JsonWriterSettings(org.bson.json.JsonMode r2, boolean r3) {
            r1 = this;
            org.bson.json.JsonWriterSettings$Builder r0 = builder()
            org.bson.json.JsonWriterSettings$Builder r2 = r0.outputMode(r2)
            org.bson.json.JsonWriterSettings$Builder r2 = r2.indent(r3)
            r1.<init>(r2)
            return
    }

    private JsonWriterSettings(org.bson.json.JsonWriterSettings.Builder r3) {
            r2 = this;
            r2.<init>()
            boolean r0 = org.bson.json.JsonWriterSettings.Builder.access$100(r3)
            r2.indent = r0
            java.lang.String r0 = org.bson.json.JsonWriterSettings.Builder.access$200(r3)
            if (r0 == 0) goto L14
            java.lang.String r0 = org.bson.json.JsonWriterSettings.Builder.access$200(r3)
            goto L1a
        L14:
            java.lang.String r0 = "line.separator"
            java.lang.String r0 = java.lang.System.getProperty(r0)
        L1a:
            r2.newLineCharacters = r0
            java.lang.String r0 = org.bson.json.JsonWriterSettings.Builder.access$300(r3)
            r2.indentCharacters = r0
            org.bson.json.JsonMode r0 = org.bson.json.JsonWriterSettings.Builder.access$400(r3)
            r2.outputMode = r0
            int r1 = org.bson.json.JsonWriterSettings.Builder.access$500(r3)
            r2.maxLength = r1
            org.bson.json.Converter r1 = org.bson.json.JsonWriterSettings.Builder.access$600(r3)
            if (r1 == 0) goto L3b
            org.bson.json.Converter r1 = org.bson.json.JsonWriterSettings.Builder.access$600(r3)
            r2.nullConverter = r1
            goto L3f
        L3b:
            org.bson.json.JsonNullConverter r1 = org.bson.json.JsonWriterSettings.JSON_NULL_CONVERTER
            r2.nullConverter = r1
        L3f:
            org.bson.json.Converter r1 = org.bson.json.JsonWriterSettings.Builder.access$700(r3)
            if (r1 == 0) goto L4c
            org.bson.json.Converter r1 = org.bson.json.JsonWriterSettings.Builder.access$700(r3)
            r2.stringConverter = r1
            goto L50
        L4c:
            org.bson.json.JsonStringConverter r1 = org.bson.json.JsonWriterSettings.JSON_STRING_CONVERTER
            r2.stringConverter = r1
        L50:
            org.bson.json.Converter r1 = org.bson.json.JsonWriterSettings.Builder.access$800(r3)
            if (r1 == 0) goto L5d
            org.bson.json.Converter r1 = org.bson.json.JsonWriterSettings.Builder.access$800(r3)
            r2.booleanConverter = r1
            goto L61
        L5d:
            org.bson.json.JsonBooleanConverter r1 = org.bson.json.JsonWriterSettings.JSON_BOOLEAN_CONVERTER
            r2.booleanConverter = r1
        L61:
            org.bson.json.Converter r1 = org.bson.json.JsonWriterSettings.Builder.access$900(r3)
            if (r1 == 0) goto L6e
            org.bson.json.Converter r1 = org.bson.json.JsonWriterSettings.Builder.access$900(r3)
            r2.doubleConverter = r1
            goto L84
        L6e:
            org.bson.json.JsonMode r1 = org.bson.json.JsonMode.EXTENDED
            if (r0 != r1) goto L77
            org.bson.json.ExtendedJsonDoubleConverter r1 = org.bson.json.JsonWriterSettings.EXTENDED_JSON_DOUBLE_CONVERTER
            r2.doubleConverter = r1
            goto L84
        L77:
            org.bson.json.JsonMode r1 = org.bson.json.JsonMode.RELAXED
            if (r0 != r1) goto L80
            org.bson.json.RelaxedExtendedJsonDoubleConverter r1 = org.bson.json.JsonWriterSettings.RELAXED_EXTENDED_JSON_DOUBLE_CONVERTER
            r2.doubleConverter = r1
            goto L84
        L80:
            org.bson.json.JsonDoubleConverter r1 = org.bson.json.JsonWriterSettings.JSON_DOUBLE_CONVERTER
            r2.doubleConverter = r1
        L84:
            org.bson.json.Converter r1 = org.bson.json.JsonWriterSettings.Builder.access$1000(r3)
            if (r1 == 0) goto L91
            org.bson.json.Converter r1 = org.bson.json.JsonWriterSettings.Builder.access$1000(r3)
            r2.int32Converter = r1
            goto L9e
        L91:
            org.bson.json.JsonMode r1 = org.bson.json.JsonMode.EXTENDED
            if (r0 != r1) goto L9a
            org.bson.json.ExtendedJsonInt32Converter r1 = org.bson.json.JsonWriterSettings.EXTENDED_JSON_INT_32_CONVERTER
            r2.int32Converter = r1
            goto L9e
        L9a:
            org.bson.json.JsonInt32Converter r1 = org.bson.json.JsonWriterSettings.JSON_INT_32_CONVERTER
            r2.int32Converter = r1
        L9e:
            org.bson.json.Converter r1 = org.bson.json.JsonWriterSettings.Builder.access$1100(r3)
            if (r1 == 0) goto Lab
            org.bson.json.Converter r1 = org.bson.json.JsonWriterSettings.Builder.access$1100(r3)
            r2.symbolConverter = r1
            goto Laf
        Lab:
            org.bson.json.JsonSymbolConverter r1 = org.bson.json.JsonWriterSettings.JSON_SYMBOL_CONVERTER
            r2.symbolConverter = r1
        Laf:
            org.bson.json.Converter r1 = org.bson.json.JsonWriterSettings.Builder.access$1200(r3)
            if (r1 == 0) goto Lbc
            org.bson.json.Converter r1 = org.bson.json.JsonWriterSettings.Builder.access$1200(r3)
            r2.javaScriptConverter = r1
            goto Lc3
        Lbc:
            org.bson.json.JsonJavaScriptConverter r1 = new org.bson.json.JsonJavaScriptConverter
            r1.<init>()
            r2.javaScriptConverter = r1
        Lc3:
            org.bson.json.Converter r1 = org.bson.json.JsonWriterSettings.Builder.access$1300(r3)
            if (r1 == 0) goto Ld0
            org.bson.json.Converter r1 = org.bson.json.JsonWriterSettings.Builder.access$1300(r3)
            r2.minKeyConverter = r1
            goto Le6
        Ld0:
            org.bson.json.JsonMode r1 = org.bson.json.JsonMode.STRICT
            if (r0 == r1) goto Le2
            org.bson.json.JsonMode r1 = org.bson.json.JsonMode.EXTENDED
            if (r0 == r1) goto Le2
            org.bson.json.JsonMode r1 = org.bson.json.JsonMode.RELAXED
            if (r0 != r1) goto Ldd
            goto Le2
        Ldd:
            org.bson.json.ShellMinKeyConverter r1 = org.bson.json.JsonWriterSettings.SHELL_MIN_KEY_CONVERTER
            r2.minKeyConverter = r1
            goto Le6
        Le2:
            org.bson.json.ExtendedJsonMinKeyConverter r1 = org.bson.json.JsonWriterSettings.EXTENDED_JSON_MIN_KEY_CONVERTER
            r2.minKeyConverter = r1
        Le6:
            org.bson.json.Converter r1 = org.bson.json.JsonWriterSettings.Builder.access$1400(r3)
            if (r1 == 0) goto Lf3
            org.bson.json.Converter r1 = org.bson.json.JsonWriterSettings.Builder.access$1400(r3)
            r2.maxKeyConverter = r1
            goto L109
        Lf3:
            org.bson.json.JsonMode r1 = org.bson.json.JsonMode.STRICT
            if (r0 == r1) goto L105
            org.bson.json.JsonMode r1 = org.bson.json.JsonMode.EXTENDED
            if (r0 == r1) goto L105
            org.bson.json.JsonMode r1 = org.bson.json.JsonMode.RELAXED
            if (r0 != r1) goto L100
            goto L105
        L100:
            org.bson.json.ShellMaxKeyConverter r1 = org.bson.json.JsonWriterSettings.SHELL_MAX_KEY_CONVERTER
            r2.maxKeyConverter = r1
            goto L109
        L105:
            org.bson.json.ExtendedJsonMaxKeyConverter r1 = org.bson.json.JsonWriterSettings.EXTENDED_JSON_MAX_KEY_CONVERTER
            r2.maxKeyConverter = r1
        L109:
            org.bson.json.Converter r1 = org.bson.json.JsonWriterSettings.Builder.access$1500(r3)
            if (r1 == 0) goto L116
            org.bson.json.Converter r1 = org.bson.json.JsonWriterSettings.Builder.access$1500(r3)
            r2.undefinedConverter = r1
            goto L12c
        L116:
            org.bson.json.JsonMode r1 = org.bson.json.JsonMode.STRICT
            if (r0 == r1) goto L128
            org.bson.json.JsonMode r1 = org.bson.json.JsonMode.EXTENDED
            if (r0 == r1) goto L128
            org.bson.json.JsonMode r1 = org.bson.json.JsonMode.RELAXED
            if (r0 != r1) goto L123
            goto L128
        L123:
            org.bson.json.ShellUndefinedConverter r1 = org.bson.json.JsonWriterSettings.SHELL_UNDEFINED_CONVERTER
            r2.undefinedConverter = r1
            goto L12c
        L128:
            org.bson.json.ExtendedJsonUndefinedConverter r1 = org.bson.json.JsonWriterSettings.EXTENDED_JSON_UNDEFINED_CONVERTER
            r2.undefinedConverter = r1
        L12c:
            org.bson.json.Converter r1 = org.bson.json.JsonWriterSettings.Builder.access$1600(r3)
            if (r1 == 0) goto L139
            org.bson.json.Converter r1 = org.bson.json.JsonWriterSettings.Builder.access$1600(r3)
            r2.dateTimeConverter = r1
            goto L158
        L139:
            org.bson.json.JsonMode r1 = org.bson.json.JsonMode.STRICT
            if (r0 != r1) goto L142
            org.bson.json.LegacyExtendedJsonDateTimeConverter r1 = org.bson.json.JsonWriterSettings.LEGACY_EXTENDED_JSON_DATE_TIME_CONVERTER
            r2.dateTimeConverter = r1
            goto L158
        L142:
            org.bson.json.JsonMode r1 = org.bson.json.JsonMode.EXTENDED
            if (r0 != r1) goto L14b
            org.bson.json.ExtendedJsonDateTimeConverter r1 = org.bson.json.JsonWriterSettings.EXTENDED_JSON_DATE_TIME_CONVERTER
            r2.dateTimeConverter = r1
            goto L158
        L14b:
            org.bson.json.JsonMode r1 = org.bson.json.JsonMode.RELAXED
            if (r0 != r1) goto L154
            org.bson.json.RelaxedExtendedJsonDateTimeConverter r1 = org.bson.json.JsonWriterSettings.RELAXED_EXTENDED_JSON_DATE_TIME_CONVERTER
            r2.dateTimeConverter = r1
            goto L158
        L154:
            org.bson.json.ShellDateTimeConverter r1 = org.bson.json.JsonWriterSettings.SHELL_DATE_TIME_CONVERTER
            r2.dateTimeConverter = r1
        L158:
            org.bson.json.Converter r1 = org.bson.json.JsonWriterSettings.Builder.access$1700(r3)
            if (r1 == 0) goto L165
            org.bson.json.Converter r1 = org.bson.json.JsonWriterSettings.Builder.access$1700(r3)
            r2.binaryConverter = r1
            goto L180
        L165:
            org.bson.json.JsonMode r1 = org.bson.json.JsonMode.STRICT
            if (r0 != r1) goto L16e
            org.bson.json.LegacyExtendedJsonBinaryConverter r1 = org.bson.json.JsonWriterSettings.LEGACY_EXTENDED_JSON_BINARY_CONVERTER
            r2.binaryConverter = r1
            goto L180
        L16e:
            org.bson.json.JsonMode r1 = org.bson.json.JsonMode.EXTENDED
            if (r0 == r1) goto L17c
            org.bson.json.JsonMode r1 = org.bson.json.JsonMode.RELAXED
            if (r0 != r1) goto L177
            goto L17c
        L177:
            org.bson.json.ShellBinaryConverter r1 = org.bson.json.JsonWriterSettings.SHELL_BINARY_CONVERTER
            r2.binaryConverter = r1
            goto L180
        L17c:
            org.bson.json.ExtendedJsonBinaryConverter r1 = org.bson.json.JsonWriterSettings.EXTENDED_JSON_BINARY_CONVERTER
            r2.binaryConverter = r1
        L180:
            org.bson.json.Converter r1 = org.bson.json.JsonWriterSettings.Builder.access$1800(r3)
            if (r1 == 0) goto L18d
            org.bson.json.Converter r1 = org.bson.json.JsonWriterSettings.Builder.access$1800(r3)
            r2.int64Converter = r1
            goto L1a8
        L18d:
            org.bson.json.JsonMode r1 = org.bson.json.JsonMode.STRICT
            if (r0 == r1) goto L1a4
            org.bson.json.JsonMode r1 = org.bson.json.JsonMode.EXTENDED
            if (r0 != r1) goto L196
            goto L1a4
        L196:
            org.bson.json.JsonMode r1 = org.bson.json.JsonMode.RELAXED
            if (r0 != r1) goto L19f
            org.bson.json.RelaxedExtendedJsonInt64Converter r1 = org.bson.json.JsonWriterSettings.RELAXED_JSON_INT_64_CONVERTER
            r2.int64Converter = r1
            goto L1a8
        L19f:
            org.bson.json.ShellInt64Converter r1 = org.bson.json.JsonWriterSettings.SHELL_INT_64_CONVERTER
            r2.int64Converter = r1
            goto L1a8
        L1a4:
            org.bson.json.ExtendedJsonInt64Converter r1 = org.bson.json.JsonWriterSettings.EXTENDED_JSON_INT_64_CONVERTER
            r2.int64Converter = r1
        L1a8:
            org.bson.json.Converter r1 = org.bson.json.JsonWriterSettings.Builder.access$1900(r3)
            if (r1 == 0) goto L1b5
            org.bson.json.Converter r1 = org.bson.json.JsonWriterSettings.Builder.access$1900(r3)
            r2.decimal128Converter = r1
            goto L1cb
        L1b5:
            org.bson.json.JsonMode r1 = org.bson.json.JsonMode.STRICT
            if (r0 == r1) goto L1c7
            org.bson.json.JsonMode r1 = org.bson.json.JsonMode.EXTENDED
            if (r0 == r1) goto L1c7
            org.bson.json.JsonMode r1 = org.bson.json.JsonMode.RELAXED
            if (r0 != r1) goto L1c2
            goto L1c7
        L1c2:
            org.bson.json.ShellDecimal128Converter r1 = org.bson.json.JsonWriterSettings.SHELL_DECIMAL_128_CONVERTER
            r2.decimal128Converter = r1
            goto L1cb
        L1c7:
            org.bson.json.ExtendedJsonDecimal128Converter r1 = org.bson.json.JsonWriterSettings.EXTENDED_JSON_DECIMAL_128_CONVERTER
            r2.decimal128Converter = r1
        L1cb:
            org.bson.json.Converter r1 = org.bson.json.JsonWriterSettings.Builder.access$2000(r3)
            if (r1 == 0) goto L1d8
            org.bson.json.Converter r1 = org.bson.json.JsonWriterSettings.Builder.access$2000(r3)
            r2.objectIdConverter = r1
            goto L1ee
        L1d8:
            org.bson.json.JsonMode r1 = org.bson.json.JsonMode.STRICT
            if (r0 == r1) goto L1ea
            org.bson.json.JsonMode r1 = org.bson.json.JsonMode.EXTENDED
            if (r0 == r1) goto L1ea
            org.bson.json.JsonMode r1 = org.bson.json.JsonMode.RELAXED
            if (r0 != r1) goto L1e5
            goto L1ea
        L1e5:
            org.bson.json.ShellObjectIdConverter r1 = org.bson.json.JsonWriterSettings.SHELL_OBJECT_ID_CONVERTER
            r2.objectIdConverter = r1
            goto L1ee
        L1ea:
            org.bson.json.ExtendedJsonObjectIdConverter r1 = org.bson.json.JsonWriterSettings.EXTENDED_JSON_OBJECT_ID_CONVERTER
            r2.objectIdConverter = r1
        L1ee:
            org.bson.json.Converter r1 = org.bson.json.JsonWriterSettings.Builder.access$2100(r3)
            if (r1 == 0) goto L1fb
            org.bson.json.Converter r1 = org.bson.json.JsonWriterSettings.Builder.access$2100(r3)
            r2.timestampConverter = r1
            goto L211
        L1fb:
            org.bson.json.JsonMode r1 = org.bson.json.JsonMode.STRICT
            if (r0 == r1) goto L20d
            org.bson.json.JsonMode r1 = org.bson.json.JsonMode.EXTENDED
            if (r0 == r1) goto L20d
            org.bson.json.JsonMode r1 = org.bson.json.JsonMode.RELAXED
            if (r0 != r1) goto L208
            goto L20d
        L208:
            org.bson.json.ShellTimestampConverter r1 = org.bson.json.JsonWriterSettings.SHELL_TIMESTAMP_CONVERTER
            r2.timestampConverter = r1
            goto L211
        L20d:
            org.bson.json.ExtendedJsonTimestampConverter r1 = org.bson.json.JsonWriterSettings.EXTENDED_JSON_TIMESTAMP_CONVERTER
            r2.timestampConverter = r1
        L211:
            org.bson.json.Converter r1 = org.bson.json.JsonWriterSettings.Builder.access$2200(r3)
            if (r1 == 0) goto L21e
            org.bson.json.Converter r3 = org.bson.json.JsonWriterSettings.Builder.access$2200(r3)
            r2.regularExpressionConverter = r3
            goto L239
        L21e:
            org.bson.json.JsonMode r3 = org.bson.json.JsonMode.EXTENDED
            if (r0 == r3) goto L235
            org.bson.json.JsonMode r3 = org.bson.json.JsonMode.RELAXED
            if (r0 != r3) goto L227
            goto L235
        L227:
            org.bson.json.JsonMode r3 = org.bson.json.JsonMode.STRICT
            if (r0 != r3) goto L230
            org.bson.json.LegacyExtendedJsonRegularExpressionConverter r3 = org.bson.json.JsonWriterSettings.LEGACY_EXTENDED_JSON_REGULAR_EXPRESSION_CONVERTER
            r2.regularExpressionConverter = r3
            goto L239
        L230:
            org.bson.json.ShellRegularExpressionConverter r3 = org.bson.json.JsonWriterSettings.SHELL_REGULAR_EXPRESSION_CONVERTER
            r2.regularExpressionConverter = r3
            goto L239
        L235:
            org.bson.json.ExtendedJsonRegularExpressionConverter r3 = org.bson.json.JsonWriterSettings.EXTENDED_JSON_REGULAR_EXPRESSION_CONVERTER
            r2.regularExpressionConverter = r3
        L239:
            return
    }

    public /* synthetic */ JsonWriterSettings(org.bson.json.JsonWriterSettings.Builder r1, org.bson.json.JsonWriterSettings.AnonymousClass1 r2) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @java.lang.Deprecated
    public JsonWriterSettings(boolean r2) {
            r1 = this;
            org.bson.json.JsonWriterSettings$Builder r0 = builder()
            org.bson.json.JsonWriterSettings$Builder r2 = r0.indent(r2)
            r1.<init>(r2)
            return
    }

    public static org.bson.json.JsonWriterSettings.Builder builder() {
            org.bson.json.JsonWriterSettings$Builder r0 = new org.bson.json.JsonWriterSettings$Builder
            r1 = 0
            r0.<init>(r1)
            return r0
    }

    public org.bson.json.Converter<org.bson.BsonBinary> getBinaryConverter() {
            r1 = this;
            org.bson.json.Converter<org.bson.BsonBinary> r0 = r1.binaryConverter
            return r0
    }

    public org.bson.json.Converter<java.lang.Boolean> getBooleanConverter() {
            r1 = this;
            org.bson.json.Converter<java.lang.Boolean> r0 = r1.booleanConverter
            return r0
    }

    public org.bson.json.Converter<java.lang.Long> getDateTimeConverter() {
            r1 = this;
            org.bson.json.Converter<java.lang.Long> r0 = r1.dateTimeConverter
            return r0
    }

    public org.bson.json.Converter<org.bson.types.Decimal128> getDecimal128Converter() {
            r1 = this;
            org.bson.json.Converter<org.bson.types.Decimal128> r0 = r1.decimal128Converter
            return r0
    }

    public org.bson.json.Converter<java.lang.Double> getDoubleConverter() {
            r1 = this;
            org.bson.json.Converter<java.lang.Double> r0 = r1.doubleConverter
            return r0
    }

    public java.lang.String getIndentCharacters() {
            r1 = this;
            java.lang.String r0 = r1.indentCharacters
            return r0
    }

    public org.bson.json.Converter<java.lang.Integer> getInt32Converter() {
            r1 = this;
            org.bson.json.Converter<java.lang.Integer> r0 = r1.int32Converter
            return r0
    }

    public org.bson.json.Converter<java.lang.Long> getInt64Converter() {
            r1 = this;
            org.bson.json.Converter<java.lang.Long> r0 = r1.int64Converter
            return r0
    }

    public org.bson.json.Converter<java.lang.String> getJavaScriptConverter() {
            r1 = this;
            org.bson.json.Converter<java.lang.String> r0 = r1.javaScriptConverter
            return r0
    }

    public org.bson.json.Converter<org.bson.BsonMaxKey> getMaxKeyConverter() {
            r1 = this;
            org.bson.json.Converter<org.bson.BsonMaxKey> r0 = r1.maxKeyConverter
            return r0
    }

    public int getMaxLength() {
            r1 = this;
            int r0 = r1.maxLength
            return r0
    }

    public org.bson.json.Converter<org.bson.BsonMinKey> getMinKeyConverter() {
            r1 = this;
            org.bson.json.Converter<org.bson.BsonMinKey> r0 = r1.minKeyConverter
            return r0
    }

    public java.lang.String getNewLineCharacters() {
            r1 = this;
            java.lang.String r0 = r1.newLineCharacters
            return r0
    }

    public org.bson.json.Converter<org.bson.BsonNull> getNullConverter() {
            r1 = this;
            org.bson.json.Converter<org.bson.BsonNull> r0 = r1.nullConverter
            return r0
    }

    public org.bson.json.Converter<org.bson.types.ObjectId> getObjectIdConverter() {
            r1 = this;
            org.bson.json.Converter<org.bson.types.ObjectId> r0 = r1.objectIdConverter
            return r0
    }

    public org.bson.json.JsonMode getOutputMode() {
            r1 = this;
            org.bson.json.JsonMode r0 = r1.outputMode
            return r0
    }

    public org.bson.json.Converter<org.bson.BsonRegularExpression> getRegularExpressionConverter() {
            r1 = this;
            org.bson.json.Converter<org.bson.BsonRegularExpression> r0 = r1.regularExpressionConverter
            return r0
    }

    public org.bson.json.Converter<java.lang.String> getStringConverter() {
            r1 = this;
            org.bson.json.Converter<java.lang.String> r0 = r1.stringConverter
            return r0
    }

    public org.bson.json.Converter<java.lang.String> getSymbolConverter() {
            r1 = this;
            org.bson.json.Converter<java.lang.String> r0 = r1.symbolConverter
            return r0
    }

    public org.bson.json.Converter<org.bson.BsonTimestamp> getTimestampConverter() {
            r1 = this;
            org.bson.json.Converter<org.bson.BsonTimestamp> r0 = r1.timestampConverter
            return r0
    }

    public org.bson.json.Converter<org.bson.BsonUndefined> getUndefinedConverter() {
            r1 = this;
            org.bson.json.Converter<org.bson.BsonUndefined> r0 = r1.undefinedConverter
            return r0
    }

    public boolean isIndent() {
            r1 = this;
            boolean r0 = r1.indent
            return r0
    }
}
