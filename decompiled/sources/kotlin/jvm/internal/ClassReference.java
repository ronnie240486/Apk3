package kotlin.jvm.internal;

/* JADX INFO: compiled from: ClassReference.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 O2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001OB\u0011\u0012\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0005¢\u0006\u0002\u0010\u0006J\u0013\u0010F\u001a\u00020\u00122\b\u0010G\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\b\u0010H\u001a\u00020IH\u0002J\b\u0010J\u001a\u00020KH\u0016J\u0012\u0010L\u001a\u00020\u00122\b\u0010M\u001a\u0004\u0018\u00010\u0002H\u0017J\b\u0010N\u001a\u000201H\u0016R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR \u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u000e0\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u00128VX\u0097\u0004¢\u0006\f\u0012\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u00128VX\u0097\u0004¢\u0006\f\u0012\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0016\u0010\u0015R\u001a\u0010\u0018\u001a\u00020\u00128VX\u0097\u0004¢\u0006\f\u0012\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u0018\u0010\u0015R\u001a\u0010\u001a\u001a\u00020\u00128VX\u0097\u0004¢\u0006\f\u0012\u0004\b\u001b\u0010\u0014\u001a\u0004\b\u001a\u0010\u0015R\u001a\u0010\u001c\u001a\u00020\u00128VX\u0097\u0004¢\u0006\f\u0012\u0004\b\u001d\u0010\u0014\u001a\u0004\b\u001c\u0010\u0015R\u001a\u0010\u001e\u001a\u00020\u00128VX\u0097\u0004¢\u0006\f\u0012\u0004\b\u001f\u0010\u0014\u001a\u0004\b\u001e\u0010\u0015R\u001a\u0010 \u001a\u00020\u00128VX\u0097\u0004¢\u0006\f\u0012\u0004\b!\u0010\u0014\u001a\u0004\b \u0010\u0015R\u001a\u0010\"\u001a\u00020\u00128VX\u0097\u0004¢\u0006\f\u0012\u0004\b#\u0010\u0014\u001a\u0004\b\"\u0010\u0015R\u001a\u0010$\u001a\u00020\u00128VX\u0097\u0004¢\u0006\f\u0012\u0004\b%\u0010\u0014\u001a\u0004\b$\u0010\u0015R\u0018\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u001e\u0010(\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030)0\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010\u0010R\u001e\u0010+\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00010\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010\u0010R\u0016\u0010-\u001a\u0004\u0018\u00010\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0016\u00100\u001a\u0004\u0018\u0001018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b2\u00103R(\u00104\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u00010\b8VX\u0097\u0004¢\u0006\f\u0012\u0004\b5\u0010\u0014\u001a\u0004\b6\u0010\u000bR\u0016\u00107\u001a\u0004\u0018\u0001018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b8\u00103R \u00109\u001a\b\u0012\u0004\u0012\u00020:0\b8VX\u0097\u0004¢\u0006\f\u0012\u0004\b;\u0010\u0014\u001a\u0004\b<\u0010\u000bR \u0010=\u001a\b\u0012\u0004\u0012\u00020>0\b8VX\u0097\u0004¢\u0006\f\u0012\u0004\b?\u0010\u0014\u001a\u0004\b@\u0010\u000bR\u001c\u0010A\u001a\u0004\u0018\u00010B8VX\u0097\u0004¢\u0006\f\u0012\u0004\bC\u0010\u0014\u001a\u0004\bD\u0010E¨\u0006P"}, d2 = {"Lkotlin/jvm/internal/ClassReference;", "Lkotlin/reflect/KClass;", "", "Lkotlin/jvm/internal/ClassBasedDeclarationContainer;", "jClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)V", "annotations", "", "", "getAnnotations", "()Ljava/util/List;", "constructors", "", "Lkotlin/reflect/KFunction;", "getConstructors", "()Ljava/util/Collection;", "isAbstract", "", "isAbstract$annotations", "()V", "()Z", "isCompanion", "isCompanion$annotations", "isData", "isData$annotations", "isFinal", "isFinal$annotations", "isFun", "isFun$annotations", "isInner", "isInner$annotations", "isOpen", "isOpen$annotations", "isSealed", "isSealed$annotations", "isValue", "isValue$annotations", "getJClass", "()Ljava/lang/Class;", "members", "Lkotlin/reflect/KCallable;", "getMembers", "nestedClasses", "getNestedClasses", "objectInstance", "getObjectInstance", "()Ljava/lang/Object;", "qualifiedName", "", "getQualifiedName", "()Ljava/lang/String;", "sealedSubclasses", "getSealedSubclasses$annotations", "getSealedSubclasses", "simpleName", "getSimpleName", "supertypes", "Lkotlin/reflect/KType;", "getSupertypes$annotations", "getSupertypes", "typeParameters", "Lkotlin/reflect/KTypeParameter;", "getTypeParameters$annotations", "getTypeParameters", "visibility", "Lkotlin/reflect/KVisibility;", "getVisibility$annotations", "getVisibility", "()Lkotlin/reflect/KVisibility;", "equals", "other", "error", "", "hashCode", "", "isInstance", "value", "toString", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class ClassReference implements kotlin.reflect.KClass<java.lang.Object>, kotlin.jvm.internal.ClassBasedDeclarationContainer {

    @org.jetbrains.annotations.NotNull
    public static final kotlin.jvm.internal.ClassReference.Companion Companion = null;

    @org.jetbrains.annotations.NotNull
    private static final java.util.Map<java.lang.Class<? extends kotlin.Function<?>>, java.lang.Integer> FUNCTION_CLASSES = null;

    @org.jetbrains.annotations.NotNull
    private static final java.util.HashMap<java.lang.String, java.lang.String> classFqNames = null;

    @org.jetbrains.annotations.NotNull
    private static final java.util.HashMap<java.lang.String, java.lang.String> primitiveFqNames = null;

    @org.jetbrains.annotations.NotNull
    private static final java.util.HashMap<java.lang.String, java.lang.String> primitiveWrapperFqNames = null;

    @org.jetbrains.annotations.NotNull
    private static final java.util.Map<java.lang.String, java.lang.String> simpleNames = null;

    @org.jetbrains.annotations.NotNull
    private final java.lang.Class<?> jClass;

    /* JADX INFO: compiled from: ClassReference.kt */
    /* JADX INFO: loaded from: classes2.dex */
    @kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u000f\u001a\u0004\u0018\u00010\n2\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u0005J\u0014\u0010\u0011\u001a\u0004\u0018\u00010\n2\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u0005J\u001c\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00012\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u0005R&\u0010\u0003\u001a\u001a\u0012\u0010\u0012\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R*\u0010\b\u001a\u001e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\tj\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n`\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R*\u0010\f\u001a\u001e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\tj\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n`\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R*\u0010\r\u001a\u001e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\tj\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n`\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lkotlin/jvm/internal/ClassReference$Companion;", "", "()V", "FUNCTION_CLASSES", "", "Ljava/lang/Class;", "Lkotlin/Function;", "", "classFqNames", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "primitiveFqNames", "primitiveWrapperFqNames", "simpleNames", "getClassQualifiedName", "jClass", "getClassSimpleName", "isInstance", "", "value", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        private Companion() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @org.jetbrains.annotations.Nullable
        public final java.lang.String getClassQualifiedName(@org.jetbrains.annotations.NotNull java.lang.Class<?> r3) {
                r2 = this;
                java.lang.String r0 = "jClass"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                boolean r0 = r3.isAnonymousClass()
                r1 = 0
                if (r0 == 0) goto Ld
                goto L55
            Ld:
                boolean r0 = r3.isLocalClass()
                if (r0 == 0) goto L14
                goto L55
            L14:
                boolean r0 = r3.isArray()
                if (r0 == 0) goto L40
                java.lang.Class r3 = r3.getComponentType()
                boolean r0 = r3.isPrimitive()
                if (r0 == 0) goto L3b
                java.util.HashMap r0 = kotlin.jvm.internal.ClassReference.access$getClassFqNames$cp()
                java.lang.String r3 = r3.getName()
                java.lang.Object r3 = r0.get(r3)
                java.lang.String r3 = (java.lang.String) r3
                if (r3 == 0) goto L3b
                java.lang.String r0 = "Array"
                java.lang.String r3 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r3, r0)
                r1 = r3
            L3b:
                if (r1 != 0) goto L55
                java.lang.String r1 = "kotlin.Array"
                goto L55
            L40:
                java.util.HashMap r0 = kotlin.jvm.internal.ClassReference.access$getClassFqNames$cp()
                java.lang.String r1 = r3.getName()
                java.lang.Object r0 = r0.get(r1)
                r1 = r0
                java.lang.String r1 = (java.lang.String) r1
                if (r1 != 0) goto L55
                java.lang.String r1 = r3.getCanonicalName()
            L55:
                return r1
        }

        @org.jetbrains.annotations.Nullable
        public final java.lang.String getClassSimpleName(@org.jetbrains.annotations.NotNull java.lang.Class<?> r6) {
                r5 = this;
                java.lang.String r0 = "jClass"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
                boolean r0 = r6.isAnonymousClass()
                java.lang.String r1 = "Array"
                r2 = 0
                if (r0 == 0) goto L11
            Le:
                r1 = r2
                goto La6
            L11:
                boolean r0 = r6.isLocalClass()
                if (r0 == 0) goto L6a
                java.lang.String r0 = r6.getSimpleName()
                java.lang.reflect.Method r1 = r6.getEnclosingMethod()
                r2 = 36
                java.lang.String r3 = "name"
                if (r1 == 0) goto L41
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r3)
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r1 = r1.getName()
                r4.append(r1)
                r4.append(r2)
                java.lang.String r1 = r4.toString()
                java.lang.String r1 = kotlin.text.StringsKt.substringAfter$default(r0, r1)
                if (r1 != 0) goto La6
            L41:
                java.lang.reflect.Constructor r6 = r6.getEnclosingConstructor()
                if (r6 == 0) goto L62
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r3)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r6 = r6.getName()
                r1.append(r6)
                r1.append(r2)
                java.lang.String r6 = r1.toString()
                java.lang.String r1 = kotlin.text.StringsKt.substringAfter$default(r0, r6)
                goto La6
            L62:
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r3)
                java.lang.String r1 = kotlin.text.StringsKt.substringAfter$default(r0)
                goto La6
            L6a:
                boolean r0 = r6.isArray()
                if (r0 == 0) goto L91
                java.lang.Class r6 = r6.getComponentType()
                boolean r0 = r6.isPrimitive()
                if (r0 == 0) goto L8e
                java.util.Map r0 = kotlin.jvm.internal.ClassReference.access$getSimpleNames$cp()
                java.lang.String r6 = r6.getName()
                java.lang.Object r6 = r0.get(r6)
                java.lang.String r6 = (java.lang.String) r6
                if (r6 == 0) goto L8e
                java.lang.String r2 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r6, r1)
            L8e:
                if (r2 != 0) goto Le
                goto La6
            L91:
                java.util.Map r0 = kotlin.jvm.internal.ClassReference.access$getSimpleNames$cp()
                java.lang.String r1 = r6.getName()
                java.lang.Object r0 = r0.get(r1)
                r1 = r0
                java.lang.String r1 = (java.lang.String) r1
                if (r1 != 0) goto La6
                java.lang.String r1 = r6.getSimpleName()
            La6:
                return r1
        }

        public final boolean isInstance(@org.jetbrains.annotations.Nullable java.lang.Object r3, @org.jetbrains.annotations.NotNull java.lang.Class<?> r4) {
                r2 = this;
                java.lang.String r0 = "jClass"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
                java.util.Map r0 = kotlin.jvm.internal.ClassReference.access$getFUNCTION_CLASSES$cp()
                java.lang.String r1 = "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>"
                kotlin.jvm.internal.Intrinsics.checkNotNull(r0, r1)
                java.lang.Object r0 = r0.get(r4)
                java.lang.Integer r0 = (java.lang.Integer) r0
                if (r0 == 0) goto L1f
                int r4 = r0.intValue()
                boolean r3 = kotlin.jvm.internal.TypeIntrinsics.isFunctionOfArity(r3, r4)
                return r3
            L1f:
                boolean r0 = r4.isPrimitive()
                if (r0 == 0) goto L2d
                kotlin.reflect.KClass r4 = kotlin.jvm.JvmClassMappingKt.getKotlinClass(r4)
                java.lang.Class r4 = kotlin.jvm.JvmClassMappingKt.getJavaObjectType(r4)
            L2d:
                boolean r3 = r4.isInstance(r3)
                return r3
        }
    }

    static {
            kotlin.jvm.internal.ClassReference$Companion r0 = new kotlin.jvm.internal.ClassReference$Companion
            r1 = 0
            r0.<init>(r1)
            kotlin.jvm.internal.ClassReference.Companion = r0
            r0 = 23
            java.lang.Class[] r0 = new java.lang.Class[r0]
            java.lang.Class<kotlin.jvm.functions.Function0> r1 = kotlin.jvm.functions.Function0.class
            r2 = 0
            r0[r2] = r1
            java.lang.Class<kotlin.jvm.functions.Function1> r1 = kotlin.jvm.functions.Function1.class
            r3 = 1
            r0[r3] = r1
            java.lang.Class<kotlin.jvm.functions.Function2> r1 = kotlin.jvm.functions.Function2.class
            r3 = 2
            r0[r3] = r1
            r1 = 3
            java.lang.Class<kotlin.jvm.functions.Function3> r3 = kotlin.jvm.functions.Function3.class
            r0[r1] = r3
            r1 = 4
            java.lang.Class<kotlin.jvm.functions.Function4> r3 = kotlin.jvm.functions.Function4.class
            r0[r1] = r3
            r1 = 5
            java.lang.Class<kotlin.jvm.functions.Function5> r3 = kotlin.jvm.functions.Function5.class
            r0[r1] = r3
            r1 = 6
            java.lang.Class<kotlin.jvm.functions.Function6> r3 = kotlin.jvm.functions.Function6.class
            r0[r1] = r3
            r1 = 7
            java.lang.Class<kotlin.jvm.functions.Function7> r3 = kotlin.jvm.functions.Function7.class
            r0[r1] = r3
            r1 = 8
            java.lang.Class<kotlin.jvm.functions.Function8> r3 = kotlin.jvm.functions.Function8.class
            r0[r1] = r3
            r1 = 9
            java.lang.Class<kotlin.jvm.functions.Function9> r3 = kotlin.jvm.functions.Function9.class
            r0[r1] = r3
            java.lang.Class<kotlin.jvm.functions.Function10> r1 = kotlin.jvm.functions.Function10.class
            r3 = 10
            r0[r3] = r1
            r1 = 11
            java.lang.Class<kotlin.jvm.functions.Function11> r3 = kotlin.jvm.functions.Function11.class
            r0[r1] = r3
            r1 = 12
            java.lang.Class<kotlin.jvm.functions.Function12> r3 = kotlin.jvm.functions.Function12.class
            r0[r1] = r3
            r1 = 13
            java.lang.Class<kotlin.jvm.functions.Function13> r3 = kotlin.jvm.functions.Function13.class
            r0[r1] = r3
            r1 = 14
            java.lang.Class<kotlin.jvm.functions.Function14> r3 = kotlin.jvm.functions.Function14.class
            r0[r1] = r3
            r1 = 15
            java.lang.Class<kotlin.jvm.functions.Function15> r3 = kotlin.jvm.functions.Function15.class
            r0[r1] = r3
            r1 = 16
            java.lang.Class<kotlin.jvm.functions.Function16> r3 = kotlin.jvm.functions.Function16.class
            r0[r1] = r3
            r1 = 17
            java.lang.Class<kotlin.jvm.functions.Function17> r3 = kotlin.jvm.functions.Function17.class
            r0[r1] = r3
            r1 = 18
            java.lang.Class<kotlin.jvm.functions.Function18> r3 = kotlin.jvm.functions.Function18.class
            r0[r1] = r3
            r1 = 19
            java.lang.Class<kotlin.jvm.functions.Function19> r3 = kotlin.jvm.functions.Function19.class
            r0[r1] = r3
            r1 = 20
            java.lang.Class<kotlin.jvm.functions.Function20> r3 = kotlin.jvm.functions.Function20.class
            r0[r1] = r3
            r1 = 21
            java.lang.Class<kotlin.jvm.functions.Function21> r3 = kotlin.jvm.functions.Function21.class
            r0[r1] = r3
            r1 = 22
            java.lang.Class<kotlin.jvm.functions.Function22> r3 = kotlin.jvm.functions.Function22.class
            r0[r1] = r3
            java.util.List r0 = kotlin.collections.CollectionsKt.listOf(r0)
            java.util.ArrayList r1 = new java.util.ArrayList
            int r3 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r0)
            r1.<init>(r3)
            java.util.Iterator r0 = r0.iterator()
        L9f:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto Lbf
            java.lang.Object r3 = r0.next()
            int r4 = r2 + 1
            if (r2 >= 0) goto Lb0
            kotlin.collections.CollectionsKt.throwIndexOverflow()
        Lb0:
            java.lang.Class r3 = (java.lang.Class) r3
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            kotlin.Pair r2 = kotlin.TuplesKt.to(r3, r2)
            r1.add(r2)
            r2 = r4
            goto L9f
        Lbf:
            java.util.Map r0 = kotlin.collections.MapsKt.toMap(r1)
            kotlin.jvm.internal.ClassReference.FUNCTION_CLASSES = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.String r1 = "kotlin.Boolean"
            java.lang.String r2 = "boolean"
            r0.put(r2, r1)
            java.lang.String r2 = "kotlin.Char"
            java.lang.String r3 = "char"
            r0.put(r3, r2)
            java.lang.String r3 = "kotlin.Byte"
            java.lang.String r4 = "byte"
            r0.put(r4, r3)
            java.lang.String r4 = "kotlin.Short"
            java.lang.String r5 = "short"
            r0.put(r5, r4)
            java.lang.String r5 = "kotlin.Int"
            java.lang.String r6 = "int"
            r0.put(r6, r5)
            java.lang.String r6 = "kotlin.Float"
            java.lang.String r7 = "float"
            r0.put(r7, r6)
            java.lang.String r7 = "kotlin.Long"
            java.lang.String r8 = "long"
            r0.put(r8, r7)
            java.lang.String r8 = "kotlin.Double"
            java.lang.String r9 = "double"
            r0.put(r9, r8)
            kotlin.jvm.internal.ClassReference.primitiveFqNames = r0
            java.util.HashMap r9 = new java.util.HashMap
            r9.<init>()
            java.lang.String r10 = "java.lang.Boolean"
            r9.put(r10, r1)
            java.lang.String r1 = "java.lang.Character"
            r9.put(r1, r2)
            java.lang.String r1 = "java.lang.Byte"
            r9.put(r1, r3)
            java.lang.String r1 = "java.lang.Short"
            r9.put(r1, r4)
            java.lang.String r1 = "java.lang.Integer"
            r9.put(r1, r5)
            java.lang.String r1 = "java.lang.Float"
            r9.put(r1, r6)
            java.lang.String r1 = "java.lang.Long"
            r9.put(r1, r7)
            java.lang.String r1 = "java.lang.Double"
            r9.put(r1, r8)
            kotlin.jvm.internal.ClassReference.primitiveWrapperFqNames = r9
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.lang.String r2 = "java.lang.Object"
            java.lang.String r3 = "kotlin.Any"
            r1.put(r2, r3)
            java.lang.String r2 = "java.lang.String"
            java.lang.String r3 = "kotlin.String"
            r1.put(r2, r3)
            java.lang.String r2 = "java.lang.CharSequence"
            java.lang.String r3 = "kotlin.CharSequence"
            r1.put(r2, r3)
            java.lang.String r2 = "java.lang.Throwable"
            java.lang.String r3 = "kotlin.Throwable"
            r1.put(r2, r3)
            java.lang.String r2 = "java.lang.Cloneable"
            java.lang.String r3 = "kotlin.Cloneable"
            r1.put(r2, r3)
            java.lang.String r2 = "java.lang.Number"
            java.lang.String r3 = "kotlin.Number"
            r1.put(r2, r3)
            java.lang.String r2 = "java.lang.Comparable"
            java.lang.String r3 = "kotlin.Comparable"
            r1.put(r2, r3)
            java.lang.String r2 = "java.lang.Enum"
            java.lang.String r3 = "kotlin.Enum"
            r1.put(r2, r3)
            java.lang.String r2 = "java.lang.annotation.Annotation"
            java.lang.String r3 = "kotlin.Annotation"
            r1.put(r2, r3)
            java.lang.String r2 = "java.lang.Iterable"
            java.lang.String r3 = "kotlin.collections.Iterable"
            r1.put(r2, r3)
            java.lang.String r2 = "java.util.Iterator"
            java.lang.String r3 = "kotlin.collections.Iterator"
            r1.put(r2, r3)
            java.lang.String r2 = "java.util.Collection"
            java.lang.String r3 = "kotlin.collections.Collection"
            r1.put(r2, r3)
            java.lang.String r2 = "java.util.List"
            java.lang.String r3 = "kotlin.collections.List"
            r1.put(r2, r3)
            java.lang.String r2 = "java.util.Set"
            java.lang.String r3 = "kotlin.collections.Set"
            r1.put(r2, r3)
            java.lang.String r2 = "java.util.ListIterator"
            java.lang.String r3 = "kotlin.collections.ListIterator"
            r1.put(r2, r3)
            java.lang.String r2 = "java.util.Map"
            java.lang.String r3 = "kotlin.collections.Map"
            r1.put(r2, r3)
            java.lang.String r2 = "java.util.Map$Entry"
            java.lang.String r3 = "kotlin.collections.Map.Entry"
            r1.put(r2, r3)
            java.lang.String r2 = "kotlin.jvm.internal.StringCompanionObject"
            java.lang.String r3 = "kotlin.String.Companion"
            r1.put(r2, r3)
            java.lang.String r2 = "kotlin.jvm.internal.EnumCompanionObject"
            java.lang.String r3 = "kotlin.Enum.Companion"
            r1.put(r2, r3)
            r1.putAll(r0)
            r1.putAll(r9)
            java.util.Collection r0 = r0.values()
            java.lang.String r2 = "primitiveFqNames.values"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r2)
            java.util.Iterator r0 = r0.iterator()
        L1d1:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L21d
            java.lang.Object r2 = r0.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "kotlin.jvm.internal."
            r3.append(r4)
            java.lang.String r4 = "kotlinName"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r4)
            java.lang.String r4 = kotlin.text.StringsKt.substringAfterLast$default(r2)
            r3.append(r4)
            java.lang.String r4 = "CompanionObject"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r2)
            java.lang.String r2 = ".Companion"
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            kotlin.Pair r2 = kotlin.TuplesKt.to(r3, r2)
            java.lang.Object r3 = r2.getFirst()
            java.lang.Object r2 = r2.getSecond()
            r1.put(r3, r2)
            goto L1d1
        L21d:
            java.util.Map<java.lang.Class<? extends kotlin.Function<?>>, java.lang.Integer> r0 = kotlin.jvm.internal.ClassReference.FUNCTION_CLASSES
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L227:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L25c
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            java.lang.Class r3 = (java.lang.Class) r3
            java.lang.Object r2 = r2.getValue()
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            java.lang.String r3 = r3.getName()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "kotlin.Function"
            r4.append(r5)
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            r1.put(r3, r2)
            goto L227
        L25c:
            kotlin.jvm.internal.ClassReference.classFqNames = r1
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            int r2 = r1.size()
            int r2 = kotlin.collections.MapsKt.mapCapacity(r2)
            r0.<init>(r2)
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L273:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L291
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            java.lang.Object r2 = r2.getValue()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r2 = kotlin.text.StringsKt.substringAfterLast$default(r2)
            r0.put(r3, r2)
            goto L273
        L291:
            kotlin.jvm.internal.ClassReference.simpleNames = r0
            return
    }

    public ClassReference(@org.jetbrains.annotations.NotNull java.lang.Class<?> r2) {
            r1 = this;
            java.lang.String r0 = "jClass"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r1.<init>()
            r1.jClass = r2
            return
    }

    public static final /* synthetic */ java.util.HashMap access$getClassFqNames$cp() {
            java.util.HashMap<java.lang.String, java.lang.String> r0 = kotlin.jvm.internal.ClassReference.classFqNames
            return r0
    }

    public static final /* synthetic */ java.util.Map access$getFUNCTION_CLASSES$cp() {
            java.util.Map<java.lang.Class<? extends kotlin.Function<?>>, java.lang.Integer> r0 = kotlin.jvm.internal.ClassReference.FUNCTION_CLASSES
            return r0
    }

    public static final /* synthetic */ java.util.Map access$getSimpleNames$cp() {
            java.util.Map<java.lang.String, java.lang.String> r0 = kotlin.jvm.internal.ClassReference.simpleNames
            return r0
    }

    private final java.lang.Void error() {
            r1 = this;
            kotlin.jvm.KotlinReflectionNotSupportedError r0 = new kotlin.jvm.KotlinReflectionNotSupportedError
            r0.<init>()
            throw r0
    }

    @kotlin.SinceKotlin(version = "1.3")
    public static /* synthetic */ void getSealedSubclasses$annotations() {
            return
    }

    @kotlin.SinceKotlin(version = "1.1")
    public static /* synthetic */ void getSupertypes$annotations() {
            return
    }

    @kotlin.SinceKotlin(version = "1.1")
    public static /* synthetic */ void getTypeParameters$annotations() {
            return
    }

    @kotlin.SinceKotlin(version = "1.1")
    public static /* synthetic */ void getVisibility$annotations() {
            return
    }

    @kotlin.SinceKotlin(version = "1.1")
    public static /* synthetic */ void isAbstract$annotations() {
            return
    }

    @kotlin.SinceKotlin(version = "1.1")
    public static /* synthetic */ void isCompanion$annotations() {
            return
    }

    @kotlin.SinceKotlin(version = "1.1")
    public static /* synthetic */ void isData$annotations() {
            return
    }

    @kotlin.SinceKotlin(version = "1.1")
    public static /* synthetic */ void isFinal$annotations() {
            return
    }

    @kotlin.SinceKotlin(version = "1.4")
    public static /* synthetic */ void isFun$annotations() {
            return
    }

    @kotlin.SinceKotlin(version = "1.1")
    public static /* synthetic */ void isInner$annotations() {
            return
    }

    @kotlin.SinceKotlin(version = "1.1")
    public static /* synthetic */ void isOpen$annotations() {
            return
    }

    @kotlin.SinceKotlin(version = "1.1")
    public static /* synthetic */ void isSealed$annotations() {
            return
    }

    @kotlin.SinceKotlin(version = "1.5")
    public static /* synthetic */ void isValue$annotations() {
            return
    }

    @Override // kotlin.reflect.KClass
    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof kotlin.jvm.internal.ClassReference
            if (r0 == 0) goto L16
            java.lang.Class r0 = kotlin.jvm.JvmClassMappingKt.getJavaObjectType(r1)
            kotlin.reflect.KClass r2 = (kotlin.reflect.KClass) r2
            java.lang.Class r2 = kotlin.jvm.JvmClassMappingKt.getJavaObjectType(r2)
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r2)
            if (r2 == 0) goto L16
            r2 = 1
            goto L17
        L16:
            r2 = 0
        L17:
            return r2
    }

    @Override // kotlin.reflect.KAnnotatedElement
    @org.jetbrains.annotations.NotNull
    public java.util.List<java.lang.annotation.Annotation> getAnnotations() {
            r1 = this;
            r1.error()
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException
            r0.<init>()
            throw r0
    }

    @Override // kotlin.reflect.KClass
    @org.jetbrains.annotations.NotNull
    public java.util.Collection<kotlin.reflect.KFunction<java.lang.Object>> getConstructors() {
            r1 = this;
            r1.error()
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException
            r0.<init>()
            throw r0
    }

    @Override // kotlin.jvm.internal.ClassBasedDeclarationContainer
    @org.jetbrains.annotations.NotNull
    public java.lang.Class<?> getJClass() {
            r1 = this;
            java.lang.Class<?> r0 = r1.jClass
            return r0
    }

    @Override // kotlin.reflect.KClass, kotlin.reflect.KDeclarationContainer
    @org.jetbrains.annotations.NotNull
    public java.util.Collection<kotlin.reflect.KCallable<?>> getMembers() {
            r1 = this;
            r1.error()
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException
            r0.<init>()
            throw r0
    }

    @Override // kotlin.reflect.KClass
    @org.jetbrains.annotations.NotNull
    public java.util.Collection<kotlin.reflect.KClass<?>> getNestedClasses() {
            r1 = this;
            r1.error()
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException
            r0.<init>()
            throw r0
    }

    @Override // kotlin.reflect.KClass
    @org.jetbrains.annotations.Nullable
    public java.lang.Object getObjectInstance() {
            r1 = this;
            r1.error()
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException
            r0.<init>()
            throw r0
    }

    @Override // kotlin.reflect.KClass
    @org.jetbrains.annotations.Nullable
    public java.lang.String getQualifiedName() {
            r2 = this;
            kotlin.jvm.internal.ClassReference$Companion r0 = kotlin.jvm.internal.ClassReference.Companion
            java.lang.Class r1 = r2.getJClass()
            java.lang.String r0 = r0.getClassQualifiedName(r1)
            return r0
    }

    @Override // kotlin.reflect.KClass
    @org.jetbrains.annotations.NotNull
    public java.util.List<kotlin.reflect.KClass<? extends java.lang.Object>> getSealedSubclasses() {
            r1 = this;
            r1.error()
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException
            r0.<init>()
            throw r0
    }

    @Override // kotlin.reflect.KClass
    @org.jetbrains.annotations.Nullable
    public java.lang.String getSimpleName() {
            r2 = this;
            kotlin.jvm.internal.ClassReference$Companion r0 = kotlin.jvm.internal.ClassReference.Companion
            java.lang.Class r1 = r2.getJClass()
            java.lang.String r0 = r0.getClassSimpleName(r1)
            return r0
    }

    @Override // kotlin.reflect.KClass
    @org.jetbrains.annotations.NotNull
    public java.util.List<kotlin.reflect.KType> getSupertypes() {
            r1 = this;
            r1.error()
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException
            r0.<init>()
            throw r0
    }

    @Override // kotlin.reflect.KClass
    @org.jetbrains.annotations.NotNull
    public java.util.List<kotlin.reflect.KTypeParameter> getTypeParameters() {
            r1 = this;
            r1.error()
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException
            r0.<init>()
            throw r0
    }

    @Override // kotlin.reflect.KClass
    @org.jetbrains.annotations.Nullable
    public kotlin.reflect.KVisibility getVisibility() {
            r1 = this;
            r1.error()
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException
            r0.<init>()
            throw r0
    }

    @Override // kotlin.reflect.KClass
    public int hashCode() {
            r1 = this;
            java.lang.Class r0 = kotlin.jvm.JvmClassMappingKt.getJavaObjectType(r1)
            int r0 = r0.hashCode()
            return r0
    }

    @Override // kotlin.reflect.KClass
    public boolean isAbstract() {
            r1 = this;
            r1.error()
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException
            r0.<init>()
            throw r0
    }

    @Override // kotlin.reflect.KClass
    public boolean isCompanion() {
            r1 = this;
            r1.error()
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException
            r0.<init>()
            throw r0
    }

    @Override // kotlin.reflect.KClass
    public boolean isData() {
            r1 = this;
            r1.error()
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException
            r0.<init>()
            throw r0
    }

    @Override // kotlin.reflect.KClass
    public boolean isFinal() {
            r1 = this;
            r1.error()
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException
            r0.<init>()
            throw r0
    }

    @Override // kotlin.reflect.KClass
    public boolean isFun() {
            r1 = this;
            r1.error()
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException
            r0.<init>()
            throw r0
    }

    @Override // kotlin.reflect.KClass
    public boolean isInner() {
            r1 = this;
            r1.error()
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException
            r0.<init>()
            throw r0
    }

    @Override // kotlin.reflect.KClass
    @kotlin.SinceKotlin(version = "1.1")
    public boolean isInstance(@org.jetbrains.annotations.Nullable java.lang.Object r3) {
            r2 = this;
            kotlin.jvm.internal.ClassReference$Companion r0 = kotlin.jvm.internal.ClassReference.Companion
            java.lang.Class r1 = r2.getJClass()
            boolean r3 = r0.isInstance(r3, r1)
            return r3
    }

    @Override // kotlin.reflect.KClass
    public boolean isOpen() {
            r1 = this;
            r1.error()
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException
            r0.<init>()
            throw r0
    }

    @Override // kotlin.reflect.KClass
    public boolean isSealed() {
            r1 = this;
            r1.error()
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException
            r0.<init>()
            throw r0
    }

    @Override // kotlin.reflect.KClass
    public boolean isValue() {
            r1 = this;
            r1.error()
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException
            r0.<init>()
            throw r0
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class r1 = r2.getJClass()
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            java.lang.String r1 = " (Kotlin reflection is not available)"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
