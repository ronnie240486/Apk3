package retrofit2;

/* JADX INFO: loaded from: classes2.dex */
abstract class HttpServiceMethod<ResponseT, ReturnT> extends retrofit2.ServiceMethod<ReturnT> {
    private final okhttp3.Call.Factory callFactory;
    private final retrofit2.RequestFactory requestFactory;
    private final retrofit2.Converter<okhttp3.ResponseBody, ResponseT> responseConverter;

    public static final class CallAdapted<ResponseT, ReturnT> extends retrofit2.HttpServiceMethod<ResponseT, ReturnT> {
        private final retrofit2.CallAdapter<ResponseT, ReturnT> callAdapter;

        public CallAdapted(retrofit2.RequestFactory r1, okhttp3.Call.Factory r2, retrofit2.Converter<okhttp3.ResponseBody, ResponseT> r3, retrofit2.CallAdapter<ResponseT, ReturnT> r4) {
                r0 = this;
                r0.<init>(r1, r2, r3)
                r0.callAdapter = r4
                return
        }

        @Override // retrofit2.HttpServiceMethod
        public final ReturnT adapt(retrofit2.Call<ResponseT> r1, java.lang.Object[] r2) {
                r0 = this;
                retrofit2.CallAdapter<ResponseT, ReturnT> r2 = r0.callAdapter
                java.lang.Object r1 = r2.adapt(r1)
                return r1
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    public static final class SuspendForBody<ResponseT> extends retrofit2.HttpServiceMethod<ResponseT, java.lang.Object> {
        private final retrofit2.CallAdapter<ResponseT, retrofit2.Call<ResponseT>> callAdapter;
        private final boolean isNullable;

        public SuspendForBody(retrofit2.RequestFactory r1, okhttp3.Call.Factory r2, retrofit2.Converter r3, retrofit2.CallAdapter r4) {
                r0 = this;
                r0.<init>(r1, r2, r3)
                r0.callAdapter = r4
                r1 = 0
                r0.isNullable = r1
                return
        }

        @Override // retrofit2.HttpServiceMethod
        public final java.lang.Object adapt(retrofit2.Call<ResponseT> r2, java.lang.Object[] r3) {
                r1 = this;
                retrofit2.CallAdapter<ResponseT, retrofit2.Call<ResponseT>> r0 = r1.callAdapter
                java.lang.Object r2 = r0.adapt(r2)
                retrofit2.Call r2 = (retrofit2.Call) r2
                int r0 = r3.length
                int r0 = r0 + (-1)
                r3 = r3[r0]
                kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3
                boolean r0 = r1.isNullable     // Catch: java.lang.Exception -> L1d
                if (r0 == 0) goto L18
                java.lang.Object r2 = retrofit2.KotlinExtensions.awaitNullable(r2, r3)     // Catch: java.lang.Exception -> L1d
                goto L1c
            L18:
                java.lang.Object r2 = retrofit2.KotlinExtensions.await(r2, r3)     // Catch: java.lang.Exception -> L1d
            L1c:
                return r2
            L1d:
                r2 = move-exception
                java.lang.Object r2 = retrofit2.KotlinExtensions.suspendAndThrow(r2, r3)
                return r2
        }
    }

    public static final class SuspendForResponse<ResponseT> extends retrofit2.HttpServiceMethod<ResponseT, java.lang.Object> {
        private final retrofit2.CallAdapter<ResponseT, retrofit2.Call<ResponseT>> callAdapter;

        public SuspendForResponse(retrofit2.RequestFactory r1, okhttp3.Call.Factory r2, retrofit2.Converter<okhttp3.ResponseBody, ResponseT> r3, retrofit2.CallAdapter<ResponseT, retrofit2.Call<ResponseT>> r4) {
                r0 = this;
                r0.<init>(r1, r2, r3)
                r0.callAdapter = r4
                return
        }

        @Override // retrofit2.HttpServiceMethod
        public final java.lang.Object adapt(retrofit2.Call<ResponseT> r2, java.lang.Object[] r3) {
                r1 = this;
                retrofit2.CallAdapter<ResponseT, retrofit2.Call<ResponseT>> r0 = r1.callAdapter
                java.lang.Object r2 = r0.adapt(r2)
                retrofit2.Call r2 = (retrofit2.Call) r2
                int r0 = r3.length
                int r0 = r0 + (-1)
                r3 = r3[r0]
                kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3
                java.lang.Object r2 = retrofit2.KotlinExtensions.awaitResponse(r2, r3)     // Catch: java.lang.Exception -> L14
                return r2
            L14:
                r2 = move-exception
                java.lang.Object r2 = retrofit2.KotlinExtensions.suspendAndThrow(r2, r3)
                return r2
        }
    }

    public HttpServiceMethod(retrofit2.RequestFactory r1, okhttp3.Call.Factory r2, retrofit2.Converter<okhttp3.ResponseBody, ResponseT> r3) {
            r0 = this;
            r0.<init>()
            r0.requestFactory = r1
            r0.callFactory = r2
            r0.responseConverter = r3
            return
    }

    private static <ResponseT, ReturnT> retrofit2.CallAdapter<ResponseT, ReturnT> createCallAdapter(retrofit2.Retrofit r1, java.lang.reflect.Method r2, java.lang.reflect.Type r3, java.lang.annotation.Annotation[] r4) {
            retrofit2.CallAdapter r1 = r1.callAdapter(r3, r4)     // Catch: java.lang.RuntimeException -> L5
            return r1
        L5:
            r1 = move-exception
            r4 = 1
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r0 = 0
            r4[r0] = r3
            java.lang.String r3 = "Unable to create call adapter for %s"
            java.lang.RuntimeException r1 = retrofit2.Utils.methodError(r2, r1, r3, r4)
            throw r1
    }

    private static <ResponseT> retrofit2.Converter<okhttp3.ResponseBody, ResponseT> createResponseConverter(retrofit2.Retrofit r2, java.lang.reflect.Method r3, java.lang.reflect.Type r4) {
            java.lang.annotation.Annotation[] r0 = r3.getAnnotations()
            retrofit2.Converter r2 = r2.responseBodyConverter(r4, r0)     // Catch: java.lang.RuntimeException -> L9
            return r2
        L9:
            r2 = move-exception
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r4
            java.lang.String r4 = "Unable to create converter for %s"
            java.lang.RuntimeException r2 = retrofit2.Utils.methodError(r3, r2, r4, r0)
            throw r2
    }

    public static <ResponseT, ReturnT> retrofit2.HttpServiceMethod<ResponseT, ReturnT> parseAnnotations(retrofit2.Retrofit r10, java.lang.reflect.Method r11, retrofit2.RequestFactory r12) {
            java.lang.Class<retrofit2.Response> r0 = retrofit2.Response.class
            boolean r1 = r12.isKotlinSuspendFunction
            java.lang.annotation.Annotation[] r2 = r11.getAnnotations()
            r3 = 0
            r4 = 0
            if (r1 == 0) goto L4c
            java.lang.reflect.Type[] r5 = r11.getGenericParameterTypes()
            int r6 = r5.length
            r7 = 1
            int r6 = r6 - r7
            r5 = r5[r6]
            java.lang.reflect.ParameterizedType r5 = (java.lang.reflect.ParameterizedType) r5
            java.lang.reflect.Type[] r5 = r5.getActualTypeArguments()
            r5 = r5[r3]
            boolean r6 = r5 instanceof java.lang.reflect.WildcardType
            if (r6 == 0) goto L29
            java.lang.reflect.WildcardType r5 = (java.lang.reflect.WildcardType) r5
            java.lang.reflect.Type[] r5 = r5.getLowerBounds()
            r5 = r5[r3]
        L29:
            java.lang.Class r6 = retrofit2.Utils.getRawType(r5)
            if (r6 != r0) goto L3b
            boolean r6 = r5 instanceof java.lang.reflect.ParameterizedType
            if (r6 == 0) goto L3b
            java.lang.reflect.ParameterizedType r5 = (java.lang.reflect.ParameterizedType) r5
            java.lang.reflect.Type r5 = retrofit2.Utils.getParameterUpperBound(r3, r5)
            r6 = 1
            goto L3c
        L3b:
            r6 = 0
        L3c:
            retrofit2.Utils$ParameterizedTypeImpl r8 = new retrofit2.Utils$ParameterizedTypeImpl
            java.lang.Class<retrofit2.Call> r9 = retrofit2.Call.class
            java.lang.reflect.Type[] r7 = new java.lang.reflect.Type[r7]
            r7[r3] = r5
            r8.<init>(r4, r9, r7)
            java.lang.annotation.Annotation[] r2 = retrofit2.SkipCallbackExecutorImpl.ensurePresent(r2)
            goto L51
        L4c:
            java.lang.reflect.Type r8 = r11.getGenericReturnType()
            r6 = 0
        L51:
            retrofit2.CallAdapter r2 = createCallAdapter(r10, r11, r8, r2)
            java.lang.reflect.Type r5 = r2.responseType()
            java.lang.Class<okhttp3.Response> r7 = okhttp3.Response.class
            if (r5 == r7) goto La0
            if (r5 == r0) goto L97
            java.lang.String r0 = r12.httpMethod
            java.lang.String r7 = "HEAD"
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L7b
            java.lang.Class<java.lang.Void> r0 = java.lang.Void.class
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L72
            goto L7b
        L72:
            java.lang.Object[] r10 = new java.lang.Object[r3]
            java.lang.String r12 = "HEAD method must use Void as response type."
            java.lang.RuntimeException r10 = retrofit2.Utils.methodError(r11, r4, r12, r10)
            throw r10
        L7b:
            retrofit2.Converter r11 = createResponseConverter(r10, r11, r5)
            okhttp3.Call$Factory r10 = r10.callFactory
            if (r1 != 0) goto L89
            retrofit2.HttpServiceMethod$CallAdapted r0 = new retrofit2.HttpServiceMethod$CallAdapted
            r0.<init>(r12, r10, r11, r2)
            return r0
        L89:
            if (r6 == 0) goto L91
            retrofit2.HttpServiceMethod$SuspendForResponse r0 = new retrofit2.HttpServiceMethod$SuspendForResponse
            r0.<init>(r12, r10, r11, r2)
            return r0
        L91:
            retrofit2.HttpServiceMethod$SuspendForBody r0 = new retrofit2.HttpServiceMethod$SuspendForBody
            r0.<init>(r12, r10, r11, r2)
            return r0
        L97:
            java.lang.Object[] r10 = new java.lang.Object[r3]
            java.lang.String r12 = "Response must include generic type (e.g., Response<String>)"
            java.lang.RuntimeException r10 = retrofit2.Utils.methodError(r11, r4, r12, r10)
            throw r10
        La0:
            java.lang.String r10 = "'"
            java.lang.StringBuilder r10 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r10)
            java.lang.Class r12 = retrofit2.Utils.getRawType(r5)
            java.lang.String r12 = r12.getName()
            r10.append(r12)
            java.lang.String r12 = "' is not a valid response body type. Did you mean ResponseBody?"
            r10.append(r12)
            java.lang.String r10 = r10.toString()
            java.lang.Object[] r12 = new java.lang.Object[r3]
            java.lang.RuntimeException r10 = retrofit2.Utils.methodError(r11, r4, r10, r12)
            throw r10
    }

    @javax.annotation.Nullable
    public abstract ReturnT adapt(retrofit2.Call<ResponseT> r1, java.lang.Object[] r2);

    @Override // retrofit2.ServiceMethod
    @javax.annotation.Nullable
    public final ReturnT invoke(java.lang.Object[] r5) {
            r4 = this;
            retrofit2.OkHttpCall r0 = new retrofit2.OkHttpCall
            retrofit2.RequestFactory r1 = r4.requestFactory
            okhttp3.Call$Factory r2 = r4.callFactory
            retrofit2.Converter<okhttp3.ResponseBody, ResponseT> r3 = r4.responseConverter
            r0.<init>(r1, r5, r2, r3)
            java.lang.Object r5 = r4.adapt(r0, r5)
            return r5
    }
}
