package kotlin.internal;

/* JADX INFO: compiled from: PlatformImplementations.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\b\u0010\u0018\u00002\u00020\u0001:\u0001\u0012B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\b\u001a\u00020\tH\u0016J\u001a\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u00112\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\u0013"}, d2 = {"Lkotlin/internal/PlatformImplementations;", "", "()V", "addSuppressed", "", "cause", "", "exception", "defaultPlatformRandom", "Lkotlin/random/Random;", "getMatchResultNamedGroup", "Lkotlin/text/MatchGroup;", "matchResult", "Ljava/util/regex/MatchResult;", "name", "", "getSuppressed", "", "ReflectThrowable", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
public class PlatformImplementations {

    /* JADX INFO: compiled from: PlatformImplementations.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lkotlin/internal/PlatformImplementations$ReflectThrowable;", "", "()V", "addSuppressed", "Ljava/lang/reflect/Method;", "getSuppressed", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class ReflectThrowable {

        @org.jetbrains.annotations.NotNull
        public static final kotlin.internal.PlatformImplementations.ReflectThrowable INSTANCE = null;

        @kotlin.jvm.JvmField
        @org.jetbrains.annotations.Nullable
        public static final java.lang.reflect.Method addSuppressed = null;

        @kotlin.jvm.JvmField
        @org.jetbrains.annotations.Nullable
        public static final java.lang.reflect.Method getSuppressed = null;

        static {
                kotlin.internal.PlatformImplementations$ReflectThrowable r0 = new kotlin.internal.PlatformImplementations$ReflectThrowable
                r0.<init>()
                kotlin.internal.PlatformImplementations.ReflectThrowable.INSTANCE = r0
                java.lang.Class<java.lang.Throwable> r0 = java.lang.Throwable.class
                java.lang.reflect.Method[] r1 = r0.getMethods()
                java.lang.String r2 = "throwableMethods"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
                int r2 = r1.length
                r3 = 0
                r4 = 0
            L16:
                r5 = 0
                if (r4 >= r2) goto L43
                r6 = r1[r4]
                java.lang.String r7 = r6.getName()
                java.lang.String r8 = "addSuppressed"
                boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual(r7, r8)
                if (r7 == 0) goto L3c
                java.lang.Class[] r7 = r6.getParameterTypes()
                java.lang.String r8 = "it.parameterTypes"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r8)
                java.lang.Object r7 = kotlin.collections.ArraysKt.singleOrNull(r7)
                boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual(r7, r0)
                if (r7 == 0) goto L3c
                r7 = 1
                goto L3d
            L3c:
                r7 = 0
            L3d:
                if (r7 == 0) goto L40
                goto L44
            L40:
                int r4 = r4 + 1
                goto L16
            L43:
                r6 = r5
            L44:
                kotlin.internal.PlatformImplementations.ReflectThrowable.addSuppressed = r6
                int r0 = r1.length
            L47:
                if (r3 >= r0) goto L5c
                r2 = r1[r3]
                java.lang.String r4 = r2.getName()
                java.lang.String r6 = "getSuppressed"
                boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual(r4, r6)
                if (r4 == 0) goto L59
                r5 = r2
                goto L5c
            L59:
                int r3 = r3 + 1
                goto L47
            L5c:
                kotlin.internal.PlatformImplementations.ReflectThrowable.getSuppressed = r5
                return
        }

        private ReflectThrowable() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    public PlatformImplementations() {
            r0 = this;
            r0.<init>()
            return
    }

    public void addSuppressed(@org.jetbrains.annotations.NotNull java.lang.Throwable r4, @org.jetbrains.annotations.NotNull java.lang.Throwable r5) {
            r3 = this;
            java.lang.String r0 = "cause"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "exception"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.reflect.Method r0 = kotlin.internal.PlatformImplementations.ReflectThrowable.addSuppressed
            if (r0 == 0) goto L17
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r5
            r0.invoke(r4, r1)
        L17:
            return
    }

    @org.jetbrains.annotations.NotNull
    public kotlin.random.Random defaultPlatformRandom() {
            r1 = this;
            kotlin.random.FallbackThreadLocalRandom r0 = new kotlin.random.FallbackThreadLocalRandom
            r0.<init>()
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public kotlin.text.MatchGroup getMatchResultNamedGroup(@org.jetbrains.annotations.NotNull java.util.regex.MatchResult r2, @org.jetbrains.annotations.NotNull java.lang.String r3) {
            r1 = this;
            java.lang.String r0 = "matchResult"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r2 = "name"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r2)
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r3 = "Retrieving groups by name is not supported on this platform."
            r2.<init>(r3)
            throw r2
    }

    @org.jetbrains.annotations.NotNull
    public java.util.List<java.lang.Throwable> getSuppressed(@org.jetbrains.annotations.NotNull java.lang.Throwable r3) {
            r2 = this;
            java.lang.String r0 = "exception"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.reflect.Method r0 = kotlin.internal.PlatformImplementations.ReflectThrowable.getSuppressed
            if (r0 == 0) goto L1a
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.Object r3 = r0.invoke(r3, r1)
            if (r3 == 0) goto L1a
            java.lang.Throwable[] r3 = (java.lang.Throwable[]) r3
            java.util.List r3 = kotlin.collections.ArraysKt.asList(r3)
            if (r3 != 0) goto L1e
        L1a:
            java.util.List r3 = kotlin.collections.CollectionsKt.emptyList()
        L1e:
            return r3
    }
}
