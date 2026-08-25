package com.google.common.reflect;

/* JADX INFO: loaded from: classes.dex */
@com.google.common.reflect.ElementTypesAreNonnullByDefault
final class Types {
    public static final /* synthetic */ int $r8$clinit = 0;
    private static final com.google.common.base.Joiner COMMA_JOINER = null;
    private static final com.google.common.base.Function<java.lang.reflect.Type, java.lang.String> TYPE_NAME = null;



    public static abstract enum ClassOwnership extends java.lang.Enum<com.google.common.reflect.Types.ClassOwnership> {
        private static final /* synthetic */ com.google.common.reflect.Types.ClassOwnership[] $VALUES = null;
        public static final com.google.common.reflect.Types.ClassOwnership JVM_BEHAVIOR = null;
        public static final com.google.common.reflect.Types.ClassOwnership LOCAL_CLASS_HAS_NO_OWNER = null;
        public static final com.google.common.reflect.Types.ClassOwnership OWNED_BY_ENCLOSING_CLASS = null;




        /* JADX INFO: renamed from: com.google.common.reflect.Types$ClassOwnership$3, reason: invalid class name */
        public class AnonymousClass3 extends com.google.common.reflect.Types.ClassOwnership.C1LocalClass<java.lang.String> {
            public AnonymousClass3() {
                    r0 = this;
                    r0.<init>()
                    return
            }
        }

        private static /* synthetic */ com.google.common.reflect.Types.ClassOwnership[] $values() {
                r0 = 2
                com.google.common.reflect.Types$ClassOwnership[] r0 = new com.google.common.reflect.Types.ClassOwnership[r0]
                com.google.common.reflect.Types$ClassOwnership r1 = com.google.common.reflect.Types.ClassOwnership.OWNED_BY_ENCLOSING_CLASS
                r2 = 0
                r0[r2] = r1
                com.google.common.reflect.Types$ClassOwnership r1 = com.google.common.reflect.Types.ClassOwnership.LOCAL_CLASS_HAS_NO_OWNER
                r2 = 1
                r0[r2] = r1
                return r0
        }

        static {
                com.google.common.reflect.Types$ClassOwnership$1 r0 = new com.google.common.reflect.Types$ClassOwnership$1
                r0.<init>()
                com.google.common.reflect.Types.ClassOwnership.OWNED_BY_ENCLOSING_CLASS = r0
                com.google.common.reflect.Types$ClassOwnership$2 r0 = new com.google.common.reflect.Types$ClassOwnership$2
                r0.<init>()
                com.google.common.reflect.Types.ClassOwnership.LOCAL_CLASS_HAS_NO_OWNER = r0
                com.google.common.reflect.Types$ClassOwnership[] r0 = $values()
                com.google.common.reflect.Types.ClassOwnership.$VALUES = r0
                com.google.common.reflect.Types$ClassOwnership r0 = detectJvmBehavior()
                com.google.common.reflect.Types.ClassOwnership.JVM_BEHAVIOR = r0
                return
        }

        private ClassOwnership(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public /* synthetic */ ClassOwnership(java.lang.String r1, int r2, com.google.common.reflect.Types.AnonymousClass1 r3) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        private static com.google.common.reflect.Types.ClassOwnership detectJvmBehavior() {
                java.lang.Class<com.google.common.reflect.Types$ClassOwnership$3> r0 = com.google.common.reflect.Types.ClassOwnership.AnonymousClass3.class
                java.lang.reflect.Type r0 = r0.getGenericSuperclass()
                java.lang.reflect.ParameterizedType r0 = (java.lang.reflect.ParameterizedType) r0
                java.util.Objects.requireNonNull(r0)
                java.lang.reflect.ParameterizedType r0 = (java.lang.reflect.ParameterizedType) r0
                com.google.common.reflect.Types$ClassOwnership[] r1 = values()
                int r2 = r1.length
                r3 = 0
            L13:
                if (r3 >= r2) goto L27
                r4 = r1[r3]
                java.lang.Class<com.google.common.reflect.Types$ClassOwnership$1LocalClass> r5 = com.google.common.reflect.Types.ClassOwnership.C1LocalClass.class
                java.lang.Class r5 = r4.getOwnerType(r5)
                java.lang.reflect.Type r6 = r0.getOwnerType()
                if (r5 != r6) goto L24
                return r4
            L24:
                int r3 = r3 + 1
                goto L13
            L27:
                java.lang.AssertionError r0 = new java.lang.AssertionError
                r0.<init>()
                throw r0
        }

        public static com.google.common.reflect.Types.ClassOwnership valueOf(java.lang.String r1) {
                java.lang.Class<com.google.common.reflect.Types$ClassOwnership> r0 = com.google.common.reflect.Types.ClassOwnership.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.google.common.reflect.Types$ClassOwnership r1 = (com.google.common.reflect.Types.ClassOwnership) r1
                return r1
        }

        public static com.google.common.reflect.Types.ClassOwnership[] values() {
                com.google.common.reflect.Types$ClassOwnership[] r0 = com.google.common.reflect.Types.ClassOwnership.$VALUES
                java.lang.Object r0 = r0.clone()
                com.google.common.reflect.Types$ClassOwnership[] r0 = (com.google.common.reflect.Types.ClassOwnership[]) r0
                return r0
        }

        @javax.annotation.CheckForNull
        public abstract java.lang.Class<?> getOwnerType(java.lang.Class<?> r1);
    }

    public static final class GenericArrayTypeImpl implements java.lang.reflect.GenericArrayType, java.io.Serializable {
        private static final long serialVersionUID = 0;
        private final java.lang.reflect.Type componentType;

        public GenericArrayTypeImpl(java.lang.reflect.Type r2) {
                r1 = this;
                r1.<init>()
                com.google.common.reflect.Types$JavaVersion r0 = com.google.common.reflect.Types.JavaVersion.CURRENT
                java.lang.reflect.Type r2 = r0.usedInGenericType(r2)
                r1.componentType = r2
                return
        }

        public boolean equals(@javax.annotation.CheckForNull java.lang.Object r2) {
                r1 = this;
                boolean r0 = r2 instanceof java.lang.reflect.GenericArrayType
                if (r0 == 0) goto L13
                java.lang.reflect.GenericArrayType r2 = (java.lang.reflect.GenericArrayType) r2
                java.lang.reflect.Type r0 = r1.getGenericComponentType()
                java.lang.reflect.Type r2 = r2.getGenericComponentType()
                boolean r2 = com.google.common.base.Objects.equal(r0, r2)
                return r2
            L13:
                r2 = 0
                return r2
        }

        @Override // java.lang.reflect.GenericArrayType
        public java.lang.reflect.Type getGenericComponentType() {
                r1 = this;
                java.lang.reflect.Type r0 = r1.componentType
                return r0
        }

        public int hashCode() {
                r1 = this;
                java.lang.reflect.Type r0 = r1.componentType
                int r0 = r0.hashCode()
                return r0
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.reflect.Type r0 = r2.componentType
                java.lang.String r0 = com.google.common.reflect.Types.toString(r0)
                java.lang.String r0 = java.lang.String.valueOf(r0)
                java.lang.String r1 = "[]"
                java.lang.String r0 = r0.concat(r1)
                return r0
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static abstract enum JavaVersion extends java.lang.Enum<com.google.common.reflect.Types.JavaVersion> {
        private static final /* synthetic */ com.google.common.reflect.Types.JavaVersion[] $VALUES = null;
        public static final com.google.common.reflect.Types.JavaVersion CURRENT = null;
        public static final com.google.common.reflect.Types.JavaVersion JAVA6 = null;
        public static final com.google.common.reflect.Types.JavaVersion JAVA7 = null;
        public static final com.google.common.reflect.Types.JavaVersion JAVA8 = null;
        public static final com.google.common.reflect.Types.JavaVersion JAVA9 = null;







        private static /* synthetic */ com.google.common.reflect.Types.JavaVersion[] $values() {
                r0 = 4
                com.google.common.reflect.Types$JavaVersion[] r0 = new com.google.common.reflect.Types.JavaVersion[r0]
                com.google.common.reflect.Types$JavaVersion r1 = com.google.common.reflect.Types.JavaVersion.JAVA6
                r2 = 0
                r0[r2] = r1
                com.google.common.reflect.Types$JavaVersion r1 = com.google.common.reflect.Types.JavaVersion.JAVA7
                r2 = 1
                r0[r2] = r1
                com.google.common.reflect.Types$JavaVersion r1 = com.google.common.reflect.Types.JavaVersion.JAVA8
                r2 = 2
                r0[r2] = r1
                com.google.common.reflect.Types$JavaVersion r1 = com.google.common.reflect.Types.JavaVersion.JAVA9
                r2 = 3
                r0[r2] = r1
                return r0
        }

        static {
                com.google.common.reflect.Types$JavaVersion$1 r0 = new com.google.common.reflect.Types$JavaVersion$1
                r0.<init>()
                com.google.common.reflect.Types.JavaVersion.JAVA6 = r0
                com.google.common.reflect.Types$JavaVersion$2 r1 = new com.google.common.reflect.Types$JavaVersion$2
                r1.<init>()
                com.google.common.reflect.Types.JavaVersion.JAVA7 = r1
                com.google.common.reflect.Types$JavaVersion$3 r2 = new com.google.common.reflect.Types$JavaVersion$3
                r2.<init>()
                com.google.common.reflect.Types.JavaVersion.JAVA8 = r2
                com.google.common.reflect.Types$JavaVersion$4 r3 = new com.google.common.reflect.Types$JavaVersion$4
                r3.<init>()
                com.google.common.reflect.Types.JavaVersion.JAVA9 = r3
                com.google.common.reflect.Types$JavaVersion[] r4 = $values()
                com.google.common.reflect.Types.JavaVersion.$VALUES = r4
                java.lang.Class<java.lang.reflect.AnnotatedElement> r4 = java.lang.reflect.AnnotatedElement.class
                java.lang.Class<java.lang.reflect.TypeVariable> r5 = java.lang.reflect.TypeVariable.class
                boolean r4 = r4.isAssignableFrom(r5)
                if (r4 == 0) goto L47
                com.google.common.reflect.Types$JavaVersion$5 r0 = new com.google.common.reflect.Types$JavaVersion$5
                r0.<init>()
                java.lang.reflect.Type r0 = r0.capture()
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = "java.util.Map.java.util.Map"
                boolean r0 = r0.contains(r1)
                if (r0 == 0) goto L44
                com.google.common.reflect.Types.JavaVersion.CURRENT = r2
                goto L59
            L44:
                com.google.common.reflect.Types.JavaVersion.CURRENT = r3
                goto L59
            L47:
                com.google.common.reflect.Types$JavaVersion$6 r2 = new com.google.common.reflect.Types$JavaVersion$6
                r2.<init>()
                java.lang.reflect.Type r2 = r2.capture()
                boolean r2 = r2 instanceof java.lang.Class
                if (r2 == 0) goto L57
                com.google.common.reflect.Types.JavaVersion.CURRENT = r1
                goto L59
            L57:
                com.google.common.reflect.Types.JavaVersion.CURRENT = r0
            L59:
                return
        }

        private JavaVersion(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public /* synthetic */ JavaVersion(java.lang.String r1, int r2, com.google.common.reflect.Types.AnonymousClass1 r3) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.google.common.reflect.Types.JavaVersion valueOf(java.lang.String r1) {
                java.lang.Class<com.google.common.reflect.Types$JavaVersion> r0 = com.google.common.reflect.Types.JavaVersion.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.google.common.reflect.Types$JavaVersion r1 = (com.google.common.reflect.Types.JavaVersion) r1
                return r1
        }

        public static com.google.common.reflect.Types.JavaVersion[] values() {
                com.google.common.reflect.Types$JavaVersion[] r0 = com.google.common.reflect.Types.JavaVersion.$VALUES
                java.lang.Object r0 = r0.clone()
                com.google.common.reflect.Types$JavaVersion[] r0 = (com.google.common.reflect.Types.JavaVersion[]) r0
                return r0
        }

        public abstract java.lang.reflect.Type newArrayType(java.lang.reflect.Type r1);

        public java.lang.String typeName(java.lang.reflect.Type r1) {
                r0 = this;
                java.lang.String r1 = com.google.common.reflect.Types.toString(r1)
                return r1
        }

        public final com.google.common.collect.ImmutableList<java.lang.reflect.Type> usedInGenericType(java.lang.reflect.Type[] r5) {
                r4 = this;
                com.google.common.collect.ImmutableList$Builder r0 = com.google.common.collect.ImmutableList.builder()
                int r1 = r5.length
                r2 = 0
            L6:
                if (r2 >= r1) goto L14
                r3 = r5[r2]
                java.lang.reflect.Type r3 = r4.usedInGenericType(r3)
                r0.add(r3)
                int r2 = r2 + 1
                goto L6
            L14:
                com.google.common.collect.ImmutableList r5 = r0.build()
                return r5
        }

        public abstract java.lang.reflect.Type usedInGenericType(java.lang.reflect.Type r1);
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static final class NativeTypeVariableEquals<X> {
        public static final boolean NATIVE_TYPE_VARIABLE_ONLY = false;

        static {
                java.lang.Class<com.google.common.reflect.Types$NativeTypeVariableEquals> r0 = com.google.common.reflect.Types.NativeTypeVariableEquals.class
                java.lang.reflect.TypeVariable[] r1 = r0.getTypeParameters()
                r2 = 0
                r1 = r1[r2]
                java.lang.reflect.Type[] r2 = new java.lang.reflect.Type[r2]
                java.lang.String r3 = "X"
                java.lang.reflect.TypeVariable r0 = com.google.common.reflect.Types.newArtificialTypeVariable(r0, r3, r2)
                boolean r0 = r1.equals(r0)
                r0 = r0 ^ 1
                com.google.common.reflect.Types.NativeTypeVariableEquals.NATIVE_TYPE_VARIABLE_ONLY = r0
                return
        }

        public NativeTypeVariableEquals() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    public static final class ParameterizedTypeImpl implements java.lang.reflect.ParameterizedType, java.io.Serializable {
        private static final long serialVersionUID = 0;
        private final com.google.common.collect.ImmutableList<java.lang.reflect.Type> argumentsList;

        @javax.annotation.CheckForNull
        private final java.lang.reflect.Type ownerType;
        private final java.lang.Class<?> rawType;

        public ParameterizedTypeImpl(@javax.annotation.CheckForNull java.lang.reflect.Type r3, java.lang.Class<?> r4, java.lang.reflect.Type[] r5) {
                r2 = this;
                r2.<init>()
                com.google.common.base.Preconditions.checkNotNull(r4)
                int r0 = r5.length
                java.lang.reflect.TypeVariable[] r1 = r4.getTypeParameters()
                int r1 = r1.length
                if (r0 != r1) goto L10
                r0 = 1
                goto L11
            L10:
                r0 = 0
            L11:
                com.google.common.base.Preconditions.checkArgument(r0)
                java.lang.String r0 = "type parameter"
                com.google.common.reflect.Types.access$200(r5, r0)
                r2.ownerType = r3
                r2.rawType = r4
                com.google.common.reflect.Types$JavaVersion r3 = com.google.common.reflect.Types.JavaVersion.CURRENT
                com.google.common.collect.ImmutableList r3 = r3.usedInGenericType(r5)
                r2.argumentsList = r3
                return
        }

        public boolean equals(@javax.annotation.CheckForNull java.lang.Object r4) {
                r3 = this;
                boolean r0 = r4 instanceof java.lang.reflect.ParameterizedType
                r1 = 0
                if (r0 != 0) goto L6
                return r1
            L6:
                java.lang.reflect.ParameterizedType r4 = (java.lang.reflect.ParameterizedType) r4
                java.lang.reflect.Type r0 = r3.getRawType()
                java.lang.reflect.Type r2 = r4.getRawType()
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L33
                java.lang.reflect.Type r0 = r3.getOwnerType()
                java.lang.reflect.Type r2 = r4.getOwnerType()
                boolean r0 = com.google.common.base.Objects.equal(r0, r2)
                if (r0 == 0) goto L33
                java.lang.reflect.Type[] r0 = r3.getActualTypeArguments()
                java.lang.reflect.Type[] r4 = r4.getActualTypeArguments()
                boolean r4 = java.util.Arrays.equals(r0, r4)
                if (r4 == 0) goto L33
                r1 = 1
            L33:
                return r1
        }

        @Override // java.lang.reflect.ParameterizedType
        public java.lang.reflect.Type[] getActualTypeArguments() {
                r1 = this;
                com.google.common.collect.ImmutableList<java.lang.reflect.Type> r0 = r1.argumentsList
                java.lang.reflect.Type[] r0 = com.google.common.reflect.Types.access$300(r0)
                return r0
        }

        @Override // java.lang.reflect.ParameterizedType
        @javax.annotation.CheckForNull
        public java.lang.reflect.Type getOwnerType() {
                r1 = this;
                java.lang.reflect.Type r0 = r1.ownerType
                return r0
        }

        @Override // java.lang.reflect.ParameterizedType
        public java.lang.reflect.Type getRawType() {
                r1 = this;
                java.lang.Class<?> r0 = r1.rawType
                return r0
        }

        public int hashCode() {
                r2 = this;
                java.lang.reflect.Type r0 = r2.ownerType
                if (r0 != 0) goto L6
                r0 = 0
                goto La
            L6:
                int r0 = r0.hashCode()
            La:
                com.google.common.collect.ImmutableList<java.lang.reflect.Type> r1 = r2.argumentsList
                int r1 = r1.hashCode()
                r0 = r0 ^ r1
                java.lang.Class<?> r1 = r2.rawType
                int r1 = r1.hashCode()
                r0 = r0 ^ r1
                return r0
        }

        public java.lang.String toString() {
                r4 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.reflect.Type r1 = r4.ownerType
                if (r1 == 0) goto L22
                com.google.common.reflect.Types$JavaVersion r1 = com.google.common.reflect.Types.JavaVersion.CURRENT
                java.util.Objects.requireNonNull(r1)
                boolean r2 = r1 instanceof com.google.common.reflect.Types.JavaVersion.AnonymousClass4
                r2 = r2 ^ 1
                if (r2 == 0) goto L22
                java.lang.reflect.Type r2 = r4.ownerType
                java.lang.String r1 = r1.typeName(r2)
                r0.append(r1)
                r1 = 46
                r0.append(r1)
            L22:
                java.lang.Class<?> r1 = r4.rawType
                java.lang.String r1 = r1.getName()
                r0.append(r1)
                r1 = 60
                r0.append(r1)
                com.google.common.base.Joiner r1 = com.google.common.reflect.Types.access$500()
                com.google.common.collect.ImmutableList<java.lang.reflect.Type> r2 = r4.argumentsList
                com.google.common.base.Function r3 = com.google.common.reflect.Types.access$400()
                java.lang.Iterable r2 = com.google.common.collect.Iterables.transform(r2, r3)
                java.lang.String r1 = r1.join(r2)
                r0.append(r1)
                r1 = 62
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    public static final class TypeVariableImpl<D extends java.lang.reflect.GenericDeclaration> {
        private final com.google.common.collect.ImmutableList<java.lang.reflect.Type> bounds;
        private final D genericDeclaration;
        private final java.lang.String name;

        public TypeVariableImpl(D r2, java.lang.String r3, java.lang.reflect.Type[] r4) {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = "bound for type variable"
                com.google.common.reflect.Types.access$200(r4, r0)
                java.lang.Object r2 = com.google.common.base.Preconditions.checkNotNull(r2)
                java.lang.reflect.GenericDeclaration r2 = (java.lang.reflect.GenericDeclaration) r2
                r1.genericDeclaration = r2
                java.lang.Object r2 = com.google.common.base.Preconditions.checkNotNull(r3)
                java.lang.String r2 = (java.lang.String) r2
                r1.name = r2
                com.google.common.collect.ImmutableList r2 = com.google.common.collect.ImmutableList.copyOf(r4)
                r1.bounds = r2
                return
        }

        public boolean equals(@javax.annotation.CheckForNull java.lang.Object r5) {
                r4 = this;
                boolean r0 = com.google.common.reflect.Types.NativeTypeVariableEquals.NATIVE_TYPE_VARIABLE_ONLY
                r1 = 1
                r2 = 0
                if (r0 == 0) goto L4a
                if (r5 == 0) goto L49
                java.lang.Class r0 = r5.getClass()
                boolean r0 = java.lang.reflect.Proxy.isProxyClass(r0)
                if (r0 == 0) goto L49
                java.lang.reflect.InvocationHandler r0 = java.lang.reflect.Proxy.getInvocationHandler(r5)
                boolean r0 = r0 instanceof com.google.common.reflect.Types.TypeVariableInvocationHandler
                if (r0 == 0) goto L49
                java.lang.reflect.InvocationHandler r5 = java.lang.reflect.Proxy.getInvocationHandler(r5)
                com.google.common.reflect.Types$TypeVariableInvocationHandler r5 = (com.google.common.reflect.Types.TypeVariableInvocationHandler) r5
                com.google.common.reflect.Types$TypeVariableImpl r5 = com.google.common.reflect.Types.TypeVariableInvocationHandler.access$600(r5)
                java.lang.String r0 = r4.name
                java.lang.String r3 = r5.getName()
                boolean r0 = r0.equals(r3)
                if (r0 == 0) goto L47
                D extends java.lang.reflect.GenericDeclaration r0 = r4.genericDeclaration
                java.lang.reflect.GenericDeclaration r3 = r5.getGenericDeclaration()
                boolean r0 = r0.equals(r3)
                if (r0 == 0) goto L47
                com.google.common.collect.ImmutableList<java.lang.reflect.Type> r0 = r4.bounds
                com.google.common.collect.ImmutableList<java.lang.reflect.Type> r5 = r5.bounds
                boolean r5 = r0.equals(r5)
                if (r5 == 0) goto L47
                goto L48
            L47:
                r1 = 0
            L48:
                return r1
            L49:
                return r2
            L4a:
                boolean r0 = r5 instanceof java.lang.reflect.TypeVariable
                if (r0 == 0) goto L6b
                java.lang.reflect.TypeVariable r5 = (java.lang.reflect.TypeVariable) r5
                java.lang.String r0 = r4.name
                java.lang.String r3 = r5.getName()
                boolean r0 = r0.equals(r3)
                if (r0 == 0) goto L69
                D extends java.lang.reflect.GenericDeclaration r0 = r4.genericDeclaration
                java.lang.reflect.GenericDeclaration r5 = r5.getGenericDeclaration()
                boolean r5 = r0.equals(r5)
                if (r5 == 0) goto L69
                goto L6a
            L69:
                r1 = 0
            L6a:
                return r1
            L6b:
                return r2
        }

        public java.lang.reflect.Type[] getBounds() {
                r1 = this;
                com.google.common.collect.ImmutableList<java.lang.reflect.Type> r0 = r1.bounds
                java.lang.reflect.Type[] r0 = com.google.common.reflect.Types.access$300(r0)
                return r0
        }

        public D getGenericDeclaration() {
                r1 = this;
                D extends java.lang.reflect.GenericDeclaration r0 = r1.genericDeclaration
                return r0
        }

        public java.lang.String getName() {
                r1 = this;
                java.lang.String r0 = r1.name
                return r0
        }

        public java.lang.String getTypeName() {
                r1 = this;
                java.lang.String r0 = r1.name
                return r0
        }

        public int hashCode() {
                r2 = this;
                D extends java.lang.reflect.GenericDeclaration r0 = r2.genericDeclaration
                int r0 = r0.hashCode()
                java.lang.String r1 = r2.name
                int r1 = r1.hashCode()
                r0 = r0 ^ r1
                return r0
        }

        public java.lang.String toString() {
                r1 = this;
                java.lang.String r0 = r1.name
                return r0
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static final class TypeVariableInvocationHandler implements java.lang.reflect.InvocationHandler {
        private static final com.google.common.collect.ImmutableMap<java.lang.String, java.lang.reflect.Method> typeVariableMethods = null;
        private final com.google.common.reflect.Types.TypeVariableImpl<?> typeVariableImpl;

        static {
                java.lang.Class<com.google.common.reflect.Types$TypeVariableImpl> r0 = com.google.common.reflect.Types.TypeVariableImpl.class
                com.google.common.collect.ImmutableMap$Builder r1 = com.google.common.collect.ImmutableMap.builder()
                java.lang.reflect.Method[] r2 = r0.getMethods()
                int r3 = r2.length
                r4 = 0
            Lc:
                if (r4 >= r3) goto L28
                r5 = r2[r4]
                java.lang.Class r6 = r5.getDeclaringClass()
                boolean r6 = r6.equals(r0)
                if (r6 == 0) goto L25
                r6 = 1
                r5.setAccessible(r6)     // Catch: java.security.AccessControlException -> L1e
            L1e:
                java.lang.String r6 = r5.getName()
                r1.put(r6, r5)
            L25:
                int r4 = r4 + 1
                goto Lc
            L28:
                com.google.common.collect.ImmutableMap r0 = r1.build()
                com.google.common.reflect.Types.TypeVariableInvocationHandler.typeVariableMethods = r0
                return
        }

        public TypeVariableInvocationHandler(com.google.common.reflect.Types.TypeVariableImpl<?> r1) {
                r0 = this;
                r0.<init>()
                r0.typeVariableImpl = r1
                return
        }

        public static /* synthetic */ com.google.common.reflect.Types.TypeVariableImpl access$600(com.google.common.reflect.Types.TypeVariableInvocationHandler r0) {
                com.google.common.reflect.Types$TypeVariableImpl<?> r0 = r0.typeVariableImpl
                return r0
        }

        @Override // java.lang.reflect.InvocationHandler
        @javax.annotation.CheckForNull
        public java.lang.Object invoke(java.lang.Object r1, java.lang.reflect.Method r2, @javax.annotation.CheckForNull java.lang.Object[] r3) throws java.lang.Throwable {
                r0 = this;
                java.lang.String r1 = r2.getName()
                com.google.common.collect.ImmutableMap<java.lang.String, java.lang.reflect.Method> r2 = com.google.common.reflect.Types.TypeVariableInvocationHandler.typeVariableMethods
                java.lang.Object r2 = r2.get(r1)
                java.lang.reflect.Method r2 = (java.lang.reflect.Method) r2
                if (r2 == 0) goto L1b
                com.google.common.reflect.Types$TypeVariableImpl<?> r1 = r0.typeVariableImpl     // Catch: java.lang.reflect.InvocationTargetException -> L15
                java.lang.Object r1 = r2.invoke(r1, r3)     // Catch: java.lang.reflect.InvocationTargetException -> L15
                return r1
            L15:
                r1 = move-exception
                java.lang.Throwable r1 = r1.getCause()
                throw r1
            L1b:
                java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
                r2.<init>(r1)
                throw r2
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static final class WildcardTypeImpl implements java.lang.reflect.WildcardType, java.io.Serializable {
        private static final long serialVersionUID = 0;
        private final com.google.common.collect.ImmutableList<java.lang.reflect.Type> lowerBounds;
        private final com.google.common.collect.ImmutableList<java.lang.reflect.Type> upperBounds;

        public WildcardTypeImpl(java.lang.reflect.Type[] r2, java.lang.reflect.Type[] r3) {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = "lower bound for wildcard"
                com.google.common.reflect.Types.access$200(r2, r0)
                java.lang.String r0 = "upper bound for wildcard"
                com.google.common.reflect.Types.access$200(r3, r0)
                com.google.common.reflect.Types$JavaVersion r0 = com.google.common.reflect.Types.JavaVersion.CURRENT
                com.google.common.collect.ImmutableList r2 = r0.usedInGenericType(r2)
                r1.lowerBounds = r2
                com.google.common.collect.ImmutableList r2 = r0.usedInGenericType(r3)
                r1.upperBounds = r2
                return
        }

        public boolean equals(@javax.annotation.CheckForNull java.lang.Object r4) {
                r3 = this;
                boolean r0 = r4 instanceof java.lang.reflect.WildcardType
                r1 = 0
                if (r0 == 0) goto L28
                java.lang.reflect.WildcardType r4 = (java.lang.reflect.WildcardType) r4
                com.google.common.collect.ImmutableList<java.lang.reflect.Type> r0 = r3.lowerBounds
                java.lang.reflect.Type[] r2 = r4.getLowerBounds()
                java.util.List r2 = java.util.Arrays.asList(r2)
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L28
                com.google.common.collect.ImmutableList<java.lang.reflect.Type> r0 = r3.upperBounds
                java.lang.reflect.Type[] r4 = r4.getUpperBounds()
                java.util.List r4 = java.util.Arrays.asList(r4)
                boolean r4 = r0.equals(r4)
                if (r4 == 0) goto L28
                r1 = 1
            L28:
                return r1
        }

        @Override // java.lang.reflect.WildcardType
        public java.lang.reflect.Type[] getLowerBounds() {
                r1 = this;
                com.google.common.collect.ImmutableList<java.lang.reflect.Type> r0 = r1.lowerBounds
                java.lang.reflect.Type[] r0 = com.google.common.reflect.Types.access$300(r0)
                return r0
        }

        @Override // java.lang.reflect.WildcardType
        public java.lang.reflect.Type[] getUpperBounds() {
                r1 = this;
                com.google.common.collect.ImmutableList<java.lang.reflect.Type> r0 = r1.upperBounds
                java.lang.reflect.Type[] r0 = com.google.common.reflect.Types.access$300(r0)
                return r0
        }

        public int hashCode() {
                r2 = this;
                com.google.common.collect.ImmutableList<java.lang.reflect.Type> r0 = r2.lowerBounds
                int r0 = r0.hashCode()
                com.google.common.collect.ImmutableList<java.lang.reflect.Type> r1 = r2.upperBounds
                int r1 = r1.hashCode()
                r0 = r0 ^ r1
                return r0
        }

        public java.lang.String toString() {
                r4 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "?"
                r0.<init>(r1)
                com.google.common.collect.ImmutableList<java.lang.reflect.Type> r1 = r4.lowerBounds
                com.google.common.collect.UnmodifiableIterator r1 = r1.iterator()
            Ld:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L28
                java.lang.Object r2 = r1.next()
                java.lang.reflect.Type r2 = (java.lang.reflect.Type) r2
                java.lang.String r3 = " super "
                r0.append(r3)
                com.google.common.reflect.Types$JavaVersion r3 = com.google.common.reflect.Types.JavaVersion.CURRENT
                java.lang.String r2 = r3.typeName(r2)
                r0.append(r2)
                goto Ld
            L28:
                com.google.common.collect.ImmutableList<java.lang.reflect.Type> r1 = r4.upperBounds
                java.lang.Iterable r1 = com.google.common.reflect.Types.access$700(r1)
                java.util.Iterator r1 = r1.iterator()
            L32:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L4d
                java.lang.Object r2 = r1.next()
                java.lang.reflect.Type r2 = (java.lang.reflect.Type) r2
                java.lang.String r3 = " extends "
                r0.append(r3)
                com.google.common.reflect.Types$JavaVersion r3 = com.google.common.reflect.Types.JavaVersion.CURRENT
                java.lang.String r2 = r3.typeName(r2)
                r0.append(r2)
                goto L32
            L4d:
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    static {
            com.google.common.reflect.Types$1 r0 = new com.google.common.reflect.Types$1
            r0.<init>()
            com.google.common.reflect.Types.TYPE_NAME = r0
            java.lang.String r0 = ", "
            com.google.common.base.Joiner r0 = com.google.common.base.Joiner.on(r0)
            java.lang.String r1 = "null"
            com.google.common.base.Joiner r0 = r0.useForNull(r1)
            com.google.common.reflect.Types.COMMA_JOINER = r0
            return
    }

    private Types() {
            r0 = this;
            r0.<init>()
            return
    }

    public static /* synthetic */ java.lang.reflect.Type access$100(java.lang.reflect.Type[] r0) {
            java.lang.reflect.Type r0 = subtypeOfComponentType(r0)
            return r0
    }

    public static /* synthetic */ void access$200(java.lang.reflect.Type[] r0, java.lang.String r1) {
            disallowPrimitiveType(r0, r1)
            return
    }

    public static /* synthetic */ java.lang.reflect.Type[] access$300(java.util.Collection r0) {
            java.lang.reflect.Type[] r0 = toArray(r0)
            return r0
    }

    public static /* synthetic */ com.google.common.base.Function access$400() {
            com.google.common.base.Function<java.lang.reflect.Type, java.lang.String> r0 = com.google.common.reflect.Types.TYPE_NAME
            return r0
    }

    public static /* synthetic */ com.google.common.base.Joiner access$500() {
            com.google.common.base.Joiner r0 = com.google.common.reflect.Types.COMMA_JOINER
            return r0
    }

    public static /* synthetic */ java.lang.Iterable access$700(java.lang.Iterable r0) {
            java.lang.Iterable r0 = filterUpperBounds(r0)
            return r0
    }

    private static void disallowPrimitiveType(java.lang.reflect.Type[] r5, java.lang.String r6) {
            int r0 = r5.length
            r1 = 0
        L2:
            if (r1 >= r0) goto L1a
            r2 = r5[r1]
            boolean r3 = r2 instanceof java.lang.Class
            if (r3 == 0) goto L17
            java.lang.Class r2 = (java.lang.Class) r2
            boolean r3 = r2.isPrimitive()
            r3 = r3 ^ 1
            java.lang.String r4 = "Primitive type '%s' used as %s"
            com.google.common.base.Preconditions.checkArgument(r3, r4, r2, r6)
        L17:
            int r1 = r1 + 1
            goto L2
        L1a:
            return
    }

    private static java.lang.Iterable<java.lang.reflect.Type> filterUpperBounds(java.lang.Iterable<java.lang.reflect.Type> r1) {
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            com.google.common.base.Predicate r0 = com.google.common.base.Predicates.equalTo(r0)
            com.google.common.base.Predicate r0 = com.google.common.base.Predicates.not(r0)
            java.lang.Iterable r1 = com.google.common.collect.Iterables.filter(r1, r0)
            return r1
    }

    @javax.annotation.CheckForNull
    public static java.lang.reflect.Type getComponentType(java.lang.reflect.Type r4) {
            com.google.common.base.Preconditions.checkNotNull(r4)
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r0.<init>()
            com.google.common.reflect.Types$2 r1 = new com.google.common.reflect.Types$2
            r1.<init>(r0)
            r2 = 1
            java.lang.reflect.Type[] r2 = new java.lang.reflect.Type[r2]
            r3 = 0
            r2[r3] = r4
            r1.visit(r2)
            java.lang.Object r4 = r0.get()
            java.lang.reflect.Type r4 = (java.lang.reflect.Type) r4
            return r4
    }

    public static java.lang.reflect.Type newArrayType(java.lang.reflect.Type r5) {
            boolean r0 = r5 instanceof java.lang.reflect.WildcardType
            if (r0 == 0) goto L51
            java.lang.reflect.WildcardType r5 = (java.lang.reflect.WildcardType) r5
            java.lang.reflect.Type[] r0 = r5.getLowerBounds()
            int r1 = r0.length
            r2 = 1
            r3 = 0
            if (r1 > r2) goto L11
            r1 = 1
            goto L12
        L11:
            r1 = 0
        L12:
            java.lang.String r4 = "Wildcard cannot have more than one lower bounds."
            com.google.common.base.Preconditions.checkArgument(r1, r4)
            int r1 = r0.length
            if (r1 != r2) goto L30
            r5 = r0[r3]
            java.lang.reflect.Type r5 = newArrayType(r5)
            com.google.common.reflect.Types$WildcardTypeImpl r0 = new com.google.common.reflect.Types$WildcardTypeImpl
            java.lang.reflect.Type[] r1 = new java.lang.reflect.Type[r2]
            r1[r3] = r5
            java.lang.reflect.Type[] r5 = new java.lang.reflect.Type[r2]
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            r5[r3] = r2
            r0.<init>(r1, r5)
            return r0
        L30:
            java.lang.reflect.Type[] r5 = r5.getUpperBounds()
            int r0 = r5.length
            if (r0 != r2) goto L39
            r0 = 1
            goto L3a
        L39:
            r0 = 0
        L3a:
            java.lang.String r1 = "Wildcard should have only one upper bound."
            com.google.common.base.Preconditions.checkArgument(r0, r1)
            r5 = r5[r3]
            java.lang.reflect.Type r5 = newArrayType(r5)
            com.google.common.reflect.Types$WildcardTypeImpl r0 = new com.google.common.reflect.Types$WildcardTypeImpl
            java.lang.reflect.Type[] r1 = new java.lang.reflect.Type[r3]
            java.lang.reflect.Type[] r2 = new java.lang.reflect.Type[r2]
            r2[r3] = r5
            r0.<init>(r1, r2)
            return r0
        L51:
            com.google.common.reflect.Types$JavaVersion r0 = com.google.common.reflect.Types.JavaVersion.CURRENT
            java.lang.reflect.Type r5 = r0.newArrayType(r5)
            return r5
    }

    public static <D extends java.lang.reflect.GenericDeclaration> java.lang.reflect.TypeVariable<D> newArtificialTypeVariable(D r2, java.lang.String r3, java.lang.reflect.Type... r4) {
            int r0 = r4.length
            if (r0 != 0) goto Lb
            r4 = 1
            java.lang.reflect.Type[] r4 = new java.lang.reflect.Type[r4]
            r0 = 0
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            r4[r0] = r1
        Lb:
            java.lang.reflect.TypeVariable r2 = newTypeVariableImpl(r2, r3, r4)
            return r2
    }

    public static java.lang.reflect.ParameterizedType newParameterizedTypeWithOwner(@javax.annotation.CheckForNull java.lang.reflect.Type r2, java.lang.Class<?> r3, java.lang.reflect.Type... r4) {
            if (r2 != 0) goto Le
            com.google.common.reflect.Types$ParameterizedTypeImpl r2 = new com.google.common.reflect.Types$ParameterizedTypeImpl
            com.google.common.reflect.Types$ClassOwnership r0 = com.google.common.reflect.Types.ClassOwnership.JVM_BEHAVIOR
            java.lang.Class r0 = r0.getOwnerType(r3)
            r2.<init>(r0, r3, r4)
            return r2
        Le:
            com.google.common.base.Preconditions.checkNotNull(r4)
            java.lang.Class r0 = r3.getEnclosingClass()
            if (r0 == 0) goto L19
            r0 = 1
            goto L1a
        L19:
            r0 = 0
        L1a:
            java.lang.String r1 = "Owner type for unenclosed %s"
            com.google.common.base.Preconditions.checkArgument(r0, r1, r3)
            com.google.common.reflect.Types$ParameterizedTypeImpl r0 = new com.google.common.reflect.Types$ParameterizedTypeImpl
            r0.<init>(r2, r3, r4)
            return r0
    }

    private static <D extends java.lang.reflect.GenericDeclaration> java.lang.reflect.TypeVariable<D> newTypeVariableImpl(D r1, java.lang.String r2, java.lang.reflect.Type[] r3) {
            com.google.common.reflect.Types$TypeVariableImpl r0 = new com.google.common.reflect.Types$TypeVariableImpl
            r0.<init>(r1, r2, r3)
            java.lang.Class<java.lang.reflect.TypeVariable> r1 = java.lang.reflect.TypeVariable.class
            com.google.common.reflect.Types$TypeVariableInvocationHandler r2 = new com.google.common.reflect.Types$TypeVariableInvocationHandler
            r2.<init>(r0)
            java.lang.Object r1 = com.google.common.reflect.Reflection.newProxy(r1, r2)
            java.lang.reflect.TypeVariable r1 = (java.lang.reflect.TypeVariable) r1
            return r1
    }

    @javax.annotation.CheckForNull
    private static java.lang.reflect.Type subtypeOfComponentType(java.lang.reflect.Type[] r4) {
            int r0 = r4.length
            r1 = 0
            r2 = 0
        L3:
            if (r2 >= r0) goto L2b
            r3 = r4[r2]
            java.lang.reflect.Type r3 = getComponentType(r3)
            if (r3 == 0) goto L28
            boolean r4 = r3 instanceof java.lang.Class
            if (r4 == 0) goto L1b
            r4 = r3
            java.lang.Class r4 = (java.lang.Class) r4
            boolean r0 = r4.isPrimitive()
            if (r0 == 0) goto L1b
            return r4
        L1b:
            com.google.common.reflect.Types$WildcardTypeImpl r4 = new com.google.common.reflect.Types$WildcardTypeImpl
            java.lang.reflect.Type[] r0 = new java.lang.reflect.Type[r1]
            r2 = 1
            java.lang.reflect.Type[] r2 = new java.lang.reflect.Type[r2]
            r2[r1] = r3
            r4.<init>(r0, r2)
            return r4
        L28:
            int r2 = r2 + 1
            goto L3
        L2b:
            r4 = 0
            return r4
    }

    private static java.lang.reflect.Type[] toArray(java.util.Collection<java.lang.reflect.Type> r1) {
            r0 = 0
            java.lang.reflect.Type[] r0 = new java.lang.reflect.Type[r0]
            java.lang.Object[] r1 = r1.toArray(r0)
            java.lang.reflect.Type[] r1 = (java.lang.reflect.Type[]) r1
            return r1
    }

    public static java.lang.String toString(java.lang.reflect.Type r1) {
            boolean r0 = r1 instanceof java.lang.Class
            if (r0 == 0) goto Lb
            java.lang.Class r1 = (java.lang.Class) r1
            java.lang.String r1 = r1.getName()
            goto Lf
        Lb:
            java.lang.String r1 = r1.toString()
        Lf:
            return r1
    }
}
