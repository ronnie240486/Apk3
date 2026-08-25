package kotlin.jvm;

/* JADX INFO: compiled from: JvmClassMapping.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0010\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\u0010\u0011\n\u0002\b\u0002\u001a\u001f\u0010\u001f\u001a\u00020 \"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0014*\u0006\u0012\u0002\b\u00030!¢\u0006\u0002\u0010\"\"'\u0010\u0000\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u0002H\u00028F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\"5\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\b0\u0007\"\u000e\b\u0000\u0010\b*\b\u0012\u0004\u0012\u0002H\b0\t*\u0002H\b8Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"-\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0007\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00018G¢\u0006\f\u0012\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"&\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0007\"\b\b\u0000\u0010\u0002*\u00020\u0014*\u0002H\u00028Æ\u0002¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0015\";\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00010\u0007\"\b\b\u0000\u0010\u0002*\u00020\u0014*\b\u0012\u0004\u0012\u0002H\u00020\u00018Ç\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\u0016\u0010\u0010\u001a\u0004\b\u0017\u0010\u0012\"+\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0007\"\b\b\u0000\u0010\u0002*\u00020\u0014*\b\u0012\u0004\u0012\u0002H\u00020\u00018F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0012\"-\u0010\u001a\u001a\n\u0012\u0004\u0012\u0002H\u0002\u0018\u00010\u0007\"\b\b\u0000\u0010\u0002*\u00020\u0014*\b\u0012\u0004\u0012\u0002H\u00020\u00018F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0012\"+\u0010\u001c\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0014*\b\u0012\u0004\u0012\u0002H\u00020\u00078G¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006#"}, d2 = {"annotationClass", "Lkotlin/reflect/KClass;", "T", "", "getAnnotationClass", "(Ljava/lang/annotation/Annotation;)Lkotlin/reflect/KClass;", "declaringJavaClass", "Ljava/lang/Class;", "E", "", "getDeclaringJavaClass$annotations", "(Ljava/lang/Enum;)V", "getDeclaringJavaClass", "(Ljava/lang/Enum;)Ljava/lang/Class;", "java", "getJavaClass$annotations", "(Lkotlin/reflect/KClass;)V", "getJavaClass", "(Lkotlin/reflect/KClass;)Ljava/lang/Class;", "javaClass", "", "(Ljava/lang/Object;)Ljava/lang/Class;", "getRuntimeClassOfKClassInstance$annotations", "getRuntimeClassOfKClassInstance", "javaObjectType", "getJavaObjectType", "javaPrimitiveType", "getJavaPrimitiveType", "kotlin", "getKotlinClass", "(Ljava/lang/Class;)Lkotlin/reflect/KClass;", "isArrayOf", "", "", "([Ljava/lang/Object;)Z", "kotlin-stdlib"}, k = 2, mv = {1, 7, 1}, xi = 48)
@kotlin.jvm.JvmName(name = "JvmClassMappingKt")
public final class JvmClassMappingKt {
    @org.jetbrains.annotations.NotNull
    public static final <T extends java.lang.annotation.Annotation> kotlin.reflect.KClass<? extends T> getAnnotationClass(@org.jetbrains.annotations.NotNull T r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.Class r1 = r1.annotationType()
            java.lang.String r0 = "this as java.lang.annota…otation).annotationType()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r0)
            kotlin.reflect.KClass r1 = getKotlinClass(r1)
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.reflect.KClass<out T of kotlin.jvm.JvmClassMappingKt.<get-annotationClass>>"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1, r0)
            return r1
    }

    private static final <E extends java.lang.Enum<E>> java.lang.Class<E> getDeclaringJavaClass(E r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.Class r1 = r1.getDeclaringClass()
            java.lang.String r0 = "this as java.lang.Enum<E>).declaringClass"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r0)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.7")
    @kotlin.internal.InlineOnly
    public static /* synthetic */ void getDeclaringJavaClass$annotations(java.lang.Enum r0) {
            return
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> java.lang.Class<T> getJavaClass(@org.jetbrains.annotations.NotNull T r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.Class r1 = r1.getClass()
            java.lang.String r0 = "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaClass>>"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1, r0)
            return r1
    }

    @kotlin.jvm.JvmName(name = "getJavaClass")
    @org.jetbrains.annotations.NotNull
    public static final <T> java.lang.Class<T> getJavaClass(@org.jetbrains.annotations.NotNull kotlin.reflect.KClass<T> r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            kotlin.jvm.internal.ClassBasedDeclarationContainer r1 = (kotlin.jvm.internal.ClassBasedDeclarationContainer) r1
            java.lang.Class r1 = r1.getJClass()
            java.lang.String r0 = "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1, r0)
            return r1
    }

    public static /* synthetic */ void getJavaClass$annotations(kotlin.reflect.KClass r0) {
            return
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> java.lang.Class<T> getJavaObjectType(@org.jetbrains.annotations.NotNull kotlin.reflect.KClass<T> r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            kotlin.jvm.internal.ClassBasedDeclarationContainer r3 = (kotlin.jvm.internal.ClassBasedDeclarationContainer) r3
            java.lang.Class r3 = r3.getJClass()
            boolean r0 = r3.isPrimitive()
            java.lang.String r1 = "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaObjectType>>"
            if (r0 != 0) goto L17
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3, r1)
            return r3
        L17:
            java.lang.String r0 = r3.getName()
            int r2 = r0.hashCode()
            switch(r2) {
                case -1325958191: goto L88;
                case 104431: goto L7c;
                case 3039496: goto L70;
                case 3052374: goto L64;
                case 3327612: goto L58;
                case 3625364: goto L4b;
                case 64711720: goto L3f;
                case 97526364: goto L33;
                case 109413500: goto L24;
                default: goto L22;
            }
        L22:
            goto L93
        L24:
            java.lang.String r2 = "short"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L2f
            goto L93
        L2f:
            java.lang.Class<java.lang.Short> r3 = java.lang.Short.class
            goto L93
        L33:
            java.lang.String r2 = "float"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L3c
            goto L93
        L3c:
            java.lang.Class<java.lang.Float> r3 = java.lang.Float.class
            goto L93
        L3f:
            java.lang.String r2 = "boolean"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L48
            goto L93
        L48:
            java.lang.Class<java.lang.Boolean> r3 = java.lang.Boolean.class
            goto L93
        L4b:
            java.lang.String r2 = "void"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L55
            goto L93
        L55:
            java.lang.Class<java.lang.Void> r3 = java.lang.Void.class
            goto L93
        L58:
            java.lang.String r2 = "long"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L61
            goto L93
        L61:
            java.lang.Class<java.lang.Long> r3 = java.lang.Long.class
            goto L93
        L64:
            java.lang.String r2 = "char"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L6d
            goto L93
        L6d:
            java.lang.Class<java.lang.Character> r3 = java.lang.Character.class
            goto L93
        L70:
            java.lang.String r2 = "byte"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L79
            goto L93
        L79:
            java.lang.Class<java.lang.Byte> r3 = java.lang.Byte.class
            goto L93
        L7c:
            java.lang.String r2 = "int"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L85
            goto L93
        L85:
            java.lang.Class<java.lang.Integer> r3 = java.lang.Integer.class
            goto L93
        L88:
            java.lang.String r2 = "double"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L91
            goto L93
        L91:
            java.lang.Class<java.lang.Double> r3 = java.lang.Double.class
        L93:
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3, r1)
            return r3
    }

    @org.jetbrains.annotations.Nullable
    public static final <T> java.lang.Class<T> getJavaPrimitiveType(@org.jetbrains.annotations.NotNull kotlin.reflect.KClass<T> r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            kotlin.jvm.internal.ClassBasedDeclarationContainer r1 = (kotlin.jvm.internal.ClassBasedDeclarationContainer) r1
            java.lang.Class r1 = r1.getJClass()
            boolean r0 = r1.isPrimitive()
            if (r0 == 0) goto L17
            java.lang.String r0 = "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaPrimitiveType>>"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1, r0)
            return r1
        L17:
            java.lang.String r1 = r1.getName()
            int r0 = r1.hashCode()
            switch(r0) {
                case -2056817302: goto L86;
                case -527879800: goto L7a;
                case -515992664: goto L6e;
                case 155276373: goto L62;
                case 344809556: goto L56;
                case 398507100: goto L4a;
                case 398795216: goto L3e;
                case 399092968: goto L32;
                case 761287205: goto L24;
                default: goto L22;
            }
        L22:
            goto L92
        L24:
            java.lang.String r0 = "java.lang.Double"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L2e
            goto L92
        L2e:
            java.lang.Class r1 = java.lang.Double.TYPE
            goto L93
        L32:
            java.lang.String r0 = "java.lang.Void"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L3b
            goto L92
        L3b:
            java.lang.Class r1 = java.lang.Void.TYPE
            goto L93
        L3e:
            java.lang.String r0 = "java.lang.Long"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L47
            goto L92
        L47:
            java.lang.Class r1 = java.lang.Long.TYPE
            goto L93
        L4a:
            java.lang.String r0 = "java.lang.Byte"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L53
            goto L92
        L53:
            java.lang.Class r1 = java.lang.Byte.TYPE
            goto L93
        L56:
            java.lang.String r0 = "java.lang.Boolean"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L5f
            goto L92
        L5f:
            java.lang.Class r1 = java.lang.Boolean.TYPE
            goto L93
        L62:
            java.lang.String r0 = "java.lang.Character"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L6b
            goto L92
        L6b:
            java.lang.Class r1 = java.lang.Character.TYPE
            goto L93
        L6e:
            java.lang.String r0 = "java.lang.Short"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L77
            goto L92
        L77:
            java.lang.Class r1 = java.lang.Short.TYPE
            goto L93
        L7a:
            java.lang.String r0 = "java.lang.Float"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L83
            goto L92
        L83:
            java.lang.Class r1 = java.lang.Float.TYPE
            goto L93
        L86:
            java.lang.String r0 = "java.lang.Integer"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L8f
            goto L92
        L8f:
            java.lang.Class r1 = java.lang.Integer.TYPE
            goto L93
        L92:
            r1 = 0
        L93:
            return r1
    }

    @kotlin.jvm.JvmName(name = "getKotlinClass")
    @org.jetbrains.annotations.NotNull
    public static final <T> kotlin.reflect.KClass<T> getKotlinClass(@org.jetbrains.annotations.NotNull java.lang.Class<T> r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            kotlin.reflect.KClass r1 = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(r1)
            return r1
    }

    @kotlin.jvm.JvmName(name = "getRuntimeClassOfKClassInstance")
    @org.jetbrains.annotations.NotNull
    public static final <T> java.lang.Class<kotlin.reflect.KClass<T>> getRuntimeClassOfKClassInstance(@org.jetbrains.annotations.NotNull kotlin.reflect.KClass<T> r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.Class r1 = r1.getClass()
            java.lang.String r0 = "null cannot be cast to non-null type java.lang.Class<kotlin.reflect.KClass<T of kotlin.jvm.JvmClassMappingKt.<get-javaClass>>>"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1, r0)
            return r1
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Use 'java' property to get Java class corresponding to this Kotlin class or cast this instance to Any if you really want to get the runtime Java class of this implementation of KClass.", replaceWith = @kotlin.ReplaceWith(expression = "(this as Any).javaClass", imports = {}))
    public static /* synthetic */ void getRuntimeClassOfKClassInstance$annotations(kotlin.reflect.KClass r0) {
            return
    }

    public static final /* synthetic */ boolean isArrayOf(java.lang.Object[] r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r0 = 4
            java.lang.String r1 = "T"
            kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(r0, r1)
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            java.lang.Class r2 = r2.getClass()
            java.lang.Class r2 = r2.getComponentType()
            boolean r2 = r0.isAssignableFrom(r2)
            return r2
    }
}
