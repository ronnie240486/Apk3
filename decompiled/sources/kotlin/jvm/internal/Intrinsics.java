package kotlin.jvm.internal;

/* JADX INFO: loaded from: classes.dex */
public class Intrinsics {

    @kotlin.SinceKotlin(version = "1.4")
    public static class Kotlin {
        private Kotlin() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    private Intrinsics() {
            r0 = this;
            r0.<init>()
            return
    }

    @kotlin.SinceKotlin(version = "1.1")
    public static boolean areEqual(double r2, java.lang.Double r4) {
            if (r4 == 0) goto Lc
            double r0 = r4.doubleValue()
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 != 0) goto Lc
            r2 = 1
            goto Ld
        Lc:
            r2 = 0
        Ld:
            return r2
    }

    @kotlin.SinceKotlin(version = "1.1")
    public static boolean areEqual(float r0, java.lang.Float r1) {
            if (r1 == 0) goto Lc
            float r1 = r1.floatValue()
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            return r0
    }

    @kotlin.SinceKotlin(version = "1.1")
    public static boolean areEqual(java.lang.Double r2, double r3) {
            if (r2 == 0) goto Lc
            double r0 = r2.doubleValue()
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 != 0) goto Lc
            r2 = 1
            goto Ld
        Lc:
            r2 = 0
        Ld:
            return r2
    }

    @kotlin.SinceKotlin(version = "1.1")
    public static boolean areEqual(java.lang.Double r5, java.lang.Double r6) {
            r0 = 1
            r1 = 0
            if (r5 != 0) goto L7
            if (r6 != 0) goto L16
            goto L17
        L7:
            if (r6 == 0) goto L16
            double r2 = r5.doubleValue()
            double r5 = r6.doubleValue()
            int r4 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r4 != 0) goto L16
            goto L17
        L16:
            r0 = 0
        L17:
            return r0
    }

    @kotlin.SinceKotlin(version = "1.1")
    public static boolean areEqual(java.lang.Float r0, float r1) {
            if (r0 == 0) goto Lc
            float r0 = r0.floatValue()
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            return r0
    }

    @kotlin.SinceKotlin(version = "1.1")
    public static boolean areEqual(java.lang.Float r2, java.lang.Float r3) {
            r0 = 1
            r1 = 0
            if (r2 != 0) goto L7
            if (r3 != 0) goto L16
            goto L17
        L7:
            if (r3 == 0) goto L16
            float r2 = r2.floatValue()
            float r3 = r3.floatValue()
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 != 0) goto L16
            goto L17
        L16:
            r0 = 0
        L17:
            return r0
    }

    public static boolean areEqual(java.lang.Object r0, java.lang.Object r1) {
            if (r0 != 0) goto L8
            if (r1 != 0) goto L6
            r0 = 1
            goto Lc
        L6:
            r0 = 0
            goto Lc
        L8:
            boolean r0 = r0.equals(r1)
        Lc:
            return r0
    }

    public static void checkExpressionValueIsNotNull(java.lang.Object r1, java.lang.String r2) {
            if (r1 == 0) goto L3
            return
        L3:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = " must not be null"
            java.lang.String r2 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r2, r0)
            r1.<init>(r2)
            java.lang.Throwable r1 = sanitizeStackTrace(r1)
            java.lang.IllegalStateException r1 = (java.lang.IllegalStateException) r1
            throw r1
    }

    public static void checkFieldIsNotNull(java.lang.Object r0, java.lang.String r1) {
            if (r0 == 0) goto L3
            return
        L3:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            java.lang.Throwable r0 = sanitizeStackTrace(r0)
            java.lang.IllegalStateException r0 = (java.lang.IllegalStateException) r0
            throw r0
    }

    public static void checkFieldIsNotNull(java.lang.Object r2, java.lang.String r3, java.lang.String r4) {
            if (r2 == 0) goto L3
            return
        L3:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Field specified as non-null is null: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = "."
            r0.append(r3)
            r0.append(r4)
            java.lang.String r3 = r0.toString()
            r2.<init>(r3)
            java.lang.Throwable r2 = sanitizeStackTrace(r2)
            java.lang.IllegalStateException r2 = (java.lang.IllegalStateException) r2
            throw r2
    }

    public static void checkHasClass(java.lang.String r4) throws java.lang.ClassNotFoundException {
            r0 = 47
            r1 = 46
            java.lang.String r4 = r4.replace(r0, r1)
            java.lang.Class.forName(r4)     // Catch: java.lang.ClassNotFoundException -> Lc
            return
        Lc:
            r0 = move-exception
            java.lang.ClassNotFoundException r1 = new java.lang.ClassNotFoundException
            java.lang.String r2 = "Class "
            java.lang.String r3 = " is not found. Please update the Kotlin runtime to the latest version"
            java.lang.String r4 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r2, r4, r3)
            r1.<init>(r4, r0)
            java.lang.Throwable r4 = sanitizeStackTrace(r1)
            java.lang.ClassNotFoundException r4 = (java.lang.ClassNotFoundException) r4
            throw r4
    }

    public static void checkHasClass(java.lang.String r4, java.lang.String r5) throws java.lang.ClassNotFoundException {
            r0 = 47
            r1 = 46
            java.lang.String r4 = r4.replace(r0, r1)
            java.lang.Class.forName(r4)     // Catch: java.lang.ClassNotFoundException -> Lc
            return
        Lc:
            r0 = move-exception
            java.lang.ClassNotFoundException r1 = new java.lang.ClassNotFoundException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Class "
            r2.append(r3)
            r2.append(r4)
            java.lang.String r4 = " is not found: this code requires the Kotlin runtime of version at least "
            r2.append(r4)
            r2.append(r5)
            java.lang.String r4 = r2.toString()
            r1.<init>(r4, r0)
            java.lang.Throwable r4 = sanitizeStackTrace(r1)
            java.lang.ClassNotFoundException r4 = (java.lang.ClassNotFoundException) r4
            throw r4
    }

    public static void checkNotNull(java.lang.Object r0) {
            if (r0 != 0) goto L5
            throwJavaNpe()
        L5:
            return
    }

    public static void checkNotNull(java.lang.Object r0, java.lang.String r1) {
            if (r0 != 0) goto L5
            throwJavaNpe(r1)
        L5:
            return
    }

    public static void checkNotNullExpressionValue(java.lang.Object r1, java.lang.String r2) {
            if (r1 == 0) goto L3
            return
        L3:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r0 = " must not be null"
            java.lang.String r2 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r2, r0)
            r1.<init>(r2)
            java.lang.Throwable r1 = sanitizeStackTrace(r1)
            java.lang.NullPointerException r1 = (java.lang.NullPointerException) r1
            throw r1
    }

    public static void checkNotNullParameter(java.lang.Object r0, java.lang.String r1) {
            if (r0 != 0) goto L5
            throwParameterIsNullNPE(r1)
        L5:
            return
    }

    public static void checkParameterIsNotNull(java.lang.Object r0, java.lang.String r1) {
            if (r0 != 0) goto L5
            throwParameterIsNullIAE(r1)
        L5:
            return
    }

    public static void checkReturnedValueIsNotNull(java.lang.Object r0, java.lang.String r1) {
            if (r0 == 0) goto L3
            return
        L3:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            java.lang.Throwable r0 = sanitizeStackTrace(r0)
            java.lang.IllegalStateException r0 = (java.lang.IllegalStateException) r0
            throw r0
    }

    public static void checkReturnedValueIsNotNull(java.lang.Object r2, java.lang.String r3, java.lang.String r4) {
            if (r2 == 0) goto L3
            return
        L3:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Method specified as non-null returned null: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = "."
            r0.append(r3)
            r0.append(r4)
            java.lang.String r3 = r0.toString()
            r2.<init>(r3)
            java.lang.Throwable r2 = sanitizeStackTrace(r2)
            java.lang.IllegalStateException r2 = (java.lang.IllegalStateException) r2
            throw r2
    }

    public static int compare(int r0, int r1) {
            if (r0 >= r1) goto L4
            r0 = -1
            goto L9
        L4:
            if (r0 != r1) goto L8
            r0 = 0
            goto L9
        L8:
            r0 = 1
        L9:
            return r0
    }

    public static int compare(long r1, long r3) {
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 >= 0) goto L6
            r1 = -1
            goto Lb
        L6:
            if (r0 != 0) goto La
            r1 = 0
            goto Lb
        La:
            r1 = 1
        Lb:
            return r1
    }

    private static java.lang.String createParameterIsNullExceptionMessage(java.lang.String r4) {
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            java.lang.StackTraceElement[] r0 = r0.getStackTrace()
            r1 = 4
            r0 = r0[r1]
            java.lang.String r1 = r0.getClassName()
            java.lang.String r0 = r0.getMethodName()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Parameter specified as non-null is null: method "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = "."
            r2.append(r1)
            r2.append(r0)
            java.lang.String r0 = ", parameter "
            r2.append(r0)
            r2.append(r4)
            java.lang.String r4 = r2.toString()
            return r4
    }

    public static void needClassReification() {
            throwUndefinedForReified()
            return
    }

    public static void needClassReification(java.lang.String r0) {
            throwUndefinedForReified(r0)
            return
    }

    public static void reifiedOperationMarker(int r0, java.lang.String r1) {
            throwUndefinedForReified()
            return
    }

    public static void reifiedOperationMarker(int r0, java.lang.String r1, java.lang.String r2) {
            throwUndefinedForReified(r2)
            return
    }

    private static <T extends java.lang.Throwable> T sanitizeStackTrace(T r1) {
            java.lang.Class<kotlin.jvm.internal.Intrinsics> r0 = kotlin.jvm.internal.Intrinsics.class
            java.lang.String r0 = r0.getName()
            sanitizeStackTrace(r1, r0)
            return r1
    }

    public static <T extends java.lang.Throwable> T sanitizeStackTrace(T r5, java.lang.String r6) {
            java.lang.StackTraceElement[] r0 = r5.getStackTrace()
            int r1 = r0.length
            r2 = -1
            r3 = 0
        L7:
            if (r3 >= r1) goto L19
            r4 = r0[r3]
            java.lang.String r4 = r4.getClassName()
            boolean r4 = r6.equals(r4)
            if (r4 == 0) goto L16
            r2 = r3
        L16:
            int r3 = r3 + 1
            goto L7
        L19:
            int r2 = r2 + 1
            java.lang.Object[] r6 = java.util.Arrays.copyOfRange(r0, r2, r1)
            java.lang.StackTraceElement[] r6 = (java.lang.StackTraceElement[]) r6
            r5.setStackTrace(r6)
            return r5
    }

    public static java.lang.String stringPlus(java.lang.String r1, java.lang.Object r2) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            r0.append(r2)
            java.lang.String r1 = r0.toString()
            return r1
    }

    public static void throwAssert() {
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            java.lang.Throwable r0 = sanitizeStackTrace(r0)
            java.lang.AssertionError r0 = (java.lang.AssertionError) r0
            throw r0
    }

    public static void throwAssert(java.lang.String r1) {
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>(r1)
            java.lang.Throwable r1 = sanitizeStackTrace(r0)
            java.lang.AssertionError r1 = (java.lang.AssertionError) r1
            throw r1
    }

    public static void throwIllegalArgument() {
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>()
            java.lang.Throwable r0 = sanitizeStackTrace(r0)
            java.lang.IllegalArgumentException r0 = (java.lang.IllegalArgumentException) r0
            throw r0
    }

    public static void throwIllegalArgument(java.lang.String r1) {
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            java.lang.Throwable r1 = sanitizeStackTrace(r0)
            java.lang.IllegalArgumentException r1 = (java.lang.IllegalArgumentException) r1
            throw r1
    }

    public static void throwIllegalState() {
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            java.lang.Throwable r0 = sanitizeStackTrace(r0)
            java.lang.IllegalStateException r0 = (java.lang.IllegalStateException) r0
            throw r0
    }

    public static void throwIllegalState(java.lang.String r1) {
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            java.lang.Throwable r1 = sanitizeStackTrace(r0)
            java.lang.IllegalStateException r1 = (java.lang.IllegalStateException) r1
            throw r1
    }

    @kotlin.SinceKotlin(version = "1.4")
    public static void throwJavaNpe() {
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>()
            java.lang.Throwable r0 = sanitizeStackTrace(r0)
            java.lang.NullPointerException r0 = (java.lang.NullPointerException) r0
            throw r0
    }

    @kotlin.SinceKotlin(version = "1.4")
    public static void throwJavaNpe(java.lang.String r1) {
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r1)
            java.lang.Throwable r1 = sanitizeStackTrace(r0)
            java.lang.NullPointerException r1 = (java.lang.NullPointerException) r1
            throw r1
    }

    public static void throwNpe() {
            kotlin.KotlinNullPointerException r0 = new kotlin.KotlinNullPointerException
            r0.<init>()
            java.lang.Throwable r0 = sanitizeStackTrace(r0)
            kotlin.KotlinNullPointerException r0 = (kotlin.KotlinNullPointerException) r0
            throw r0
    }

    public static void throwNpe(java.lang.String r1) {
            kotlin.KotlinNullPointerException r0 = new kotlin.KotlinNullPointerException
            r0.<init>(r1)
            java.lang.Throwable r1 = sanitizeStackTrace(r0)
            kotlin.KotlinNullPointerException r1 = (kotlin.KotlinNullPointerException) r1
            throw r1
    }

    private static void throwParameterIsNullIAE(java.lang.String r1) {
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = createParameterIsNullExceptionMessage(r1)
            r0.<init>(r1)
            java.lang.Throwable r1 = sanitizeStackTrace(r0)
            java.lang.IllegalArgumentException r1 = (java.lang.IllegalArgumentException) r1
            throw r1
    }

    private static void throwParameterIsNullNPE(java.lang.String r1) {
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = createParameterIsNullExceptionMessage(r1)
            r0.<init>(r1)
            java.lang.Throwable r1 = sanitizeStackTrace(r0)
            java.lang.NullPointerException r1 = (java.lang.NullPointerException) r1
            throw r1
    }

    public static void throwUndefinedForReified() {
            java.lang.String r0 = "This function has a reified type parameter and thus can only be inlined at compilation time, not called directly."
            throwUndefinedForReified(r0)
            return
    }

    public static void throwUndefinedForReified(java.lang.String r1) {
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>(r1)
            throw r0
    }

    public static void throwUninitializedProperty(java.lang.String r1) {
            kotlin.UninitializedPropertyAccessException r0 = new kotlin.UninitializedPropertyAccessException
            r0.<init>(r1)
            java.lang.Throwable r1 = sanitizeStackTrace(r0)
            kotlin.UninitializedPropertyAccessException r1 = (kotlin.UninitializedPropertyAccessException) r1
            throw r1
    }

    public static void throwUninitializedPropertyAccessException(java.lang.String r2) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "lateinit property "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r2 = " has not been initialized"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            throwUninitializedProperty(r2)
            return
    }
}
