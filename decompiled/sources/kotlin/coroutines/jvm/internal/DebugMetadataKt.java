package kotlin.coroutines.jvm.internal;

/* JADX INFO: compiled from: DebugMetadata.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0002\u001a\u000e\u0010\u0006\u001a\u0004\u0018\u00010\u0007*\u00020\bH\u0002\u001a\f\u0010\t\u001a\u00020\u0001*\u00020\bH\u0002\u001a\u0019\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b*\u00020\bH\u0001¢\u0006\u0002\u0010\r\u001a\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f*\u00020\bH\u0001¢\u0006\u0002\b\u0010\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"COROUTINES_DEBUG_METADATA_VERSION", "", "checkDebugMetadataVersion", "", "expected", "actual", "getDebugMetadataAnnotation", "Lkotlin/coroutines/jvm/internal/DebugMetadata;", "Lkotlin/coroutines/jvm/internal/BaseContinuationImpl;", "getLabel", "getSpilledVariableFieldMapping", "", "", "(Lkotlin/coroutines/jvm/internal/BaseContinuationImpl;)[Ljava/lang/String;", "getStackTraceElementImpl", "Ljava/lang/StackTraceElement;", "getStackTraceElement", "kotlin-stdlib"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class DebugMetadataKt {
    private static final int COROUTINES_DEBUG_METADATA_VERSION = 1;

    private static final void checkDebugMetadataVersion(int r3, int r4) {
            if (r4 > r3) goto L3
            return
        L3:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Debug metadata version mismatch. Expected: "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = ", got "
            r1.append(r3)
            r1.append(r4)
            java.lang.String r3 = ". Please update the Kotlin standard library."
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            java.lang.String r3 = r3.toString()
            r0.<init>(r3)
            throw r0
    }

    private static final kotlin.coroutines.jvm.internal.DebugMetadata getDebugMetadataAnnotation(kotlin.coroutines.jvm.internal.BaseContinuationImpl r1) {
            java.lang.Class r1 = r1.getClass()
            java.lang.Class<kotlin.coroutines.jvm.internal.DebugMetadata> r0 = kotlin.coroutines.jvm.internal.DebugMetadata.class
            java.lang.annotation.Annotation r1 = r1.getAnnotation(r0)
            kotlin.coroutines.jvm.internal.DebugMetadata r1 = (kotlin.coroutines.jvm.internal.DebugMetadata) r1
            return r1
    }

    private static final int getLabel(kotlin.coroutines.jvm.internal.BaseContinuationImpl r2) {
            java.lang.Class r0 = r2.getClass()     // Catch: java.lang.Exception -> L24
            java.lang.String r1 = "label"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r1)     // Catch: java.lang.Exception -> L24
            r1 = 1
            r0.setAccessible(r1)     // Catch: java.lang.Exception -> L24
            java.lang.Object r2 = r0.get(r2)     // Catch: java.lang.Exception -> L24
            boolean r0 = r2 instanceof java.lang.Integer     // Catch: java.lang.Exception -> L24
            if (r0 == 0) goto L19
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch: java.lang.Exception -> L24
            goto L1a
        L19:
            r2 = 0
        L1a:
            if (r2 == 0) goto L21
            int r2 = r2.intValue()     // Catch: java.lang.Exception -> L24
            goto L22
        L21:
            r2 = 0
        L22:
            int r2 = r2 - r1
            goto L25
        L24:
            r2 = -1
        L25:
            return r2
    }

    @kotlin.SinceKotlin(version = "1.3")
    @kotlin.jvm.JvmName(name = "getSpilledVariableFieldMapping")
    @org.jetbrains.annotations.Nullable
    public static final java.lang.String[] getSpilledVariableFieldMapping(@org.jetbrains.annotations.NotNull kotlin.coroutines.jvm.internal.BaseContinuationImpl r7) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            kotlin.coroutines.jvm.internal.DebugMetadata r0 = getDebugMetadataAnnotation(r7)
            if (r0 != 0) goto Ld
            r7 = 0
            return r7
        Ld:
            int r1 = r0.v()
            r2 = 1
            checkDebugMetadataVersion(r2, r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            int r7 = getLabel(r7)
            int[] r2 = r0.i()
            int r3 = r2.length
            r4 = 0
            r5 = 0
        L25:
            if (r5 >= r3) goto L40
            r6 = r2[r5]
            if (r6 != r7) goto L3d
            java.lang.String[] r6 = r0.s()
            r6 = r6[r5]
            r1.add(r6)
            java.lang.String[] r6 = r0.n()
            r6 = r6[r5]
            r1.add(r6)
        L3d:
            int r5 = r5 + 1
            goto L25
        L40:
            java.lang.String[] r7 = new java.lang.String[r4]
            java.lang.Object[] r7 = r1.toArray(r7)
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r7, r0)
            java.lang.String[] r7 = (java.lang.String[]) r7
            return r7
    }

    @kotlin.SinceKotlin(version = "1.3")
    @kotlin.jvm.JvmName(name = "getStackTraceElement")
    @org.jetbrains.annotations.Nullable
    public static final java.lang.StackTraceElement getStackTraceElement(@org.jetbrains.annotations.NotNull kotlin.coroutines.jvm.internal.BaseContinuationImpl r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            kotlin.coroutines.jvm.internal.DebugMetadata r0 = getDebugMetadataAnnotation(r4)
            if (r0 != 0) goto Ld
            r4 = 0
            return r4
        Ld:
            r1 = 1
            int r2 = r0.v()
            checkDebugMetadataVersion(r1, r2)
            int r1 = getLabel(r4)
            if (r1 >= 0) goto L1d
            r1 = -1
            goto L23
        L1d:
            int[] r2 = r0.l()
            r1 = r2[r1]
        L23:
            kotlin.coroutines.jvm.internal.ModuleNameRetriever r2 = kotlin.coroutines.jvm.internal.ModuleNameRetriever.INSTANCE
            java.lang.String r4 = r2.getModuleName(r4)
            if (r4 != 0) goto L30
            java.lang.String r4 = r0.c()
            goto L48
        L30:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r4)
            r4 = 47
            r2.append(r4)
            java.lang.String r4 = r0.c()
            r2.append(r4)
            java.lang.String r4 = r2.toString()
        L48:
            java.lang.StackTraceElement r2 = new java.lang.StackTraceElement
            java.lang.String r3 = r0.m()
            java.lang.String r0 = r0.f()
            r2.<init>(r4, r3, r0, r1)
            return r2
    }
}
