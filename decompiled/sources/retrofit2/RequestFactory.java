package retrofit2;

/* JADX INFO: loaded from: classes3.dex */
final class RequestFactory {
    private final okhttp3.HttpUrl baseUrl;

    @javax.annotation.Nullable
    private final okhttp3.MediaType contentType;
    private final boolean hasBody;

    @javax.annotation.Nullable
    private final okhttp3.Headers headers;
    public final java.lang.String httpMethod;
    private final boolean isFormEncoded;
    public final boolean isKotlinSuspendFunction;
    private final boolean isMultipart;
    private final java.lang.reflect.Method method;
    private final retrofit2.ParameterHandler<?>[] parameterHandlers;

    @javax.annotation.Nullable
    private final java.lang.String relativeUrl;

    /* JADX INFO: loaded from: classes2.dex */
    public static final class Builder {
        private static final java.lang.String PARAM = "[a-zA-Z][a-zA-Z0-9_-]*";
        private static final java.util.regex.Pattern PARAM_NAME_REGEX = null;
        private static final java.util.regex.Pattern PARAM_URL_REGEX = null;

        @javax.annotation.Nullable
        public okhttp3.MediaType contentType;
        public boolean gotBody;
        public boolean gotField;
        public boolean gotPart;
        public boolean gotPath;
        public boolean gotQuery;
        public boolean gotQueryMap;
        public boolean gotQueryName;
        public boolean gotUrl;
        public boolean hasBody;

        @javax.annotation.Nullable
        public okhttp3.Headers headers;

        @javax.annotation.Nullable
        public java.lang.String httpMethod;
        public boolean isFormEncoded;
        public boolean isKotlinSuspendFunction;
        public boolean isMultipart;
        public final java.lang.reflect.Method method;
        public final java.lang.annotation.Annotation[] methodAnnotations;
        public final java.lang.annotation.Annotation[][] parameterAnnotationsArray;

        @javax.annotation.Nullable
        public retrofit2.ParameterHandler<?>[] parameterHandlers;
        public final java.lang.reflect.Type[] parameterTypes;

        @javax.annotation.Nullable
        public java.lang.String relativeUrl;

        @javax.annotation.Nullable
        public java.util.Set<java.lang.String> relativeUrlParamNames;
        public final retrofit2.Retrofit retrofit;

        static {
                java.lang.String r0 = "\\{([a-zA-Z][a-zA-Z0-9_-]*)\\}"
                java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
                retrofit2.RequestFactory.Builder.PARAM_URL_REGEX = r0
                java.lang.String r0 = "[a-zA-Z][a-zA-Z0-9_-]*"
                java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
                retrofit2.RequestFactory.Builder.PARAM_NAME_REGEX = r0
                return
        }

        public Builder(retrofit2.Retrofit r1, java.lang.reflect.Method r2) {
                r0 = this;
                r0.<init>()
                r0.retrofit = r1
                r0.method = r2
                java.lang.annotation.Annotation[] r1 = r2.getAnnotations()
                r0.methodAnnotations = r1
                java.lang.reflect.Type[] r1 = r2.getGenericParameterTypes()
                r0.parameterTypes = r1
                java.lang.annotation.Annotation[][] r1 = r2.getParameterAnnotations()
                r0.parameterAnnotationsArray = r1
                return
        }

        private static java.lang.Class<?> boxIfPrimitive(java.lang.Class<?> r1) {
                java.lang.Class r0 = java.lang.Boolean.TYPE
                if (r0 != r1) goto L7
                java.lang.Class<java.lang.Boolean> r1 = java.lang.Boolean.class
                return r1
            L7:
                java.lang.Class r0 = java.lang.Byte.TYPE
                if (r0 != r1) goto Le
                java.lang.Class<java.lang.Byte> r1 = java.lang.Byte.class
                return r1
            Le:
                java.lang.Class r0 = java.lang.Character.TYPE
                if (r0 != r1) goto L15
                java.lang.Class<java.lang.Character> r1 = java.lang.Character.class
                return r1
            L15:
                java.lang.Class r0 = java.lang.Double.TYPE
                if (r0 != r1) goto L1c
                java.lang.Class<java.lang.Double> r1 = java.lang.Double.class
                return r1
            L1c:
                java.lang.Class r0 = java.lang.Float.TYPE
                if (r0 != r1) goto L23
                java.lang.Class<java.lang.Float> r1 = java.lang.Float.class
                return r1
            L23:
                java.lang.Class r0 = java.lang.Integer.TYPE
                if (r0 != r1) goto L2a
                java.lang.Class<java.lang.Integer> r1 = java.lang.Integer.class
                return r1
            L2a:
                java.lang.Class r0 = java.lang.Long.TYPE
                if (r0 != r1) goto L31
                java.lang.Class<java.lang.Long> r1 = java.lang.Long.class
                return r1
            L31:
                java.lang.Class r0 = java.lang.Short.TYPE
                if (r0 != r1) goto L37
                java.lang.Class<java.lang.Short> r1 = java.lang.Short.class
            L37:
                return r1
        }

        private okhttp3.Headers parseHeaders(java.lang.String[] r9) {
                r8 = this;
                okhttp3.Headers$Builder r0 = new okhttp3.Headers$Builder
                r0.<init>()
                int r1 = r9.length
                r2 = 0
                r3 = 0
            L8:
                if (r3 >= r1) goto L5e
                r4 = r9[r3]
                r5 = 58
                int r5 = r4.indexOf(r5)
                r6 = -1
                r7 = 1
                if (r5 == r6) goto L50
                if (r5 == 0) goto L50
                int r6 = r4.length()
                int r6 = r6 - r7
                if (r5 == r6) goto L50
                java.lang.String r6 = r4.substring(r2, r5)
                int r5 = r5 + 1
                java.lang.String r4 = r4.substring(r5)
                java.lang.String r4 = r4.trim()
                java.lang.String r5 = "Content-Type"
                boolean r5 = r5.equalsIgnoreCase(r6)
                if (r5 == 0) goto L4a
                okhttp3.MediaType r5 = okhttp3.MediaType.get(r4)     // Catch: java.lang.IllegalArgumentException -> L3c
                r8.contentType = r5     // Catch: java.lang.IllegalArgumentException -> L3c
                goto L4d
            L3c:
                r9 = move-exception
                java.lang.reflect.Method r0 = r8.method
                java.lang.Object[] r1 = new java.lang.Object[r7]
                r1[r2] = r4
                java.lang.String r2 = "Malformed content type: %s"
                java.lang.RuntimeException r9 = retrofit2.Utils.methodError(r0, r9, r2, r1)
                throw r9
            L4a:
                r0.add(r6, r4)
            L4d:
                int r3 = r3 + 1
                goto L8
            L50:
                java.lang.reflect.Method r9 = r8.method
                java.lang.Object[] r0 = new java.lang.Object[r7]
                r0[r2] = r4
                r1 = 0
                java.lang.String r2 = "@Headers value must be in the form \"Name: Value\". Found: \"%s\""
                java.lang.RuntimeException r9 = retrofit2.Utils.methodError(r9, r1, r2, r0)
                throw r9
            L5e:
                okhttp3.Headers r9 = r0.build()
                return r9
        }

        private void parseHttpMethodAndPath(java.lang.String r5, java.lang.String r6, boolean r7) {
                r4 = this;
                java.lang.String r0 = r4.httpMethod
                r1 = 0
                r2 = 0
                r3 = 1
                if (r0 != 0) goto L5f
                r4.httpMethod = r5
                r4.hasBody = r7
                boolean r5 = r6.isEmpty()
                if (r5 == 0) goto L12
                return
            L12:
                r5 = 63
                int r5 = r6.indexOf(r5)
                r7 = -1
                if (r5 == r7) goto L41
                int r7 = r6.length()
                int r7 = r7 - r3
                if (r5 >= r7) goto L41
                int r5 = r5 + r3
                java.lang.String r5 = r6.substring(r5)
                java.util.regex.Pattern r7 = retrofit2.RequestFactory.Builder.PARAM_URL_REGEX
                java.util.regex.Matcher r7 = r7.matcher(r5)
                boolean r7 = r7.find()
                if (r7 != 0) goto L34
                goto L41
            L34:
                java.lang.reflect.Method r6 = r4.method
                java.lang.Object[] r7 = new java.lang.Object[r3]
                r7[r2] = r5
                java.lang.String r5 = "URL query string \"%s\" must not have replace block. For dynamic query parameters use @Query."
                java.lang.RuntimeException r5 = retrofit2.Utils.methodError(r6, r1, r5, r7)
                throw r5
            L41:
                r4.relativeUrl = r6
                java.util.regex.Pattern r5 = retrofit2.RequestFactory.Builder.PARAM_URL_REGEX
                java.util.regex.Matcher r5 = r5.matcher(r6)
                java.util.LinkedHashSet r6 = new java.util.LinkedHashSet
                r6.<init>()
            L4e:
                boolean r7 = r5.find()
                if (r7 == 0) goto L5c
                java.lang.String r7 = r5.group(r3)
                r6.add(r7)
                goto L4e
            L5c:
                r4.relativeUrlParamNames = r6
                return
            L5f:
                java.lang.reflect.Method r6 = r4.method
                r7 = 2
                java.lang.Object[] r7 = new java.lang.Object[r7]
                r7[r2] = r0
                r7[r3] = r5
                java.lang.String r5 = "Only one HTTP method is allowed. Found: %s and %s."
                java.lang.RuntimeException r5 = retrofit2.Utils.methodError(r6, r1, r5, r7)
                throw r5
        }

        private void parseMethodAnnotation(java.lang.annotation.Annotation r6) {
                r5 = this;
                boolean r0 = r6 instanceof retrofit2.http.DELETE
                r1 = 0
                if (r0 == 0) goto L12
                retrofit2.http.DELETE r6 = (retrofit2.http.DELETE) r6
                java.lang.String r6 = r6.value()
                java.lang.String r0 = "DELETE"
                r5.parseHttpMethodAndPath(r0, r6, r1)
                goto Ld8
            L12:
                boolean r0 = r6 instanceof retrofit2.http.GET
                if (r0 == 0) goto L23
                retrofit2.http.GET r6 = (retrofit2.http.GET) r6
                java.lang.String r6 = r6.value()
                java.lang.String r0 = "GET"
                r5.parseHttpMethodAndPath(r0, r6, r1)
                goto Ld8
            L23:
                boolean r0 = r6 instanceof retrofit2.http.HEAD
                if (r0 == 0) goto L34
                retrofit2.http.HEAD r6 = (retrofit2.http.HEAD) r6
                java.lang.String r6 = r6.value()
                java.lang.String r0 = "HEAD"
                r5.parseHttpMethodAndPath(r0, r6, r1)
                goto Ld8
            L34:
                boolean r0 = r6 instanceof retrofit2.http.PATCH
                r2 = 1
                if (r0 == 0) goto L46
                retrofit2.http.PATCH r6 = (retrofit2.http.PATCH) r6
                java.lang.String r6 = r6.value()
                java.lang.String r0 = "PATCH"
                r5.parseHttpMethodAndPath(r0, r6, r2)
                goto Ld8
            L46:
                boolean r0 = r6 instanceof retrofit2.http.POST
                if (r0 == 0) goto L57
                retrofit2.http.POST r6 = (retrofit2.http.POST) r6
                java.lang.String r6 = r6.value()
                java.lang.String r0 = "POST"
                r5.parseHttpMethodAndPath(r0, r6, r2)
                goto Ld8
            L57:
                boolean r0 = r6 instanceof retrofit2.http.PUT
                if (r0 == 0) goto L68
                retrofit2.http.PUT r6 = (retrofit2.http.PUT) r6
                java.lang.String r6 = r6.value()
                java.lang.String r0 = "PUT"
                r5.parseHttpMethodAndPath(r0, r6, r2)
                goto Ld8
            L68:
                boolean r0 = r6 instanceof retrofit2.http.OPTIONS
                if (r0 == 0) goto L78
                retrofit2.http.OPTIONS r6 = (retrofit2.http.OPTIONS) r6
                java.lang.String r6 = r6.value()
                java.lang.String r0 = "OPTIONS"
                r5.parseHttpMethodAndPath(r0, r6, r1)
                goto Ld8
            L78:
                boolean r0 = r6 instanceof retrofit2.http.HTTP
                if (r0 == 0) goto L8e
                retrofit2.http.HTTP r6 = (retrofit2.http.HTTP) r6
                java.lang.String r0 = r6.method()
                java.lang.String r1 = r6.path()
                boolean r6 = r6.hasBody()
                r5.parseHttpMethodAndPath(r0, r1, r6)
                goto Ld8
            L8e:
                boolean r0 = r6 instanceof retrofit2.http.Headers
                r3 = 0
                if (r0 == 0) goto Lae
                retrofit2.http.Headers r6 = (retrofit2.http.Headers) r6
                java.lang.String[] r6 = r6.value()
                int r0 = r6.length
                if (r0 == 0) goto La3
                okhttp3.Headers r6 = r5.parseHeaders(r6)
                r5.headers = r6
                goto Ld8
            La3:
                java.lang.reflect.Method r6 = r5.method
                java.lang.Object[] r0 = new java.lang.Object[r1]
                java.lang.String r1 = "@Headers annotation is empty."
                java.lang.RuntimeException r6 = retrofit2.Utils.methodError(r6, r3, r1, r0)
                throw r6
            Lae:
                boolean r0 = r6 instanceof retrofit2.http.Multipart
                java.lang.String r4 = "Only one encoding annotation is allowed."
                if (r0 == 0) goto Lc4
                boolean r6 = r5.isFormEncoded
                if (r6 != 0) goto Lbb
                r5.isMultipart = r2
                goto Ld8
            Lbb:
                java.lang.reflect.Method r6 = r5.method
                java.lang.Object[] r0 = new java.lang.Object[r1]
                java.lang.RuntimeException r6 = retrofit2.Utils.methodError(r6, r3, r4, r0)
                throw r6
            Lc4:
                boolean r6 = r6 instanceof retrofit2.http.FormUrlEncoded
                if (r6 == 0) goto Ld8
                boolean r6 = r5.isMultipart
                if (r6 != 0) goto Lcf
                r5.isFormEncoded = r2
                goto Ld8
            Lcf:
                java.lang.reflect.Method r6 = r5.method
                java.lang.Object[] r0 = new java.lang.Object[r1]
                java.lang.RuntimeException r6 = retrofit2.Utils.methodError(r6, r3, r4, r0)
                throw r6
            Ld8:
                return
        }

        @javax.annotation.Nullable
        private retrofit2.ParameterHandler<?> parseParameter(int r7, java.lang.reflect.Type r8, @javax.annotation.Nullable java.lang.annotation.Annotation[] r9, boolean r10) {
                r6 = this;
                r0 = 0
                r1 = 0
                if (r9 == 0) goto L23
                int r2 = r9.length
                r4 = r0
                r3 = 0
            L7:
                if (r3 >= r2) goto L24
                r5 = r9[r3]
                retrofit2.ParameterHandler r5 = r6.parseParameterAnnotation(r7, r8, r9, r5)
                if (r5 != 0) goto L12
                goto L15
            L12:
                if (r4 != 0) goto L18
                r4 = r5
            L15:
                int r3 = r3 + 1
                goto L7
            L18:
                java.lang.reflect.Method r8 = r6.method
                java.lang.Object[] r9 = new java.lang.Object[r1]
                java.lang.String r10 = "Multiple Retrofit annotations found, only one allowed."
                java.lang.RuntimeException r7 = retrofit2.Utils.parameterError(r8, r7, r10, r9)
                throw r7
            L23:
                r4 = r0
            L24:
                if (r4 != 0) goto L3f
                if (r10 == 0) goto L34
                java.lang.Class r8 = retrofit2.Utils.getRawType(r8)     // Catch: java.lang.NoClassDefFoundError -> L34
                java.lang.Class<kotlin.coroutines.Continuation> r9 = kotlin.coroutines.Continuation.class
                if (r8 != r9) goto L34
                r8 = 1
                r6.isKotlinSuspendFunction = r8     // Catch: java.lang.NoClassDefFoundError -> L34
                return r0
            L34:
                java.lang.reflect.Method r8 = r6.method
                java.lang.Object[] r9 = new java.lang.Object[r1]
                java.lang.String r10 = "No Retrofit annotation found."
                java.lang.RuntimeException r7 = retrofit2.Utils.parameterError(r8, r7, r10, r9)
                throw r7
            L3f:
                return r4
        }

        @javax.annotation.Nullable
        private retrofit2.ParameterHandler<?> parseParameterAnnotation(int r11, java.lang.reflect.Type r12, java.lang.annotation.Annotation[] r13, java.lang.annotation.Annotation r14) {
                r10 = this;
                java.lang.Class<java.lang.String> r0 = java.lang.String.class
                java.lang.Class<okhttp3.MultipartBody$Part> r1 = okhttp3.MultipartBody.Part.class
                boolean r2 = r14 instanceof retrofit2.http.Url
                java.lang.String r3 = "@Path parameters may not be used with @Url."
                r4 = 1
                r5 = 0
                if (r2 == 0) goto L9d
                r10.validateResolvableType(r11, r12)
                boolean r13 = r10.gotUrl
                if (r13 != 0) goto L92
                boolean r13 = r10.gotPath
                if (r13 != 0) goto L89
                boolean r13 = r10.gotQuery
                if (r13 != 0) goto L7e
                boolean r13 = r10.gotQueryName
                if (r13 != 0) goto L73
                boolean r13 = r10.gotQueryMap
                if (r13 != 0) goto L68
                java.lang.String r13 = r10.relativeUrl
                if (r13 != 0) goto L59
                r10.gotUrl = r4
                java.lang.Class<okhttp3.HttpUrl> r13 = okhttp3.HttpUrl.class
                if (r12 == r13) goto L51
                if (r12 == r0) goto L51
                java.lang.Class<java.net.URI> r13 = java.net.URI.class
                if (r12 == r13) goto L51
                boolean r13 = r12 instanceof java.lang.Class
                if (r13 == 0) goto L46
                java.lang.Class r12 = (java.lang.Class) r12
                java.lang.String r12 = r12.getName()
                java.lang.String r13 = "android.net.Uri"
                boolean r12 = r13.equals(r12)
                if (r12 == 0) goto L46
                goto L51
            L46:
                java.lang.reflect.Method r12 = r10.method
                java.lang.Object[] r13 = new java.lang.Object[r5]
                java.lang.String r14 = "@Url must be okhttp3.HttpUrl, String, java.net.URI, or android.net.Uri type."
                java.lang.RuntimeException r11 = retrofit2.Utils.parameterError(r12, r11, r14, r13)
                throw r11
            L51:
                retrofit2.ParameterHandler$RelativeUrl r12 = new retrofit2.ParameterHandler$RelativeUrl
                java.lang.reflect.Method r13 = r10.method
                r12.<init>(r13, r11)
                return r12
            L59:
                java.lang.reflect.Method r12 = r10.method
                java.lang.Object[] r13 = new java.lang.Object[r4]
                java.lang.String r14 = r10.httpMethod
                r13[r5] = r14
                java.lang.String r14 = "@Url cannot be used with @%s URL"
                java.lang.RuntimeException r11 = retrofit2.Utils.parameterError(r12, r11, r14, r13)
                throw r11
            L68:
                java.lang.reflect.Method r12 = r10.method
                java.lang.Object[] r13 = new java.lang.Object[r5]
                java.lang.String r14 = "A @Url parameter must not come after a @QueryMap."
                java.lang.RuntimeException r11 = retrofit2.Utils.parameterError(r12, r11, r14, r13)
                throw r11
            L73:
                java.lang.reflect.Method r12 = r10.method
                java.lang.Object[] r13 = new java.lang.Object[r5]
                java.lang.String r14 = "A @Url parameter must not come after a @QueryName."
                java.lang.RuntimeException r11 = retrofit2.Utils.parameterError(r12, r11, r14, r13)
                throw r11
            L7e:
                java.lang.reflect.Method r12 = r10.method
                java.lang.Object[] r13 = new java.lang.Object[r5]
                java.lang.String r14 = "A @Url parameter must not come after a @Query."
                java.lang.RuntimeException r11 = retrofit2.Utils.parameterError(r12, r11, r14, r13)
                throw r11
            L89:
                java.lang.reflect.Method r12 = r10.method
                java.lang.Object[] r13 = new java.lang.Object[r5]
                java.lang.RuntimeException r11 = retrofit2.Utils.parameterError(r12, r11, r3, r13)
                throw r11
            L92:
                java.lang.reflect.Method r12 = r10.method
                java.lang.Object[] r13 = new java.lang.Object[r5]
                java.lang.String r14 = "Multiple @Url method annotations found."
                java.lang.RuntimeException r11 = retrofit2.Utils.parameterError(r12, r11, r14, r13)
                throw r11
            L9d:
                boolean r2 = r14 instanceof retrofit2.http.Path
                if (r2 == 0) goto L110
                r10.validateResolvableType(r11, r12)
                boolean r0 = r10.gotQuery
                if (r0 != 0) goto L105
                boolean r0 = r10.gotQueryName
                if (r0 != 0) goto Lfa
                boolean r0 = r10.gotQueryMap
                if (r0 != 0) goto Lef
                boolean r0 = r10.gotUrl
                if (r0 != 0) goto Le6
                java.lang.String r0 = r10.relativeUrl
                if (r0 == 0) goto Ld7
                r10.gotPath = r4
                retrofit2.http.Path r14 = (retrofit2.http.Path) r14
                java.lang.String r3 = r14.value()
                r10.validatePathName(r11, r3)
                retrofit2.Retrofit r0 = r10.retrofit
                retrofit2.Converter r4 = r0.stringConverter(r12, r13)
                retrofit2.ParameterHandler$Path r12 = new retrofit2.ParameterHandler$Path
                java.lang.reflect.Method r1 = r10.method
                boolean r5 = r14.encoded()
                r0 = r12
                r2 = r11
                r0.<init>(r1, r2, r3, r4, r5)
                return r12
            Ld7:
                java.lang.reflect.Method r12 = r10.method
                java.lang.Object[] r13 = new java.lang.Object[r4]
                java.lang.String r14 = r10.httpMethod
                r13[r5] = r14
                java.lang.String r14 = "@Path can only be used with relative url on @%s"
                java.lang.RuntimeException r11 = retrofit2.Utils.parameterError(r12, r11, r14, r13)
                throw r11
            Le6:
                java.lang.reflect.Method r12 = r10.method
                java.lang.Object[] r13 = new java.lang.Object[r5]
                java.lang.RuntimeException r11 = retrofit2.Utils.parameterError(r12, r11, r3, r13)
                throw r11
            Lef:
                java.lang.reflect.Method r12 = r10.method
                java.lang.Object[] r13 = new java.lang.Object[r5]
                java.lang.String r14 = "A @Path parameter must not come after a @QueryMap."
                java.lang.RuntimeException r11 = retrofit2.Utils.parameterError(r12, r11, r14, r13)
                throw r11
            Lfa:
                java.lang.reflect.Method r12 = r10.method
                java.lang.Object[] r13 = new java.lang.Object[r5]
                java.lang.String r14 = "A @Path parameter must not come after a @QueryName."
                java.lang.RuntimeException r11 = retrofit2.Utils.parameterError(r12, r11, r14, r13)
                throw r11
            L105:
                java.lang.reflect.Method r12 = r10.method
                java.lang.Object[] r13 = new java.lang.Object[r5]
                java.lang.String r14 = "A @Path parameter must not come after a @Query."
                java.lang.RuntimeException r11 = retrofit2.Utils.parameterError(r12, r11, r14, r13)
                throw r11
            L110:
                boolean r2 = r14 instanceof retrofit2.http.Query
                java.lang.String r3 = "<String>)"
                java.lang.String r6 = " must include generic type (e.g., "
                if (r2 == 0) goto L19f
                r10.validateResolvableType(r11, r12)
                retrofit2.http.Query r14 = (retrofit2.http.Query) r14
                java.lang.String r0 = r14.value()
                boolean r14 = r14.encoded()
                java.lang.Class r1 = retrofit2.Utils.getRawType(r12)
                r10.gotQuery = r4
                java.lang.Class<java.lang.Iterable> r2 = java.lang.Iterable.class
                boolean r2 = r2.isAssignableFrom(r1)
                if (r2 == 0) goto L174
                boolean r2 = r12 instanceof java.lang.reflect.ParameterizedType
                if (r2 == 0) goto L14e
                java.lang.reflect.ParameterizedType r12 = (java.lang.reflect.ParameterizedType) r12
                java.lang.reflect.Type r11 = retrofit2.Utils.getParameterUpperBound(r5, r12)
                retrofit2.Retrofit r12 = r10.retrofit
                retrofit2.Converter r11 = r12.stringConverter(r11, r13)
                retrofit2.ParameterHandler$Query r12 = new retrofit2.ParameterHandler$Query
                r12.<init>(r0, r11, r14)
                retrofit2.ParameterHandler$1 r11 = new retrofit2.ParameterHandler$1
                r11.<init>(r12)
                return r11
            L14e:
                java.lang.reflect.Method r12 = r10.method
                java.lang.StringBuilder r13 = new java.lang.StringBuilder
                r13.<init>()
                java.lang.String r14 = r1.getSimpleName()
                r13.append(r14)
                r13.append(r6)
                java.lang.String r14 = r1.getSimpleName()
                r13.append(r14)
                r13.append(r3)
                java.lang.String r13 = r13.toString()
                java.lang.Object[] r14 = new java.lang.Object[r5]
                java.lang.RuntimeException r11 = retrofit2.Utils.parameterError(r12, r11, r13, r14)
                throw r11
            L174:
                boolean r11 = r1.isArray()
                if (r11 == 0) goto L193
                java.lang.Class r11 = r1.getComponentType()
                java.lang.Class r11 = boxIfPrimitive(r11)
                retrofit2.Retrofit r12 = r10.retrofit
                retrofit2.Converter r11 = r12.stringConverter(r11, r13)
                retrofit2.ParameterHandler$Query r12 = new retrofit2.ParameterHandler$Query
                r12.<init>(r0, r11, r14)
                retrofit2.ParameterHandler$2 r11 = new retrofit2.ParameterHandler$2
                r11.<init>(r12)
                return r11
            L193:
                retrofit2.Retrofit r11 = r10.retrofit
                retrofit2.Converter r11 = r11.stringConverter(r12, r13)
                retrofit2.ParameterHandler$Query r12 = new retrofit2.ParameterHandler$Query
                r12.<init>(r0, r11, r14)
                return r12
            L19f:
                boolean r2 = r14 instanceof retrofit2.http.QueryName
                if (r2 == 0) goto L226
                r10.validateResolvableType(r11, r12)
                retrofit2.http.QueryName r14 = (retrofit2.http.QueryName) r14
                boolean r14 = r14.encoded()
                java.lang.Class r0 = retrofit2.Utils.getRawType(r12)
                r10.gotQueryName = r4
                java.lang.Class<java.lang.Iterable> r1 = java.lang.Iterable.class
                boolean r1 = r1.isAssignableFrom(r0)
                if (r1 == 0) goto L1fb
                boolean r1 = r12 instanceof java.lang.reflect.ParameterizedType
                if (r1 == 0) goto L1d5
                java.lang.reflect.ParameterizedType r12 = (java.lang.reflect.ParameterizedType) r12
                java.lang.reflect.Type r11 = retrofit2.Utils.getParameterUpperBound(r5, r12)
                retrofit2.Retrofit r12 = r10.retrofit
                retrofit2.Converter r11 = r12.stringConverter(r11, r13)
                retrofit2.ParameterHandler$QueryName r12 = new retrofit2.ParameterHandler$QueryName
                r12.<init>(r11, r14)
                retrofit2.ParameterHandler$1 r11 = new retrofit2.ParameterHandler$1
                r11.<init>(r12)
                return r11
            L1d5:
                java.lang.reflect.Method r12 = r10.method
                java.lang.StringBuilder r13 = new java.lang.StringBuilder
                r13.<init>()
                java.lang.String r14 = r0.getSimpleName()
                r13.append(r14)
                r13.append(r6)
                java.lang.String r14 = r0.getSimpleName()
                r13.append(r14)
                r13.append(r3)
                java.lang.String r13 = r13.toString()
                java.lang.Object[] r14 = new java.lang.Object[r5]
                java.lang.RuntimeException r11 = retrofit2.Utils.parameterError(r12, r11, r13, r14)
                throw r11
            L1fb:
                boolean r11 = r0.isArray()
                if (r11 == 0) goto L21a
                java.lang.Class r11 = r0.getComponentType()
                java.lang.Class r11 = boxIfPrimitive(r11)
                retrofit2.Retrofit r12 = r10.retrofit
                retrofit2.Converter r11 = r12.stringConverter(r11, r13)
                retrofit2.ParameterHandler$QueryName r12 = new retrofit2.ParameterHandler$QueryName
                r12.<init>(r11, r14)
                retrofit2.ParameterHandler$2 r11 = new retrofit2.ParameterHandler$2
                r11.<init>(r12)
                return r11
            L21a:
                retrofit2.Retrofit r11 = r10.retrofit
                retrofit2.Converter r11 = r11.stringConverter(r12, r13)
                retrofit2.ParameterHandler$QueryName r12 = new retrofit2.ParameterHandler$QueryName
                r12.<init>(r11, r14)
                return r12
            L226:
                boolean r2 = r14 instanceof retrofit2.http.QueryMap
                java.lang.String r7 = "Map must include generic types (e.g., Map<String, String>)"
                if (r2 == 0) goto L295
                r10.validateResolvableType(r11, r12)
                java.lang.Class r1 = retrofit2.Utils.getRawType(r12)
                r10.gotQueryMap = r4
                java.lang.Class<java.util.Map> r2 = java.util.Map.class
                boolean r2 = r2.isAssignableFrom(r1)
                if (r2 == 0) goto L28a
                java.lang.Class<java.util.Map> r2 = java.util.Map.class
                java.lang.reflect.Type r12 = retrofit2.Utils.getSupertype(r12, r1, r2)
                boolean r1 = r12 instanceof java.lang.reflect.ParameterizedType
                if (r1 == 0) goto L281
                java.lang.reflect.ParameterizedType r12 = (java.lang.reflect.ParameterizedType) r12
                java.lang.reflect.Type r1 = retrofit2.Utils.getParameterUpperBound(r5, r12)
                if (r0 != r1) goto L267
                java.lang.reflect.Type r12 = retrofit2.Utils.getParameterUpperBound(r4, r12)
                retrofit2.Retrofit r0 = r10.retrofit
                retrofit2.Converter r12 = r0.stringConverter(r12, r13)
                retrofit2.ParameterHandler$QueryMap r13 = new retrofit2.ParameterHandler$QueryMap
                java.lang.reflect.Method r0 = r10.method
                retrofit2.http.QueryMap r14 = (retrofit2.http.QueryMap) r14
                boolean r14 = r14.encoded()
                r13.<init>(r0, r11, r12, r14)
                return r13
            L267:
                java.lang.reflect.Method r12 = r10.method
                java.lang.StringBuilder r13 = new java.lang.StringBuilder
                r13.<init>()
                java.lang.String r14 = "@QueryMap keys must be of type String: "
                r13.append(r14)
                r13.append(r1)
                java.lang.String r13 = r13.toString()
                java.lang.Object[] r14 = new java.lang.Object[r5]
                java.lang.RuntimeException r11 = retrofit2.Utils.parameterError(r12, r11, r13, r14)
                throw r11
            L281:
                java.lang.reflect.Method r12 = r10.method
                java.lang.Object[] r13 = new java.lang.Object[r5]
                java.lang.RuntimeException r11 = retrofit2.Utils.parameterError(r12, r11, r7, r13)
                throw r11
            L28a:
                java.lang.reflect.Method r12 = r10.method
                java.lang.Object[] r13 = new java.lang.Object[r5]
                java.lang.String r14 = "@QueryMap parameter type must be Map."
                java.lang.RuntimeException r11 = retrofit2.Utils.parameterError(r12, r11, r14, r13)
                throw r11
            L295:
                boolean r2 = r14 instanceof retrofit2.http.Header
                if (r2 == 0) goto L31a
                r10.validateResolvableType(r11, r12)
                retrofit2.http.Header r14 = (retrofit2.http.Header) r14
                java.lang.String r14 = r14.value()
                java.lang.Class r0 = retrofit2.Utils.getRawType(r12)
                java.lang.Class<java.lang.Iterable> r1 = java.lang.Iterable.class
                boolean r1 = r1.isAssignableFrom(r0)
                if (r1 == 0) goto L2ef
                boolean r1 = r12 instanceof java.lang.reflect.ParameterizedType
                if (r1 == 0) goto L2c9
                java.lang.reflect.ParameterizedType r12 = (java.lang.reflect.ParameterizedType) r12
                java.lang.reflect.Type r11 = retrofit2.Utils.getParameterUpperBound(r5, r12)
                retrofit2.Retrofit r12 = r10.retrofit
                retrofit2.Converter r11 = r12.stringConverter(r11, r13)
                retrofit2.ParameterHandler$Header r12 = new retrofit2.ParameterHandler$Header
                r12.<init>(r14, r11)
                retrofit2.ParameterHandler$1 r11 = new retrofit2.ParameterHandler$1
                r11.<init>(r12)
                return r11
            L2c9:
                java.lang.reflect.Method r12 = r10.method
                java.lang.StringBuilder r13 = new java.lang.StringBuilder
                r13.<init>()
                java.lang.String r14 = r0.getSimpleName()
                r13.append(r14)
                r13.append(r6)
                java.lang.String r14 = r0.getSimpleName()
                r13.append(r14)
                r13.append(r3)
                java.lang.String r13 = r13.toString()
                java.lang.Object[] r14 = new java.lang.Object[r5]
                java.lang.RuntimeException r11 = retrofit2.Utils.parameterError(r12, r11, r13, r14)
                throw r11
            L2ef:
                boolean r11 = r0.isArray()
                if (r11 == 0) goto L30e
                java.lang.Class r11 = r0.getComponentType()
                java.lang.Class r11 = boxIfPrimitive(r11)
                retrofit2.Retrofit r12 = r10.retrofit
                retrofit2.Converter r11 = r12.stringConverter(r11, r13)
                retrofit2.ParameterHandler$Header r12 = new retrofit2.ParameterHandler$Header
                r12.<init>(r14, r11)
                retrofit2.ParameterHandler$2 r11 = new retrofit2.ParameterHandler$2
                r11.<init>(r12)
                return r11
            L30e:
                retrofit2.Retrofit r11 = r10.retrofit
                retrofit2.Converter r11 = r11.stringConverter(r12, r13)
                retrofit2.ParameterHandler$Header r12 = new retrofit2.ParameterHandler$Header
                r12.<init>(r14, r11)
                return r12
            L31a:
                boolean r2 = r14 instanceof retrofit2.http.HeaderMap
                if (r2 == 0) goto L38b
                java.lang.Class<okhttp3.Headers> r14 = okhttp3.Headers.class
                if (r12 != r14) goto L32a
                retrofit2.ParameterHandler$Headers r12 = new retrofit2.ParameterHandler$Headers
                java.lang.reflect.Method r13 = r10.method
                r12.<init>(r13, r11)
                return r12
            L32a:
                r10.validateResolvableType(r11, r12)
                java.lang.Class r14 = retrofit2.Utils.getRawType(r12)
                java.lang.Class<java.util.Map> r1 = java.util.Map.class
                boolean r1 = r1.isAssignableFrom(r14)
                if (r1 == 0) goto L380
                java.lang.Class<java.util.Map> r1 = java.util.Map.class
                java.lang.reflect.Type r12 = retrofit2.Utils.getSupertype(r12, r14, r1)
                boolean r14 = r12 instanceof java.lang.reflect.ParameterizedType
                if (r14 == 0) goto L377
                java.lang.reflect.ParameterizedType r12 = (java.lang.reflect.ParameterizedType) r12
                java.lang.reflect.Type r14 = retrofit2.Utils.getParameterUpperBound(r5, r12)
                if (r0 != r14) goto L35d
                java.lang.reflect.Type r12 = retrofit2.Utils.getParameterUpperBound(r4, r12)
                retrofit2.Retrofit r14 = r10.retrofit
                retrofit2.Converter r12 = r14.stringConverter(r12, r13)
                retrofit2.ParameterHandler$HeaderMap r13 = new retrofit2.ParameterHandler$HeaderMap
                java.lang.reflect.Method r14 = r10.method
                r13.<init>(r14, r11, r12)
                return r13
            L35d:
                java.lang.reflect.Method r12 = r10.method
                java.lang.StringBuilder r13 = new java.lang.StringBuilder
                r13.<init>()
                java.lang.String r0 = "@HeaderMap keys must be of type String: "
                r13.append(r0)
                r13.append(r14)
                java.lang.String r13 = r13.toString()
                java.lang.Object[] r14 = new java.lang.Object[r5]
                java.lang.RuntimeException r11 = retrofit2.Utils.parameterError(r12, r11, r13, r14)
                throw r11
            L377:
                java.lang.reflect.Method r12 = r10.method
                java.lang.Object[] r13 = new java.lang.Object[r5]
                java.lang.RuntimeException r11 = retrofit2.Utils.parameterError(r12, r11, r7, r13)
                throw r11
            L380:
                java.lang.reflect.Method r12 = r10.method
                java.lang.Object[] r13 = new java.lang.Object[r5]
                java.lang.String r14 = "@HeaderMap parameter type must be Map."
                java.lang.RuntimeException r11 = retrofit2.Utils.parameterError(r12, r11, r14, r13)
                throw r11
            L38b:
                boolean r2 = r14 instanceof retrofit2.http.Field
                if (r2 == 0) goto L425
                r10.validateResolvableType(r11, r12)
                boolean r0 = r10.isFormEncoded
                if (r0 == 0) goto L41a
                retrofit2.http.Field r14 = (retrofit2.http.Field) r14
                java.lang.String r0 = r14.value()
                boolean r14 = r14.encoded()
                r10.gotField = r4
                java.lang.Class r1 = retrofit2.Utils.getRawType(r12)
                java.lang.Class<java.lang.Iterable> r2 = java.lang.Iterable.class
                boolean r2 = r2.isAssignableFrom(r1)
                if (r2 == 0) goto L3ef
                boolean r2 = r12 instanceof java.lang.reflect.ParameterizedType
                if (r2 == 0) goto L3c9
                java.lang.reflect.ParameterizedType r12 = (java.lang.reflect.ParameterizedType) r12
                java.lang.reflect.Type r11 = retrofit2.Utils.getParameterUpperBound(r5, r12)
                retrofit2.Retrofit r12 = r10.retrofit
                retrofit2.Converter r11 = r12.stringConverter(r11, r13)
                retrofit2.ParameterHandler$Field r12 = new retrofit2.ParameterHandler$Field
                r12.<init>(r0, r11, r14)
                retrofit2.ParameterHandler$1 r11 = new retrofit2.ParameterHandler$1
                r11.<init>(r12)
                return r11
            L3c9:
                java.lang.reflect.Method r12 = r10.method
                java.lang.StringBuilder r13 = new java.lang.StringBuilder
                r13.<init>()
                java.lang.String r14 = r1.getSimpleName()
                r13.append(r14)
                r13.append(r6)
                java.lang.String r14 = r1.getSimpleName()
                r13.append(r14)
                r13.append(r3)
                java.lang.String r13 = r13.toString()
                java.lang.Object[] r14 = new java.lang.Object[r5]
                java.lang.RuntimeException r11 = retrofit2.Utils.parameterError(r12, r11, r13, r14)
                throw r11
            L3ef:
                boolean r11 = r1.isArray()
                if (r11 == 0) goto L40e
                java.lang.Class r11 = r1.getComponentType()
                java.lang.Class r11 = boxIfPrimitive(r11)
                retrofit2.Retrofit r12 = r10.retrofit
                retrofit2.Converter r11 = r12.stringConverter(r11, r13)
                retrofit2.ParameterHandler$Field r12 = new retrofit2.ParameterHandler$Field
                r12.<init>(r0, r11, r14)
                retrofit2.ParameterHandler$2 r11 = new retrofit2.ParameterHandler$2
                r11.<init>(r12)
                return r11
            L40e:
                retrofit2.Retrofit r11 = r10.retrofit
                retrofit2.Converter r11 = r11.stringConverter(r12, r13)
                retrofit2.ParameterHandler$Field r12 = new retrofit2.ParameterHandler$Field
                r12.<init>(r0, r11, r14)
                return r12
            L41a:
                java.lang.reflect.Method r12 = r10.method
                java.lang.Object[] r13 = new java.lang.Object[r5]
                java.lang.String r14 = "@Field parameters can only be used with form encoding."
                java.lang.RuntimeException r11 = retrofit2.Utils.parameterError(r12, r11, r14, r13)
                throw r11
            L425:
                boolean r2 = r14 instanceof retrofit2.http.FieldMap
                if (r2 == 0) goto L4a1
                r10.validateResolvableType(r11, r12)
                boolean r1 = r10.isFormEncoded
                if (r1 == 0) goto L496
                java.lang.Class r1 = retrofit2.Utils.getRawType(r12)
                java.lang.Class<java.util.Map> r2 = java.util.Map.class
                boolean r2 = r2.isAssignableFrom(r1)
                if (r2 == 0) goto L48b
                java.lang.Class<java.util.Map> r2 = java.util.Map.class
                java.lang.reflect.Type r12 = retrofit2.Utils.getSupertype(r12, r1, r2)
                boolean r1 = r12 instanceof java.lang.reflect.ParameterizedType
                if (r1 == 0) goto L482
                java.lang.reflect.ParameterizedType r12 = (java.lang.reflect.ParameterizedType) r12
                java.lang.reflect.Type r1 = retrofit2.Utils.getParameterUpperBound(r5, r12)
                if (r0 != r1) goto L468
                java.lang.reflect.Type r12 = retrofit2.Utils.getParameterUpperBound(r4, r12)
                retrofit2.Retrofit r0 = r10.retrofit
                retrofit2.Converter r12 = r0.stringConverter(r12, r13)
                r10.gotField = r4
                retrofit2.ParameterHandler$FieldMap r13 = new retrofit2.ParameterHandler$FieldMap
                java.lang.reflect.Method r0 = r10.method
                retrofit2.http.FieldMap r14 = (retrofit2.http.FieldMap) r14
                boolean r14 = r14.encoded()
                r13.<init>(r0, r11, r12, r14)
                return r13
            L468:
                java.lang.reflect.Method r12 = r10.method
                java.lang.StringBuilder r13 = new java.lang.StringBuilder
                r13.<init>()
                java.lang.String r14 = "@FieldMap keys must be of type String: "
                r13.append(r14)
                r13.append(r1)
                java.lang.String r13 = r13.toString()
                java.lang.Object[] r14 = new java.lang.Object[r5]
                java.lang.RuntimeException r11 = retrofit2.Utils.parameterError(r12, r11, r13, r14)
                throw r11
            L482:
                java.lang.reflect.Method r12 = r10.method
                java.lang.Object[] r13 = new java.lang.Object[r5]
                java.lang.RuntimeException r11 = retrofit2.Utils.parameterError(r12, r11, r7, r13)
                throw r11
            L48b:
                java.lang.reflect.Method r12 = r10.method
                java.lang.Object[] r13 = new java.lang.Object[r5]
                java.lang.String r14 = "@FieldMap parameter type must be Map."
                java.lang.RuntimeException r11 = retrofit2.Utils.parameterError(r12, r11, r14, r13)
                throw r11
            L496:
                java.lang.reflect.Method r12 = r10.method
                java.lang.Object[] r13 = new java.lang.Object[r5]
                java.lang.String r14 = "@FieldMap parameters can only be used with form encoding."
                java.lang.RuntimeException r11 = retrofit2.Utils.parameterError(r12, r11, r14, r13)
                throw r11
            L4a1:
                boolean r2 = r14 instanceof retrofit2.http.Part
                if (r2 == 0) goto L62b
                r10.validateResolvableType(r11, r12)
                boolean r0 = r10.isMultipart
                if (r0 == 0) goto L620
                retrofit2.http.Part r14 = (retrofit2.http.Part) r14
                r10.gotPart = r4
                java.lang.String r0 = r14.value()
                java.lang.Class r2 = retrofit2.Utils.getRawType(r12)
                boolean r7 = r0.isEmpty()
                if (r7 == 0) goto L54c
                java.lang.Class<java.lang.Iterable> r13 = java.lang.Iterable.class
                boolean r13 = r13.isAssignableFrom(r2)
                java.lang.String r14 = "@Part annotation must supply a name or use MultipartBody.Part parameter type."
                if (r13 == 0) goto L516
                boolean r13 = r12 instanceof java.lang.reflect.ParameterizedType
                if (r13 == 0) goto L4f0
                java.lang.reflect.ParameterizedType r12 = (java.lang.reflect.ParameterizedType) r12
                java.lang.reflect.Type r12 = retrofit2.Utils.getParameterUpperBound(r5, r12)
                java.lang.Class r12 = retrofit2.Utils.getRawType(r12)
                boolean r12 = r1.isAssignableFrom(r12)
                if (r12 == 0) goto L4e7
                retrofit2.ParameterHandler$RawPart r11 = retrofit2.ParameterHandler.RawPart.INSTANCE
                java.util.Objects.requireNonNull(r11)
                retrofit2.ParameterHandler$1 r12 = new retrofit2.ParameterHandler$1
                r12.<init>(r11)
                return r12
            L4e7:
                java.lang.reflect.Method r12 = r10.method
                java.lang.Object[] r13 = new java.lang.Object[r5]
                java.lang.RuntimeException r11 = retrofit2.Utils.parameterError(r12, r11, r14, r13)
                throw r11
            L4f0:
                java.lang.reflect.Method r12 = r10.method
                java.lang.StringBuilder r13 = new java.lang.StringBuilder
                r13.<init>()
                java.lang.String r14 = r2.getSimpleName()
                r13.append(r14)
                r13.append(r6)
                java.lang.String r14 = r2.getSimpleName()
                r13.append(r14)
                r13.append(r3)
                java.lang.String r13 = r13.toString()
                java.lang.Object[] r14 = new java.lang.Object[r5]
                java.lang.RuntimeException r11 = retrofit2.Utils.parameterError(r12, r11, r13, r14)
                throw r11
            L516:
                boolean r12 = r2.isArray()
                if (r12 == 0) goto L53a
                java.lang.Class r12 = r2.getComponentType()
                boolean r12 = r1.isAssignableFrom(r12)
                if (r12 == 0) goto L531
                retrofit2.ParameterHandler$RawPart r11 = retrofit2.ParameterHandler.RawPart.INSTANCE
                java.util.Objects.requireNonNull(r11)
                retrofit2.ParameterHandler$2 r12 = new retrofit2.ParameterHandler$2
                r12.<init>(r11)
                return r12
            L531:
                java.lang.reflect.Method r12 = r10.method
                java.lang.Object[] r13 = new java.lang.Object[r5]
                java.lang.RuntimeException r11 = retrofit2.Utils.parameterError(r12, r11, r14, r13)
                throw r11
            L53a:
                boolean r12 = r1.isAssignableFrom(r2)
                if (r12 == 0) goto L543
                retrofit2.ParameterHandler$RawPart r11 = retrofit2.ParameterHandler.RawPart.INSTANCE
                return r11
            L543:
                java.lang.reflect.Method r12 = r10.method
                java.lang.Object[] r13 = new java.lang.Object[r5]
                java.lang.RuntimeException r11 = retrofit2.Utils.parameterError(r12, r11, r14, r13)
                throw r11
            L54c:
                r7 = 4
                java.lang.String[] r7 = new java.lang.String[r7]
                java.lang.String r8 = "Content-Disposition"
                r7[r5] = r8
                java.lang.String r8 = "form-data; name=\""
                java.lang.String r9 = "\""
                java.lang.String r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r8, r0, r9)
                r7[r4] = r0
                r0 = 2
                java.lang.String r4 = "Content-Transfer-Encoding"
                r7[r0] = r4
                r0 = 3
                java.lang.String r14 = r14.encoding()
                r7[r0] = r14
                okhttp3.Headers r14 = okhttp3.Headers.of(r7)
                java.lang.Class<java.lang.Iterable> r0 = java.lang.Iterable.class
                boolean r0 = r0.isAssignableFrom(r2)
                java.lang.String r4 = "@Part parameters using the MultipartBody.Part must not include a part name in the annotation."
                if (r0 == 0) goto L5cf
                boolean r0 = r12 instanceof java.lang.reflect.ParameterizedType
                if (r0 == 0) goto L5a9
                java.lang.reflect.ParameterizedType r12 = (java.lang.reflect.ParameterizedType) r12
                java.lang.reflect.Type r12 = retrofit2.Utils.getParameterUpperBound(r5, r12)
                java.lang.Class r0 = retrofit2.Utils.getRawType(r12)
                boolean r0 = r1.isAssignableFrom(r0)
                if (r0 != 0) goto L5a0
                retrofit2.Retrofit r0 = r10.retrofit
                java.lang.annotation.Annotation[] r1 = r10.methodAnnotations
                retrofit2.Converter r12 = r0.requestBodyConverter(r12, r13, r1)
                retrofit2.ParameterHandler$Part r13 = new retrofit2.ParameterHandler$Part
                java.lang.reflect.Method r0 = r10.method
                r13.<init>(r0, r11, r14, r12)
                retrofit2.ParameterHandler$1 r11 = new retrofit2.ParameterHandler$1
                r11.<init>(r13)
                return r11
            L5a0:
                java.lang.reflect.Method r12 = r10.method
                java.lang.Object[] r13 = new java.lang.Object[r5]
                java.lang.RuntimeException r11 = retrofit2.Utils.parameterError(r12, r11, r4, r13)
                throw r11
            L5a9:
                java.lang.reflect.Method r12 = r10.method
                java.lang.StringBuilder r13 = new java.lang.StringBuilder
                r13.<init>()
                java.lang.String r14 = r2.getSimpleName()
                r13.append(r14)
                r13.append(r6)
                java.lang.String r14 = r2.getSimpleName()
                r13.append(r14)
                r13.append(r3)
                java.lang.String r13 = r13.toString()
                java.lang.Object[] r14 = new java.lang.Object[r5]
                java.lang.RuntimeException r11 = retrofit2.Utils.parameterError(r12, r11, r13, r14)
                throw r11
            L5cf:
                boolean r0 = r2.isArray()
                if (r0 == 0) goto L601
                java.lang.Class r12 = r2.getComponentType()
                java.lang.Class r12 = boxIfPrimitive(r12)
                boolean r0 = r1.isAssignableFrom(r12)
                if (r0 != 0) goto L5f8
                retrofit2.Retrofit r0 = r10.retrofit
                java.lang.annotation.Annotation[] r1 = r10.methodAnnotations
                retrofit2.Converter r12 = r0.requestBodyConverter(r12, r13, r1)
                retrofit2.ParameterHandler$Part r13 = new retrofit2.ParameterHandler$Part
                java.lang.reflect.Method r0 = r10.method
                r13.<init>(r0, r11, r14, r12)
                retrofit2.ParameterHandler$2 r11 = new retrofit2.ParameterHandler$2
                r11.<init>(r13)
                return r11
            L5f8:
                java.lang.reflect.Method r12 = r10.method
                java.lang.Object[] r13 = new java.lang.Object[r5]
                java.lang.RuntimeException r11 = retrofit2.Utils.parameterError(r12, r11, r4, r13)
                throw r11
            L601:
                boolean r0 = r1.isAssignableFrom(r2)
                if (r0 != 0) goto L617
                retrofit2.Retrofit r0 = r10.retrofit
                java.lang.annotation.Annotation[] r1 = r10.methodAnnotations
                retrofit2.Converter r12 = r0.requestBodyConverter(r12, r13, r1)
                retrofit2.ParameterHandler$Part r13 = new retrofit2.ParameterHandler$Part
                java.lang.reflect.Method r0 = r10.method
                r13.<init>(r0, r11, r14, r12)
                return r13
            L617:
                java.lang.reflect.Method r12 = r10.method
                java.lang.Object[] r13 = new java.lang.Object[r5]
                java.lang.RuntimeException r11 = retrofit2.Utils.parameterError(r12, r11, r4, r13)
                throw r11
            L620:
                java.lang.reflect.Method r12 = r10.method
                java.lang.Object[] r13 = new java.lang.Object[r5]
                java.lang.String r14 = "@Part parameters can only be used with multipart encoding."
                java.lang.RuntimeException r11 = retrofit2.Utils.parameterError(r12, r11, r14, r13)
                throw r11
            L62b:
                boolean r2 = r14 instanceof retrofit2.http.PartMap
                if (r2 == 0) goto L6be
                r10.validateResolvableType(r11, r12)
                boolean r2 = r10.isMultipart
                if (r2 == 0) goto L6b3
                r10.gotPart = r4
                java.lang.Class r2 = retrofit2.Utils.getRawType(r12)
                java.lang.Class<java.util.Map> r3 = java.util.Map.class
                boolean r3 = r3.isAssignableFrom(r2)
                if (r3 == 0) goto L6a8
                java.lang.Class<java.util.Map> r3 = java.util.Map.class
                java.lang.reflect.Type r12 = retrofit2.Utils.getSupertype(r12, r2, r3)
                boolean r2 = r12 instanceof java.lang.reflect.ParameterizedType
                if (r2 == 0) goto L69f
                java.lang.reflect.ParameterizedType r12 = (java.lang.reflect.ParameterizedType) r12
                java.lang.reflect.Type r2 = retrofit2.Utils.getParameterUpperBound(r5, r12)
                if (r0 != r2) goto L685
                java.lang.reflect.Type r12 = retrofit2.Utils.getParameterUpperBound(r4, r12)
                java.lang.Class r0 = retrofit2.Utils.getRawType(r12)
                boolean r0 = r1.isAssignableFrom(r0)
                if (r0 != 0) goto L67a
                retrofit2.Retrofit r0 = r10.retrofit
                java.lang.annotation.Annotation[] r1 = r10.methodAnnotations
                retrofit2.Converter r12 = r0.requestBodyConverter(r12, r13, r1)
                retrofit2.http.PartMap r14 = (retrofit2.http.PartMap) r14
                retrofit2.ParameterHandler$PartMap r13 = new retrofit2.ParameterHandler$PartMap
                java.lang.reflect.Method r0 = r10.method
                java.lang.String r14 = r14.encoding()
                r13.<init>(r0, r11, r12, r14)
                return r13
            L67a:
                java.lang.reflect.Method r12 = r10.method
                java.lang.Object[] r13 = new java.lang.Object[r5]
                java.lang.String r14 = "@PartMap values cannot be MultipartBody.Part. Use @Part List<Part> or a different value type instead."
                java.lang.RuntimeException r11 = retrofit2.Utils.parameterError(r12, r11, r14, r13)
                throw r11
            L685:
                java.lang.reflect.Method r12 = r10.method
                java.lang.StringBuilder r13 = new java.lang.StringBuilder
                r13.<init>()
                java.lang.String r14 = "@PartMap keys must be of type String: "
                r13.append(r14)
                r13.append(r2)
                java.lang.String r13 = r13.toString()
                java.lang.Object[] r14 = new java.lang.Object[r5]
                java.lang.RuntimeException r11 = retrofit2.Utils.parameterError(r12, r11, r13, r14)
                throw r11
            L69f:
                java.lang.reflect.Method r12 = r10.method
                java.lang.Object[] r13 = new java.lang.Object[r5]
                java.lang.RuntimeException r11 = retrofit2.Utils.parameterError(r12, r11, r7, r13)
                throw r11
            L6a8:
                java.lang.reflect.Method r12 = r10.method
                java.lang.Object[] r13 = new java.lang.Object[r5]
                java.lang.String r14 = "@PartMap parameter type must be Map."
                java.lang.RuntimeException r11 = retrofit2.Utils.parameterError(r12, r11, r14, r13)
                throw r11
            L6b3:
                java.lang.reflect.Method r12 = r10.method
                java.lang.Object[] r13 = new java.lang.Object[r5]
                java.lang.String r14 = "@PartMap parameters can only be used with multipart encoding."
                java.lang.RuntimeException r11 = retrofit2.Utils.parameterError(r12, r11, r14, r13)
                throw r11
            L6be:
                boolean r0 = r14 instanceof retrofit2.http.Body
                if (r0 == 0) goto L707
                r10.validateResolvableType(r11, r12)
                boolean r14 = r10.isFormEncoded
                if (r14 != 0) goto L6fc
                boolean r14 = r10.isMultipart
                if (r14 != 0) goto L6fc
                boolean r14 = r10.gotBody
                if (r14 != 0) goto L6f1
                retrofit2.Retrofit r14 = r10.retrofit     // Catch: java.lang.RuntimeException -> L6e3
                java.lang.annotation.Annotation[] r0 = r10.methodAnnotations     // Catch: java.lang.RuntimeException -> L6e3
                retrofit2.Converter r12 = r14.requestBodyConverter(r12, r13, r0)     // Catch: java.lang.RuntimeException -> L6e3
                r10.gotBody = r4
                retrofit2.ParameterHandler$Body r13 = new retrofit2.ParameterHandler$Body
                java.lang.reflect.Method r14 = r10.method
                r13.<init>(r14, r11, r12)
                return r13
            L6e3:
                r13 = move-exception
                java.lang.reflect.Method r14 = r10.method
                java.lang.Object[] r0 = new java.lang.Object[r4]
                r0[r5] = r12
                java.lang.String r12 = "Unable to create @Body converter for %s"
                java.lang.RuntimeException r11 = retrofit2.Utils.parameterError(r14, r13, r11, r12, r0)
                throw r11
            L6f1:
                java.lang.reflect.Method r12 = r10.method
                java.lang.Object[] r13 = new java.lang.Object[r5]
                java.lang.String r14 = "Multiple @Body method annotations found."
                java.lang.RuntimeException r11 = retrofit2.Utils.parameterError(r12, r11, r14, r13)
                throw r11
            L6fc:
                java.lang.reflect.Method r12 = r10.method
                java.lang.Object[] r13 = new java.lang.Object[r5]
                java.lang.String r14 = "@Body parameters cannot be used with form or multi-part encoding."
                java.lang.RuntimeException r11 = retrofit2.Utils.parameterError(r12, r11, r14, r13)
                throw r11
            L707:
                boolean r13 = r14 instanceof retrofit2.http.Tag
                if (r13 == 0) goto L75a
                r10.validateResolvableType(r11, r12)
                java.lang.Class r12 = retrofit2.Utils.getRawType(r12)
                int r13 = r11 + (-1)
            L714:
                if (r13 < 0) goto L754
                retrofit2.ParameterHandler<?>[] r14 = r10.parameterHandlers
                r14 = r14[r13]
                boolean r0 = r14 instanceof retrofit2.ParameterHandler.Tag
                if (r0 == 0) goto L751
                retrofit2.ParameterHandler$Tag r14 = (retrofit2.ParameterHandler.Tag) r14
                java.lang.Class<T> r14 = r14.cls
                boolean r14 = r14.equals(r12)
                if (r14 != 0) goto L729
                goto L751
            L729:
                java.lang.reflect.Method r14 = r10.method
                java.lang.String r0 = "@Tag type "
                java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
                java.lang.String r12 = r12.getName()
                r0.append(r12)
                java.lang.String r12 = " is duplicate of parameter #"
                r0.append(r12)
                int r13 = r13 + r4
                r0.append(r13)
                java.lang.String r12 = " and would always overwrite its value."
                r0.append(r12)
                java.lang.String r12 = r0.toString()
                java.lang.Object[] r13 = new java.lang.Object[r5]
                java.lang.RuntimeException r11 = retrofit2.Utils.parameterError(r14, r11, r12, r13)
                throw r11
            L751:
                int r13 = r13 + (-1)
                goto L714
            L754:
                retrofit2.ParameterHandler$Tag r11 = new retrofit2.ParameterHandler$Tag
                r11.<init>(r12)
                return r11
            L75a:
                r11 = 0
                return r11
        }

        private void validatePathName(int r6, java.lang.String r7) {
                r5 = this;
                java.util.regex.Pattern r0 = retrofit2.RequestFactory.Builder.PARAM_NAME_REGEX
                java.util.regex.Matcher r0 = r0.matcher(r7)
                boolean r0 = r0.matches()
                r1 = 1
                r2 = 0
                r3 = 2
                if (r0 == 0) goto L29
                java.util.Set<java.lang.String> r0 = r5.relativeUrlParamNames
                boolean r0 = r0.contains(r7)
                if (r0 == 0) goto L18
                return
            L18:
                java.lang.reflect.Method r0 = r5.method
                java.lang.Object[] r3 = new java.lang.Object[r3]
                java.lang.String r4 = r5.relativeUrl
                r3[r2] = r4
                r3[r1] = r7
                java.lang.String r7 = "URL \"%s\" does not contain \"{%s}\"."
                java.lang.RuntimeException r6 = retrofit2.Utils.parameterError(r0, r6, r7, r3)
                throw r6
            L29:
                java.lang.reflect.Method r0 = r5.method
                java.lang.Object[] r3 = new java.lang.Object[r3]
                java.util.regex.Pattern r4 = retrofit2.RequestFactory.Builder.PARAM_URL_REGEX
                java.lang.String r4 = r4.pattern()
                r3[r2] = r4
                r3[r1] = r7
                java.lang.String r7 = "@Path parameter name must match %s. Found: %s"
                java.lang.RuntimeException r6 = retrofit2.Utils.parameterError(r0, r6, r7, r3)
                throw r6
        }

        private void validateResolvableType(int r4, java.lang.reflect.Type r5) {
                r3 = this;
                boolean r0 = retrofit2.Utils.hasUnresolvableType(r5)
                if (r0 != 0) goto L7
                return
            L7:
                java.lang.reflect.Method r0 = r3.method
                r1 = 1
                java.lang.Object[] r1 = new java.lang.Object[r1]
                r2 = 0
                r1[r2] = r5
                java.lang.String r5 = "Parameter type must not include a type variable or wildcard: %s"
                java.lang.RuntimeException r4 = retrofit2.Utils.parameterError(r0, r4, r5, r1)
                throw r4
        }

        public final retrofit2.RequestFactory build() {
                r9 = this;
                java.lang.annotation.Annotation[] r0 = r9.methodAnnotations
                int r1 = r0.length
                r2 = 0
                r3 = 0
            L5:
                if (r3 >= r1) goto Lf
                r4 = r0[r3]
                r9.parseMethodAnnotation(r4)
                int r3 = r3 + 1
                goto L5
            Lf:
                java.lang.String r0 = r9.httpMethod
                r1 = 0
                if (r0 == 0) goto Lbb
                boolean r0 = r9.hasBody
                if (r0 != 0) goto L37
                boolean r0 = r9.isMultipart
                if (r0 != 0) goto L2c
                boolean r0 = r9.isFormEncoded
                if (r0 != 0) goto L21
                goto L37
            L21:
                java.lang.reflect.Method r0 = r9.method
                java.lang.Object[] r2 = new java.lang.Object[r2]
                java.lang.String r3 = "FormUrlEncoded can only be specified on HTTP methods with request body (e.g., @POST)."
                java.lang.RuntimeException r0 = retrofit2.Utils.methodError(r0, r1, r3, r2)
                throw r0
            L2c:
                java.lang.reflect.Method r0 = r9.method
                java.lang.Object[] r2 = new java.lang.Object[r2]
                java.lang.String r3 = "Multipart can only be specified on HTTP methods with request body (e.g., @POST)."
                java.lang.RuntimeException r0 = retrofit2.Utils.methodError(r0, r1, r3, r2)
                throw r0
            L37:
                java.lang.annotation.Annotation[][] r0 = r9.parameterAnnotationsArray
                int r0 = r0.length
                retrofit2.ParameterHandler[] r3 = new retrofit2.ParameterHandler[r0]
                r9.parameterHandlers = r3
                int r3 = r0 + (-1)
                r4 = 0
            L41:
                r5 = 1
                if (r4 >= r0) goto L5b
                retrofit2.ParameterHandler<?>[] r6 = r9.parameterHandlers
                java.lang.reflect.Type[] r7 = r9.parameterTypes
                r7 = r7[r4]
                java.lang.annotation.Annotation[][] r8 = r9.parameterAnnotationsArray
                r8 = r8[r4]
                if (r4 != r3) goto L51
                goto L52
            L51:
                r5 = 0
            L52:
                retrofit2.ParameterHandler r5 = r9.parseParameter(r4, r7, r8, r5)
                r6[r4] = r5
                int r4 = r4 + 1
                goto L41
            L5b:
                java.lang.String r0 = r9.relativeUrl
                if (r0 != 0) goto L73
                boolean r0 = r9.gotUrl
                if (r0 == 0) goto L64
                goto L73
            L64:
                java.lang.reflect.Method r0 = r9.method
                java.lang.Object[] r3 = new java.lang.Object[r5]
                java.lang.String r4 = r9.httpMethod
                r3[r2] = r4
                java.lang.String r2 = "Missing either @%s URL or @Url parameter."
                java.lang.RuntimeException r0 = retrofit2.Utils.methodError(r0, r1, r2, r3)
                throw r0
            L73:
                boolean r0 = r9.isFormEncoded
                if (r0 != 0) goto L8f
                boolean r3 = r9.isMultipart
                if (r3 != 0) goto L8f
                boolean r3 = r9.hasBody
                if (r3 != 0) goto L8f
                boolean r3 = r9.gotBody
                if (r3 != 0) goto L84
                goto L8f
            L84:
                java.lang.reflect.Method r0 = r9.method
                java.lang.Object[] r2 = new java.lang.Object[r2]
                java.lang.String r3 = "Non-body HTTP method cannot contain @Body."
                java.lang.RuntimeException r0 = retrofit2.Utils.methodError(r0, r1, r3, r2)
                throw r0
            L8f:
                if (r0 == 0) goto La1
                boolean r0 = r9.gotField
                if (r0 == 0) goto L96
                goto La1
            L96:
                java.lang.reflect.Method r0 = r9.method
                java.lang.Object[] r2 = new java.lang.Object[r2]
                java.lang.String r3 = "Form-encoded method must contain at least one @Field."
                java.lang.RuntimeException r0 = retrofit2.Utils.methodError(r0, r1, r3, r2)
                throw r0
            La1:
                boolean r0 = r9.isMultipart
                if (r0 == 0) goto Lb5
                boolean r0 = r9.gotPart
                if (r0 == 0) goto Laa
                goto Lb5
            Laa:
                java.lang.reflect.Method r0 = r9.method
                java.lang.Object[] r2 = new java.lang.Object[r2]
                java.lang.String r3 = "Multipart method must contain at least one @Part."
                java.lang.RuntimeException r0 = retrofit2.Utils.methodError(r0, r1, r3, r2)
                throw r0
            Lb5:
                retrofit2.RequestFactory r0 = new retrofit2.RequestFactory
                r0.<init>(r9)
                return r0
            Lbb:
                java.lang.reflect.Method r0 = r9.method
                java.lang.Object[] r2 = new java.lang.Object[r2]
                java.lang.String r3 = "HTTP method annotation is required (e.g., @GET, @POST, etc.)."
                java.lang.RuntimeException r0 = retrofit2.Utils.methodError(r0, r1, r3, r2)
                throw r0
        }
    }

    public RequestFactory(retrofit2.RequestFactory.Builder r2) {
            r1 = this;
            r1.<init>()
            java.lang.reflect.Method r0 = r2.method
            r1.method = r0
            retrofit2.Retrofit r0 = r2.retrofit
            okhttp3.HttpUrl r0 = r0.baseUrl
            r1.baseUrl = r0
            java.lang.String r0 = r2.httpMethod
            r1.httpMethod = r0
            java.lang.String r0 = r2.relativeUrl
            r1.relativeUrl = r0
            okhttp3.Headers r0 = r2.headers
            r1.headers = r0
            okhttp3.MediaType r0 = r2.contentType
            r1.contentType = r0
            boolean r0 = r2.hasBody
            r1.hasBody = r0
            boolean r0 = r2.isFormEncoded
            r1.isFormEncoded = r0
            boolean r0 = r2.isMultipart
            r1.isMultipart = r0
            retrofit2.ParameterHandler<?>[] r0 = r2.parameterHandlers
            r1.parameterHandlers = r0
            boolean r2 = r2.isKotlinSuspendFunction
            r1.isKotlinSuspendFunction = r2
            return
    }

    public final okhttp3.Request create(java.lang.Object[] r13) throws java.io.IOException {
            r12 = this;
            retrofit2.ParameterHandler<?>[] r0 = r12.parameterHandlers
            int r1 = r13.length
            int r2 = r0.length
            if (r1 != r2) goto L4f
            retrofit2.RequestBuilder r2 = new retrofit2.RequestBuilder
            java.lang.String r4 = r12.httpMethod
            okhttp3.HttpUrl r5 = r12.baseUrl
            java.lang.String r6 = r12.relativeUrl
            okhttp3.Headers r7 = r12.headers
            okhttp3.MediaType r8 = r12.contentType
            boolean r9 = r12.hasBody
            boolean r10 = r12.isFormEncoded
            boolean r11 = r12.isMultipart
            r3 = r2
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            boolean r3 = r12.isKotlinSuspendFunction
            if (r3 == 0) goto L22
            int r1 = r1 + (-1)
        L22:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r1)
            r4 = 0
        L28:
            if (r4 >= r1) goto L39
            r5 = r13[r4]
            r3.add(r5)
            r5 = r0[r4]
            r6 = r13[r4]
            r5.apply(r2, r6)
            int r4 = r4 + 1
            goto L28
        L39:
            okhttp3.Request$Builder r13 = r2.get()
            java.lang.Class<retrofit2.Invocation> r0 = retrofit2.Invocation.class
            retrofit2.Invocation r1 = new retrofit2.Invocation
            java.lang.reflect.Method r2 = r12.method
            r1.<init>(r2, r3)
            okhttp3.Request$Builder r13 = r13.tag(r0, r1)
            okhttp3.Request r13 = r13.build()
            return r13
        L4f:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Argument count ("
            java.lang.String r3 = ") doesn't match expected count ("
            java.lang.StringBuilder r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m23m(r2, r1, r3)
            int r0 = r0.length
            java.lang.String r2 = ")"
            java.lang.String r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r0, r2)
            r13.<init>(r0)
            throw r13
    }
}
