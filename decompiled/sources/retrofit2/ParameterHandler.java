package retrofit2;

/* JADX INFO: loaded from: classes2.dex */
abstract class ParameterHandler<T> {



    public static final class Body<T> extends retrofit2.ParameterHandler<T> {
        private final retrofit2.Converter<T, okhttp3.RequestBody> converter;
        private final java.lang.reflect.Method method;
        private final int p;

        public Body(java.lang.reflect.Method r1, int r2, retrofit2.Converter<T, okhttp3.RequestBody> r3) {
                r0 = this;
                r0.<init>()
                r0.method = r1
                r0.p = r2
                r0.converter = r3
                return
        }

        @Override // retrofit2.ParameterHandler
        public final void apply(retrofit2.RequestBuilder r6, @javax.annotation.Nullable T r7) {
                r5 = this;
                r0 = 0
                if (r7 == 0) goto L31
                retrofit2.Converter<T, okhttp3.RequestBody> r1 = r5.converter     // Catch: java.io.IOException -> Lf
                java.lang.Object r1 = r1.convert(r7)     // Catch: java.io.IOException -> Lf
                okhttp3.RequestBody r1 = (okhttp3.RequestBody) r1     // Catch: java.io.IOException -> Lf
                r6.setBody(r1)
                return
            Lf:
                r6 = move-exception
                java.lang.reflect.Method r1 = r5.method
                int r2 = r5.p
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "Unable to convert "
                r3.append(r4)
                r3.append(r7)
                java.lang.String r7 = " to RequestBody"
                r3.append(r7)
                java.lang.String r7 = r3.toString()
                java.lang.Object[] r0 = new java.lang.Object[r0]
                java.lang.RuntimeException r6 = retrofit2.Utils.parameterError(r1, r6, r2, r7, r0)
                throw r6
            L31:
                java.lang.reflect.Method r6 = r5.method
                int r7 = r5.p
                java.lang.Object[] r0 = new java.lang.Object[r0]
                java.lang.String r1 = "Body parameter value must not be null."
                java.lang.RuntimeException r6 = retrofit2.Utils.parameterError(r6, r7, r1, r0)
                throw r6
        }
    }

    public static final class Field<T> extends retrofit2.ParameterHandler<T> {
        private final boolean encoded;
        private final java.lang.String name;
        private final retrofit2.Converter<T, java.lang.String> valueConverter;

        public Field(java.lang.String r2, retrofit2.Converter<T, java.lang.String> r3, boolean r4) {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = "name == null"
                java.util.Objects.requireNonNull(r2, r0)
                r1.name = r2
                r1.valueConverter = r3
                r1.encoded = r4
                return
        }

        @Override // retrofit2.ParameterHandler
        public final void apply(retrofit2.RequestBuilder r3, @javax.annotation.Nullable T r4) throws java.io.IOException {
                r2 = this;
                if (r4 != 0) goto L3
                return
            L3:
                retrofit2.Converter<T, java.lang.String> r0 = r2.valueConverter
                java.lang.Object r4 = r0.convert(r4)
                java.lang.String r4 = (java.lang.String) r4
                if (r4 != 0) goto Le
                return
            Le:
                java.lang.String r0 = r2.name
                boolean r1 = r2.encoded
                r3.addFormField(r0, r4, r1)
                return
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    public static final class FieldMap<T> extends retrofit2.ParameterHandler<java.util.Map<java.lang.String, T>> {
        private final boolean encoded;
        private final java.lang.reflect.Method method;
        private final int p;
        private final retrofit2.Converter<T, java.lang.String> valueConverter;

        public FieldMap(java.lang.reflect.Method r1, int r2, retrofit2.Converter<T, java.lang.String> r3, boolean r4) {
                r0 = this;
                r0.<init>()
                r0.method = r1
                r0.p = r2
                r0.valueConverter = r3
                r0.encoded = r4
                return
        }

        @Override // retrofit2.ParameterHandler
        public final void apply(retrofit2.RequestBuilder r7, @javax.annotation.Nullable java.lang.Object r8) throws java.io.IOException {
                r6 = this;
                java.util.Map r8 = (java.util.Map) r8
                r0 = 0
                if (r8 == 0) goto L91
                java.util.Set r8 = r8.entrySet()
                java.util.Iterator r8 = r8.iterator()
            Ld:
                boolean r1 = r8.hasNext()
                if (r1 == 0) goto L90
                java.lang.Object r1 = r8.next()
                java.util.Map$Entry r1 = (java.util.Map.Entry) r1
                java.lang.Object r2 = r1.getKey()
                java.lang.String r2 = (java.lang.String) r2
                if (r2 == 0) goto L83
                java.lang.Object r1 = r1.getValue()
                java.lang.String r3 = "'."
                if (r1 == 0) goto L72
                retrofit2.Converter<T, java.lang.String> r4 = r6.valueConverter
                java.lang.Object r4 = r4.convert(r1)
                java.lang.String r4 = (java.lang.String) r4
                if (r4 == 0) goto L39
                boolean r1 = r6.encoded
                r7.addFormField(r2, r4, r1)
                goto Ld
            L39:
                java.lang.reflect.Method r7 = r6.method
                int r8 = r6.p
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r5 = "Field map value '"
                r4.append(r5)
                r4.append(r1)
                java.lang.String r1 = "' converted to null by "
                r4.append(r1)
                retrofit2.Converter<T, java.lang.String> r1 = r6.valueConverter
                java.lang.Class r1 = r1.getClass()
                java.lang.String r1 = r1.getName()
                r4.append(r1)
                java.lang.String r1 = " for key '"
                r4.append(r1)
                r4.append(r2)
                r4.append(r3)
                java.lang.String r1 = r4.toString()
                java.lang.Object[] r0 = new java.lang.Object[r0]
                java.lang.RuntimeException r7 = retrofit2.Utils.parameterError(r7, r8, r1, r0)
                throw r7
            L72:
                java.lang.reflect.Method r7 = r6.method
                int r8 = r6.p
                java.lang.String r1 = "Field map contained null value for key '"
                java.lang.String r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r2, r3)
                java.lang.Object[] r0 = new java.lang.Object[r0]
                java.lang.RuntimeException r7 = retrofit2.Utils.parameterError(r7, r8, r1, r0)
                throw r7
            L83:
                java.lang.reflect.Method r7 = r6.method
                int r8 = r6.p
                java.lang.Object[] r0 = new java.lang.Object[r0]
                java.lang.String r1 = "Field map contained null key."
                java.lang.RuntimeException r7 = retrofit2.Utils.parameterError(r7, r8, r1, r0)
                throw r7
            L90:
                return
            L91:
                java.lang.reflect.Method r7 = r6.method
                int r8 = r6.p
                java.lang.Object[] r0 = new java.lang.Object[r0]
                java.lang.String r1 = "Field map was null."
                java.lang.RuntimeException r7 = retrofit2.Utils.parameterError(r7, r8, r1, r0)
                throw r7
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    public static final class Header<T> extends retrofit2.ParameterHandler<T> {
        private final java.lang.String name;
        private final retrofit2.Converter<T, java.lang.String> valueConverter;

        public Header(java.lang.String r2, retrofit2.Converter<T, java.lang.String> r3) {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = "name == null"
                java.util.Objects.requireNonNull(r2, r0)
                r1.name = r2
                r1.valueConverter = r3
                return
        }

        @Override // retrofit2.ParameterHandler
        public final void apply(retrofit2.RequestBuilder r2, @javax.annotation.Nullable T r3) throws java.io.IOException {
                r1 = this;
                if (r3 != 0) goto L3
                return
            L3:
                retrofit2.Converter<T, java.lang.String> r0 = r1.valueConverter
                java.lang.Object r3 = r0.convert(r3)
                java.lang.String r3 = (java.lang.String) r3
                if (r3 != 0) goto Le
                return
            Le:
                java.lang.String r0 = r1.name
                r2.addHeader(r0, r3)
                return
        }
    }

    public static final class HeaderMap<T> extends retrofit2.ParameterHandler<java.util.Map<java.lang.String, T>> {
        private final java.lang.reflect.Method method;
        private final int p;
        private final retrofit2.Converter<T, java.lang.String> valueConverter;

        public HeaderMap(java.lang.reflect.Method r1, int r2, retrofit2.Converter<T, java.lang.String> r3) {
                r0 = this;
                r0.<init>()
                r0.method = r1
                r0.p = r2
                r0.valueConverter = r3
                return
        }

        @Override // retrofit2.ParameterHandler
        public final void apply(retrofit2.RequestBuilder r5, @javax.annotation.Nullable java.lang.Object r6) throws java.io.IOException {
                r4 = this;
                java.util.Map r6 = (java.util.Map) r6
                r0 = 0
                if (r6 == 0) goto L54
                java.util.Set r6 = r6.entrySet()
                java.util.Iterator r6 = r6.iterator()
            Ld:
                boolean r1 = r6.hasNext()
                if (r1 == 0) goto L53
                java.lang.Object r1 = r6.next()
                java.util.Map$Entry r1 = (java.util.Map.Entry) r1
                java.lang.Object r2 = r1.getKey()
                java.lang.String r2 = (java.lang.String) r2
                if (r2 == 0) goto L46
                java.lang.Object r1 = r1.getValue()
                if (r1 == 0) goto L33
                retrofit2.Converter<T, java.lang.String> r3 = r4.valueConverter
                java.lang.Object r1 = r3.convert(r1)
                java.lang.String r1 = (java.lang.String) r1
                r5.addHeader(r2, r1)
                goto Ld
            L33:
                java.lang.reflect.Method r5 = r4.method
                int r6 = r4.p
                java.lang.String r1 = "Header map contained null value for key '"
                java.lang.String r3 = "'."
                java.lang.String r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r2, r3)
                java.lang.Object[] r0 = new java.lang.Object[r0]
                java.lang.RuntimeException r5 = retrofit2.Utils.parameterError(r5, r6, r1, r0)
                throw r5
            L46:
                java.lang.reflect.Method r5 = r4.method
                int r6 = r4.p
                java.lang.Object[] r0 = new java.lang.Object[r0]
                java.lang.String r1 = "Header map contained null key."
                java.lang.RuntimeException r5 = retrofit2.Utils.parameterError(r5, r6, r1, r0)
                throw r5
            L53:
                return
            L54:
                java.lang.reflect.Method r5 = r4.method
                int r6 = r4.p
                java.lang.Object[] r0 = new java.lang.Object[r0]
                java.lang.String r1 = "Header map was null."
                java.lang.RuntimeException r5 = retrofit2.Utils.parameterError(r5, r6, r1, r0)
                throw r5
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    public static final class Headers extends retrofit2.ParameterHandler<okhttp3.Headers> {
        private final java.lang.reflect.Method method;
        private final int p;

        public Headers(java.lang.reflect.Method r1, int r2) {
                r0 = this;
                r0.<init>()
                r0.method = r1
                r0.p = r2
                return
        }

        @Override // retrofit2.ParameterHandler
        public final void apply(retrofit2.RequestBuilder r3, @javax.annotation.Nullable okhttp3.Headers r4) throws java.io.IOException {
                r2 = this;
                okhttp3.Headers r4 = (okhttp3.Headers) r4
                if (r4 == 0) goto L8
                r3.addHeaders(r4)
                return
            L8:
                java.lang.reflect.Method r3 = r2.method
                int r4 = r2.p
                r0 = 0
                java.lang.Object[] r0 = new java.lang.Object[r0]
                java.lang.String r1 = "Headers parameter must not be null."
                java.lang.RuntimeException r3 = retrofit2.Utils.parameterError(r3, r4, r1, r0)
                throw r3
        }
    }

    public static final class Part<T> extends retrofit2.ParameterHandler<T> {
        private final retrofit2.Converter<T, okhttp3.RequestBody> converter;
        private final okhttp3.Headers headers;
        private final java.lang.reflect.Method method;
        private final int p;

        public Part(java.lang.reflect.Method r1, int r2, okhttp3.Headers r3, retrofit2.Converter<T, okhttp3.RequestBody> r4) {
                r0 = this;
                r0.<init>()
                r0.method = r1
                r0.p = r2
                r0.headers = r3
                r0.converter = r4
                return
        }

        @Override // retrofit2.ParameterHandler
        public final void apply(retrofit2.RequestBuilder r5, @javax.annotation.Nullable T r6) {
                r4 = this;
                if (r6 != 0) goto L3
                return
            L3:
                retrofit2.Converter<T, okhttp3.RequestBody> r0 = r4.converter     // Catch: java.io.IOException -> L11
                java.lang.Object r0 = r0.convert(r6)     // Catch: java.io.IOException -> L11
                okhttp3.RequestBody r0 = (okhttp3.RequestBody) r0     // Catch: java.io.IOException -> L11
                okhttp3.Headers r6 = r4.headers
                r5.addPart(r6, r0)
                return
            L11:
                r5 = move-exception
                java.lang.reflect.Method r0 = r4.method
                int r1 = r4.p
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "Unable to convert "
                r2.append(r3)
                r2.append(r6)
                java.lang.String r6 = " to RequestBody"
                r2.append(r6)
                java.lang.String r6 = r2.toString()
                r2 = 1
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r3 = 0
                r2[r3] = r5
                java.lang.RuntimeException r5 = retrofit2.Utils.parameterError(r0, r1, r6, r2)
                throw r5
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    public static final class PartMap<T> extends retrofit2.ParameterHandler<java.util.Map<java.lang.String, T>> {
        private final java.lang.reflect.Method method;
        private final int p;
        private final java.lang.String transferEncoding;
        private final retrofit2.Converter<T, okhttp3.RequestBody> valueConverter;

        public PartMap(java.lang.reflect.Method r1, int r2, retrofit2.Converter<T, okhttp3.RequestBody> r3, java.lang.String r4) {
                r0 = this;
                r0.<init>()
                r0.method = r1
                r0.p = r2
                r0.valueConverter = r3
                r0.transferEncoding = r4
                return
        }

        @Override // retrofit2.ParameterHandler
        public final void apply(retrofit2.RequestBuilder r8, @javax.annotation.Nullable java.lang.Object r9) throws java.io.IOException {
                r7 = this;
                java.util.Map r9 = (java.util.Map) r9
                r0 = 0
                if (r9 == 0) goto L74
                java.util.Set r9 = r9.entrySet()
                java.util.Iterator r9 = r9.iterator()
            Ld:
                boolean r1 = r9.hasNext()
                if (r1 == 0) goto L73
                java.lang.Object r1 = r9.next()
                java.util.Map$Entry r1 = (java.util.Map.Entry) r1
                java.lang.Object r2 = r1.getKey()
                java.lang.String r2 = (java.lang.String) r2
                if (r2 == 0) goto L66
                java.lang.Object r1 = r1.getValue()
                if (r1 == 0) goto L53
                r3 = 4
                java.lang.String[] r3 = new java.lang.String[r3]
                java.lang.String r4 = "Content-Disposition"
                r3[r0] = r4
                r4 = 1
                java.lang.String r5 = "form-data; name=\""
                java.lang.String r6 = "\""
                java.lang.String r2 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r5, r2, r6)
                r3[r4] = r2
                r2 = 2
                java.lang.String r4 = "Content-Transfer-Encoding"
                r3[r2] = r4
                r2 = 3
                java.lang.String r4 = r7.transferEncoding
                r3[r2] = r4
                okhttp3.Headers r2 = okhttp3.Headers.of(r3)
                retrofit2.Converter<T, okhttp3.RequestBody> r3 = r7.valueConverter
                java.lang.Object r1 = r3.convert(r1)
                okhttp3.RequestBody r1 = (okhttp3.RequestBody) r1
                r8.addPart(r2, r1)
                goto Ld
            L53:
                java.lang.reflect.Method r8 = r7.method
                int r9 = r7.p
                java.lang.String r1 = "Part map contained null value for key '"
                java.lang.String r3 = "'."
                java.lang.String r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r2, r3)
                java.lang.Object[] r0 = new java.lang.Object[r0]
                java.lang.RuntimeException r8 = retrofit2.Utils.parameterError(r8, r9, r1, r0)
                throw r8
            L66:
                java.lang.reflect.Method r8 = r7.method
                int r9 = r7.p
                java.lang.Object[] r0 = new java.lang.Object[r0]
                java.lang.String r1 = "Part map contained null key."
                java.lang.RuntimeException r8 = retrofit2.Utils.parameterError(r8, r9, r1, r0)
                throw r8
            L73:
                return
            L74:
                java.lang.reflect.Method r8 = r7.method
                int r9 = r7.p
                java.lang.Object[] r0 = new java.lang.Object[r0]
                java.lang.String r1 = "Part map was null."
                java.lang.RuntimeException r8 = retrofit2.Utils.parameterError(r8, r9, r1, r0)
                throw r8
        }
    }

    public static final class Path<T> extends retrofit2.ParameterHandler<T> {
        private final boolean encoded;
        private final java.lang.reflect.Method method;
        private final java.lang.String name;
        private final int p;
        private final retrofit2.Converter<T, java.lang.String> valueConverter;

        public Path(java.lang.reflect.Method r1, int r2, java.lang.String r3, retrofit2.Converter<T, java.lang.String> r4, boolean r5) {
                r0 = this;
                r0.<init>()
                r0.method = r1
                r0.p = r2
                java.lang.String r1 = "name == null"
                java.util.Objects.requireNonNull(r3, r1)
                r0.name = r3
                r0.valueConverter = r4
                r0.encoded = r5
                return
        }

        @Override // retrofit2.ParameterHandler
        public final void apply(retrofit2.RequestBuilder r4, @javax.annotation.Nullable T r5) throws java.io.IOException {
                r3 = this;
                if (r5 == 0) goto L12
                java.lang.String r0 = r3.name
                retrofit2.Converter<T, java.lang.String> r1 = r3.valueConverter
                java.lang.Object r5 = r1.convert(r5)
                java.lang.String r5 = (java.lang.String) r5
                boolean r1 = r3.encoded
                r4.addPathParam(r0, r5, r1)
                return
            L12:
                java.lang.reflect.Method r4 = r3.method
                int r5 = r3.p
                java.lang.String r0 = "Path parameter \""
                java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
                java.lang.String r1 = r3.name
                java.lang.String r2 = "\" value must not be null."
                java.lang.String r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r1, r2)
                r1 = 0
                java.lang.Object[] r1 = new java.lang.Object[r1]
                java.lang.RuntimeException r4 = retrofit2.Utils.parameterError(r4, r5, r0, r1)
                throw r4
        }
    }

    public static final class Query<T> extends retrofit2.ParameterHandler<T> {
        private final boolean encoded;
        private final java.lang.String name;
        private final retrofit2.Converter<T, java.lang.String> valueConverter;

        public Query(java.lang.String r2, retrofit2.Converter<T, java.lang.String> r3, boolean r4) {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = "name == null"
                java.util.Objects.requireNonNull(r2, r0)
                r1.name = r2
                r1.valueConverter = r3
                r1.encoded = r4
                return
        }

        @Override // retrofit2.ParameterHandler
        public final void apply(retrofit2.RequestBuilder r3, @javax.annotation.Nullable T r4) throws java.io.IOException {
                r2 = this;
                if (r4 != 0) goto L3
                return
            L3:
                retrofit2.Converter<T, java.lang.String> r0 = r2.valueConverter
                java.lang.Object r4 = r0.convert(r4)
                java.lang.String r4 = (java.lang.String) r4
                if (r4 != 0) goto Le
                return
            Le:
                java.lang.String r0 = r2.name
                boolean r1 = r2.encoded
                r3.addQueryParam(r0, r4, r1)
                return
        }
    }

    public static final class QueryMap<T> extends retrofit2.ParameterHandler<java.util.Map<java.lang.String, T>> {
        private final boolean encoded;
        private final java.lang.reflect.Method method;
        private final int p;
        private final retrofit2.Converter<T, java.lang.String> valueConverter;

        public QueryMap(java.lang.reflect.Method r1, int r2, retrofit2.Converter<T, java.lang.String> r3, boolean r4) {
                r0 = this;
                r0.<init>()
                r0.method = r1
                r0.p = r2
                r0.valueConverter = r3
                r0.encoded = r4
                return
        }

        @Override // retrofit2.ParameterHandler
        public final void apply(retrofit2.RequestBuilder r7, @javax.annotation.Nullable java.lang.Object r8) throws java.io.IOException {
                r6 = this;
                java.util.Map r8 = (java.util.Map) r8
                r0 = 0
                if (r8 == 0) goto L91
                java.util.Set r8 = r8.entrySet()
                java.util.Iterator r8 = r8.iterator()
            Ld:
                boolean r1 = r8.hasNext()
                if (r1 == 0) goto L90
                java.lang.Object r1 = r8.next()
                java.util.Map$Entry r1 = (java.util.Map.Entry) r1
                java.lang.Object r2 = r1.getKey()
                java.lang.String r2 = (java.lang.String) r2
                if (r2 == 0) goto L83
                java.lang.Object r1 = r1.getValue()
                java.lang.String r3 = "'."
                if (r1 == 0) goto L72
                retrofit2.Converter<T, java.lang.String> r4 = r6.valueConverter
                java.lang.Object r4 = r4.convert(r1)
                java.lang.String r4 = (java.lang.String) r4
                if (r4 == 0) goto L39
                boolean r1 = r6.encoded
                r7.addQueryParam(r2, r4, r1)
                goto Ld
            L39:
                java.lang.reflect.Method r7 = r6.method
                int r8 = r6.p
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r5 = "Query map value '"
                r4.append(r5)
                r4.append(r1)
                java.lang.String r1 = "' converted to null by "
                r4.append(r1)
                retrofit2.Converter<T, java.lang.String> r1 = r6.valueConverter
                java.lang.Class r1 = r1.getClass()
                java.lang.String r1 = r1.getName()
                r4.append(r1)
                java.lang.String r1 = " for key '"
                r4.append(r1)
                r4.append(r2)
                r4.append(r3)
                java.lang.String r1 = r4.toString()
                java.lang.Object[] r0 = new java.lang.Object[r0]
                java.lang.RuntimeException r7 = retrofit2.Utils.parameterError(r7, r8, r1, r0)
                throw r7
            L72:
                java.lang.reflect.Method r7 = r6.method
                int r8 = r6.p
                java.lang.String r1 = "Query map contained null value for key '"
                java.lang.String r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r2, r3)
                java.lang.Object[] r0 = new java.lang.Object[r0]
                java.lang.RuntimeException r7 = retrofit2.Utils.parameterError(r7, r8, r1, r0)
                throw r7
            L83:
                java.lang.reflect.Method r7 = r6.method
                int r8 = r6.p
                java.lang.Object[] r0 = new java.lang.Object[r0]
                java.lang.String r1 = "Query map contained null key."
                java.lang.RuntimeException r7 = retrofit2.Utils.parameterError(r7, r8, r1, r0)
                throw r7
            L90:
                return
            L91:
                java.lang.reflect.Method r7 = r6.method
                int r8 = r6.p
                java.lang.Object[] r0 = new java.lang.Object[r0]
                java.lang.String r1 = "Query map was null"
                java.lang.RuntimeException r7 = retrofit2.Utils.parameterError(r7, r8, r1, r0)
                throw r7
        }
    }

    public static final class QueryName<T> extends retrofit2.ParameterHandler<T> {
        private final boolean encoded;
        private final retrofit2.Converter<T, java.lang.String> nameConverter;

        public QueryName(retrofit2.Converter<T, java.lang.String> r1, boolean r2) {
                r0 = this;
                r0.<init>()
                r0.nameConverter = r1
                r0.encoded = r2
                return
        }

        @Override // retrofit2.ParameterHandler
        public final void apply(retrofit2.RequestBuilder r3, @javax.annotation.Nullable T r4) throws java.io.IOException {
                r2 = this;
                if (r4 != 0) goto L3
                return
            L3:
                retrofit2.Converter<T, java.lang.String> r0 = r2.nameConverter
                java.lang.Object r4 = r0.convert(r4)
                java.lang.String r4 = (java.lang.String) r4
                r0 = 0
                boolean r1 = r2.encoded
                r3.addQueryParam(r4, r0, r1)
                return
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    public static final class RawPart extends retrofit2.ParameterHandler<okhttp3.MultipartBody.Part> {
        public static final retrofit2.ParameterHandler.RawPart INSTANCE = null;

        static {
                retrofit2.ParameterHandler$RawPart r0 = new retrofit2.ParameterHandler$RawPart
                r0.<init>()
                retrofit2.ParameterHandler.RawPart.INSTANCE = r0
                return
        }

        private RawPart() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // retrofit2.ParameterHandler
        public final void apply(retrofit2.RequestBuilder r1, @javax.annotation.Nullable okhttp3.MultipartBody.Part r2) throws java.io.IOException {
                r0 = this;
                okhttp3.MultipartBody$Part r2 = (okhttp3.MultipartBody.Part) r2
                if (r2 == 0) goto L7
                r1.addPart(r2)
            L7:
                return
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    public static final class RelativeUrl extends retrofit2.ParameterHandler<java.lang.Object> {
        private final java.lang.reflect.Method method;
        private final int p;

        public RelativeUrl(java.lang.reflect.Method r1, int r2) {
                r0 = this;
                r0.<init>()
                r0.method = r1
                r0.p = r2
                return
        }

        @Override // retrofit2.ParameterHandler
        public final void apply(retrofit2.RequestBuilder r3, @javax.annotation.Nullable java.lang.Object r4) {
                r2 = this;
                if (r4 == 0) goto L6
                r3.setRelativeUrl(r4)
                return
            L6:
                java.lang.reflect.Method r3 = r2.method
                int r4 = r2.p
                r0 = 0
                java.lang.Object[] r0 = new java.lang.Object[r0]
                java.lang.String r1 = "@Url parameter is null."
                java.lang.RuntimeException r3 = retrofit2.Utils.parameterError(r3, r4, r1, r0)
                throw r3
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    public static final class Tag<T> extends retrofit2.ParameterHandler<T> {
        public final java.lang.Class<T> cls;

        public Tag(java.lang.Class<T> r1) {
                r0 = this;
                r0.<init>()
                r0.cls = r1
                return
        }

        @Override // retrofit2.ParameterHandler
        public final void apply(retrofit2.RequestBuilder r2, @javax.annotation.Nullable T r3) {
                r1 = this;
                java.lang.Class<T> r0 = r1.cls
                r2.addTag(r0, r3)
                return
        }
    }

    public ParameterHandler() {
            r0 = this;
            r0.<init>()
            return
    }

    public abstract void apply(retrofit2.RequestBuilder r1, @javax.annotation.Nullable T r2) throws java.io.IOException;
}
