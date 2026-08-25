package kotlinx.coroutines.internal;

/* JADX INFO: compiled from: ExceptionsConstructor.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u001a2\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005j\u0002`\u0007\"\b\b\u0000\u0010\b*\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\b0\nH\u0002\u001a*\u0010\u000b\u001a\u0018\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0005j\u0004\u0018\u0001`\u00072\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\rH\u0002\u001a1\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005j\u0002`\u00072\u0014\b\u0004\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005H\u0082\b\u001a!\u0010\u0010\u001a\u0004\u0018\u0001H\b\"\b\b\u0000\u0010\b*\u00020\u00062\u0006\u0010\u0011\u001a\u0002H\bH\u0000¢\u0006\u0002\u0010\u0012\u001a\u001b\u0010\u0013\u001a\u00020\u0003*\u0006\u0012\u0002\b\u00030\n2\b\b\u0002\u0010\u0014\u001a\u00020\u0003H\u0082\u0010\u001a\u0018\u0010\u0015\u001a\u00020\u0003*\u0006\u0012\u0002\b\u00030\n2\u0006\u0010\u0016\u001a\u00020\u0003H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000*(\b\u0002\u0010\u0017\"\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00052\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005¨\u0006\u0018"}, d2 = {"ctorCache", "Lkotlinx/coroutines/internal/CtorCache;", "throwableFields", "", "createConstructor", "Lkotlin/Function1;", "", "Lkotlinx/coroutines/internal/Ctor;", "E", "clz", "Ljava/lang/Class;", "createSafeConstructor", "constructor", "Ljava/lang/reflect/Constructor;", "safeCtor", "block", "tryCopyException", "exception", "(Ljava/lang/Throwable;)Ljava/lang/Throwable;", "fieldsCount", "accumulator", "fieldsCountOrDefault", "defaultValue", "Ctor", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class ExceptionsConstructorKt {

    @org.jetbrains.annotations.NotNull
    private static final kotlinx.coroutines.internal.CtorCache ctorCache = null;
    private static final int throwableFields = 0;


    static {
            java.lang.Class<java.lang.Throwable> r0 = java.lang.Throwable.class
            r1 = -1
            int r0 = fieldsCountOrDefault(r0, r1)
            kotlinx.coroutines.internal.ExceptionsConstructorKt.throwableFields = r0
            boolean r0 = kotlinx.coroutines.internal.FastServiceLoaderKt.getANDROID_DETECTED()     // Catch: java.lang.Throwable -> L15
            if (r0 == 0) goto L12
            kotlinx.coroutines.internal.WeakMapCtorCache r0 = kotlinx.coroutines.internal.WeakMapCtorCache.INSTANCE     // Catch: java.lang.Throwable -> L15
            goto L17
        L12:
            kotlinx.coroutines.internal.ClassValueCtorCache r0 = kotlinx.coroutines.internal.ClassValueCtorCache.INSTANCE     // Catch: java.lang.Throwable -> L15
            goto L17
        L15:
            kotlinx.coroutines.internal.WeakMapCtorCache r0 = kotlinx.coroutines.internal.WeakMapCtorCache.INSTANCE
        L17:
            kotlinx.coroutines.internal.ExceptionsConstructorKt.ctorCache = r0
            return
    }

    public static final /* synthetic */ kotlin.jvm.functions.Function1 access$createConstructor(java.lang.Class r0) {
            kotlin.jvm.functions.Function1 r0 = createConstructor(r0)
            return r0
    }

    private static final <E extends java.lang.Throwable> kotlin.jvm.functions.Function1<java.lang.Throwable, java.lang.Throwable> createConstructor(java.lang.Class<E> r3) {
            kotlinx.coroutines.internal.ExceptionsConstructorKt$createConstructor$nullResult$1 r0 = kotlinx.coroutines.internal.ExceptionsConstructorKt$createConstructor$nullResult$1.INSTANCE
            int r1 = kotlinx.coroutines.internal.ExceptionsConstructorKt.throwableFields
            r2 = 0
            int r2 = fieldsCountOrDefault(r3, r2)
            if (r1 == r2) goto Lc
            return r0
        Lc:
            java.lang.reflect.Constructor[] r3 = r3.getConstructors()
            kotlinx.coroutines.internal.ExceptionsConstructorKt$createConstructor$$inlined$sortedByDescending$1 r1 = new kotlinx.coroutines.internal.ExceptionsConstructorKt$createConstructor$$inlined$sortedByDescending$1
            r1.<init>()
            java.util.List r3 = kotlin.collections.ArraysKt.sortedWith(r3, r1)
            java.util.Iterator r3 = r3.iterator()
        L1d:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L30
            java.lang.Object r1 = r3.next()
            java.lang.reflect.Constructor r1 = (java.lang.reflect.Constructor) r1
            kotlin.jvm.functions.Function1 r1 = createSafeConstructor(r1)
            if (r1 == 0) goto L1d
            return r1
        L30:
            return r0
    }

    private static final kotlin.jvm.functions.Function1<java.lang.Throwable, java.lang.Throwable> createSafeConstructor(java.lang.reflect.Constructor<?> r7) {
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            java.lang.Class[] r1 = r7.getParameterTypes()
            int r2 = r1.length
            r3 = 0
            if (r2 == 0) goto L46
            r4 = 0
            r5 = 1
            if (r2 == r5) goto L2a
            r6 = 2
            if (r2 == r6) goto L12
            goto L4b
        L12:
            r2 = r1[r4]
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r0)
            if (r0 == 0) goto L4b
            r0 = r1[r5]
            java.lang.Class<java.lang.Throwable> r1 = java.lang.Throwable.class
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L4b
            kotlinx.coroutines.internal.ExceptionsConstructorKt$createSafeConstructor$$inlined$safeCtor$1 r3 = new kotlinx.coroutines.internal.ExceptionsConstructorKt$createSafeConstructor$$inlined$safeCtor$1
            r3.<init>(r7)
            goto L4b
        L2a:
            r1 = r1[r4]
            java.lang.Class<java.lang.Throwable> r2 = java.lang.Throwable.class
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r2)
            if (r2 == 0) goto L3a
            kotlinx.coroutines.internal.ExceptionsConstructorKt$createSafeConstructor$$inlined$safeCtor$2 r3 = new kotlinx.coroutines.internal.ExceptionsConstructorKt$createSafeConstructor$$inlined$safeCtor$2
            r3.<init>(r7)
            goto L4b
        L3a:
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r0)
            if (r0 == 0) goto L4b
            kotlinx.coroutines.internal.ExceptionsConstructorKt$createSafeConstructor$$inlined$safeCtor$3 r3 = new kotlinx.coroutines.internal.ExceptionsConstructorKt$createSafeConstructor$$inlined$safeCtor$3
            r3.<init>(r7)
            goto L4b
        L46:
            kotlinx.coroutines.internal.ExceptionsConstructorKt$createSafeConstructor$$inlined$safeCtor$4 r3 = new kotlinx.coroutines.internal.ExceptionsConstructorKt$createSafeConstructor$$inlined$safeCtor$4
            r3.<init>(r7)
        L4b:
            return r3
    }

    private static final int fieldsCount(java.lang.Class<?> r5, int r6) {
        L0:
            java.lang.reflect.Field[] r0 = r5.getDeclaredFields()
            int r1 = r0.length
            r2 = 0
            r3 = 0
        L7:
            if (r2 >= r1) goto L1c
            r4 = r0[r2]
            int r2 = r2 + 1
            int r4 = r4.getModifiers()
            boolean r4 = java.lang.reflect.Modifier.isStatic(r4)
            r4 = r4 ^ 1
            if (r4 == 0) goto L7
            int r3 = r3 + 1
            goto L7
        L1c:
            int r6 = r6 + r3
            java.lang.Class r5 = r5.getSuperclass()
            if (r5 != 0) goto L0
            return r6
    }

    private static final int fieldsCountOrDefault(java.lang.Class<?> r1, int r2) {
            kotlin.jvm.JvmClassMappingKt.getKotlinClass(r1)
            kotlin.Result$Companion r0 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L13
            r0 = 0
            int r1 = fieldsCount(r1, r0)     // Catch: java.lang.Throwable -> L13
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L13
            java.lang.Object r1 = kotlin.Result.m333constructorimpl(r1)     // Catch: java.lang.Throwable -> L13
            goto L1e
        L13:
            r1 = move-exception
            kotlin.Result$Companion r0 = kotlin.Result.Companion
            java.lang.Object r1 = kotlin.ResultKt.createFailure(r1)
            java.lang.Object r1 = kotlin.Result.m333constructorimpl(r1)
        L1e:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            boolean r0 = kotlin.Result.m339isFailureimpl(r1)
            if (r0 == 0) goto L29
            r1 = r2
        L29:
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            return r1
    }

    private static final kotlin.jvm.functions.Function1<java.lang.Throwable, java.lang.Throwable> safeCtor(kotlin.jvm.functions.Function1<? super java.lang.Throwable, ? extends java.lang.Throwable> r1) {
            kotlinx.coroutines.internal.ExceptionsConstructorKt$safeCtor$1 r0 = new kotlinx.coroutines.internal.ExceptionsConstructorKt$safeCtor$1
            r0.<init>(r1)
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public static final <E extends java.lang.Throwable> E tryCopyException(@org.jetbrains.annotations.NotNull E r2) {
            boolean r0 = r2 instanceof kotlinx.coroutines.CopyableThrowable
            if (r0 == 0) goto L26
            kotlin.Result$Companion r0 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L11
            kotlinx.coroutines.CopyableThrowable r2 = (kotlinx.coroutines.CopyableThrowable) r2     // Catch: java.lang.Throwable -> L11
            java.lang.Throwable r2 = r2.createCopy()     // Catch: java.lang.Throwable -> L11
            java.lang.Object r2 = kotlin.Result.m333constructorimpl(r2)     // Catch: java.lang.Throwable -> L11
            goto L1c
        L11:
            r2 = move-exception
            kotlin.Result$Companion r0 = kotlin.Result.Companion
            java.lang.Object r2 = kotlin.ResultKt.createFailure(r2)
            java.lang.Object r2 = kotlin.Result.m333constructorimpl(r2)
        L1c:
            boolean r0 = kotlin.Result.m339isFailureimpl(r2)
            if (r0 == 0) goto L23
            r2 = 0
        L23:
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            return r2
        L26:
            kotlinx.coroutines.internal.CtorCache r0 = kotlinx.coroutines.internal.ExceptionsConstructorKt.ctorCache
            java.lang.Class r1 = r2.getClass()
            kotlin.jvm.functions.Function1 r0 = r0.get(r1)
            java.lang.Object r2 = r0.invoke(r2)
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            return r2
    }
}
