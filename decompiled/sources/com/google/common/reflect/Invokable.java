package com.google.common.reflect;

/* JADX INFO: loaded from: classes2.dex */
@com.google.common.annotations.Beta
@com.google.common.reflect.ElementTypesAreNonnullByDefault
public abstract class Invokable<T, R> implements java.lang.reflect.AnnotatedElement, java.lang.reflect.Member {
    private final java.lang.reflect.AccessibleObject accessibleObject;
    private final java.lang.reflect.Member member;

    /* JADX INFO: loaded from: classes.dex */
    public static class ConstructorInvokable<T> extends com.google.common.reflect.Invokable<T, T> {
        public final java.lang.reflect.Constructor<?> constructor;

        public ConstructorInvokable(java.lang.reflect.Constructor<?> r1) {
                r0 = this;
                r0.<init>(r1)
                r0.constructor = r1
                return
        }

        private boolean mayNeedHiddenThis() {
                r3 = this;
                java.lang.reflect.Constructor<?> r0 = r3.constructor
                java.lang.Class r0 = r0.getDeclaringClass()
                java.lang.reflect.Constructor r1 = r0.getEnclosingConstructor()
                r2 = 1
                if (r1 == 0) goto Le
                return r2
            Le:
                java.lang.reflect.Method r1 = r0.getEnclosingMethod()
                if (r1 == 0) goto L1e
                int r0 = r1.getModifiers()
                boolean r0 = java.lang.reflect.Modifier.isStatic(r0)
                r0 = r0 ^ r2
                return r0
            L1e:
                java.lang.Class r1 = r0.getEnclosingClass()
                if (r1 == 0) goto L2f
                int r0 = r0.getModifiers()
                boolean r0 = java.lang.reflect.Modifier.isStatic(r0)
                if (r0 != 0) goto L2f
                goto L30
            L2f:
                r2 = 0
            L30:
                return r2
        }

        @Override // com.google.common.reflect.Invokable
        public java.lang.reflect.Type[] getGenericExceptionTypes() {
                r1 = this;
                java.lang.reflect.Constructor<?> r0 = r1.constructor
                java.lang.reflect.Type[] r0 = r0.getGenericExceptionTypes()
                return r0
        }

        @Override // com.google.common.reflect.Invokable
        public java.lang.reflect.Type[] getGenericParameterTypes() {
                r4 = this;
                java.lang.reflect.Constructor<?> r0 = r4.constructor
                java.lang.reflect.Type[] r0 = r0.getGenericParameterTypes()
                int r1 = r0.length
                if (r1 <= 0) goto L2e
                boolean r1 = r4.mayNeedHiddenThis()
                if (r1 == 0) goto L2e
                java.lang.reflect.Constructor<?> r1 = r4.constructor
                java.lang.Class[] r1 = r1.getParameterTypes()
                int r2 = r0.length
                int r3 = r1.length
                if (r2 != r3) goto L2e
                r2 = 0
                r1 = r1[r2]
                java.lang.Class r2 = r4.getDeclaringClass()
                java.lang.Class r2 = r2.getEnclosingClass()
                if (r1 != r2) goto L2e
                r1 = 1
                int r2 = r0.length
                java.lang.Object[] r0 = java.util.Arrays.copyOfRange(r0, r1, r2)
                java.lang.reflect.Type[] r0 = (java.lang.reflect.Type[]) r0
            L2e:
                return r0
        }

        @Override // com.google.common.reflect.Invokable
        public java.lang.reflect.Type getGenericReturnType() {
                r4 = this;
                java.lang.Class r0 = r4.getDeclaringClass()
                java.lang.reflect.TypeVariable[] r1 = r0.getTypeParameters()
                int r2 = r1.length
                if (r2 <= 0) goto L19
                int r2 = com.google.common.reflect.Types.$r8$clinit
                com.google.common.reflect.Types$ParameterizedTypeImpl r2 = new com.google.common.reflect.Types$ParameterizedTypeImpl
                com.google.common.reflect.Types$ClassOwnership r3 = com.google.common.reflect.Types.ClassOwnership.JVM_BEHAVIOR
                java.lang.Class r3 = r3.getOwnerType(r0)
                r2.<init>(r3, r0, r1)
                return r2
            L19:
                return r0
        }

        @Override // com.google.common.reflect.Invokable
        public final java.lang.annotation.Annotation[][] getParameterAnnotations() {
                r1 = this;
                java.lang.reflect.Constructor<?> r0 = r1.constructor
                java.lang.annotation.Annotation[][] r0 = r0.getParameterAnnotations()
                return r0
        }

        @Override // com.google.common.reflect.Invokable
        public final java.lang.reflect.TypeVariable<?>[] getTypeParameters() {
                r5 = this;
                java.lang.Class r0 = r5.getDeclaringClass()
                java.lang.reflect.TypeVariable[] r0 = r0.getTypeParameters()
                java.lang.reflect.Constructor<?> r1 = r5.constructor
                java.lang.reflect.TypeVariable[] r1 = r1.getTypeParameters()
                int r2 = r0.length
                int r3 = r1.length
                int r2 = r2 + r3
                java.lang.reflect.TypeVariable[] r2 = new java.lang.reflect.TypeVariable[r2]
                int r3 = r0.length
                r4 = 0
                java.lang.System.arraycopy(r0, r4, r2, r4, r3)
                int r0 = r0.length
                int r3 = r1.length
                java.lang.System.arraycopy(r1, r4, r2, r0, r3)
                return r2
        }

        @Override // com.google.common.reflect.Invokable
        public final java.lang.Object invokeInternal(@javax.annotation.CheckForNull java.lang.Object r4, java.lang.Object[] r5) throws java.lang.reflect.InvocationTargetException, java.lang.IllegalAccessException {
                r3 = this;
                java.lang.reflect.Constructor<?> r4 = r3.constructor     // Catch: java.lang.InstantiationException -> L7
                java.lang.Object r4 = r4.newInstance(r5)     // Catch: java.lang.InstantiationException -> L7
                return r4
            L7:
                r4 = move-exception
                java.lang.RuntimeException r5 = new java.lang.RuntimeException
                java.lang.reflect.Constructor<?> r0 = r3.constructor
                java.lang.String r0 = java.lang.String.valueOf(r0)
                int r1 = r0.length()
                int r1 = r1 + 8
                java.lang.String r2 = " failed."
                java.lang.String r0 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r1, r0, r2)
                r5.<init>(r0, r4)
                throw r5
        }

        @Override // com.google.common.reflect.Invokable
        public final boolean isOverridable() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // com.google.common.reflect.Invokable
        public final boolean isVarArgs() {
                r1 = this;
                java.lang.reflect.Constructor<?> r0 = r1.constructor
                boolean r0 = r0.isVarArgs()
                return r0
        }
    }

    public static class MethodInvokable<T> extends com.google.common.reflect.Invokable<T, java.lang.Object> {
        public final java.lang.reflect.Method method;

        public MethodInvokable(java.lang.reflect.Method r1) {
                r0 = this;
                r0.<init>(r1)
                r0.method = r1
                return
        }

        @Override // com.google.common.reflect.Invokable
        public java.lang.reflect.Type[] getGenericExceptionTypes() {
                r1 = this;
                java.lang.reflect.Method r0 = r1.method
                java.lang.reflect.Type[] r0 = r0.getGenericExceptionTypes()
                return r0
        }

        @Override // com.google.common.reflect.Invokable
        public java.lang.reflect.Type[] getGenericParameterTypes() {
                r1 = this;
                java.lang.reflect.Method r0 = r1.method
                java.lang.reflect.Type[] r0 = r0.getGenericParameterTypes()
                return r0
        }

        @Override // com.google.common.reflect.Invokable
        public java.lang.reflect.Type getGenericReturnType() {
                r1 = this;
                java.lang.reflect.Method r0 = r1.method
                java.lang.reflect.Type r0 = r0.getGenericReturnType()
                return r0
        }

        @Override // com.google.common.reflect.Invokable
        public final java.lang.annotation.Annotation[][] getParameterAnnotations() {
                r1 = this;
                java.lang.reflect.Method r0 = r1.method
                java.lang.annotation.Annotation[][] r0 = r0.getParameterAnnotations()
                return r0
        }

        @Override // com.google.common.reflect.Invokable
        public final java.lang.reflect.TypeVariable<?>[] getTypeParameters() {
                r1 = this;
                java.lang.reflect.Method r0 = r1.method
                java.lang.reflect.TypeVariable[] r0 = r0.getTypeParameters()
                return r0
        }

        @Override // com.google.common.reflect.Invokable
        @javax.annotation.CheckForNull
        public final java.lang.Object invokeInternal(@javax.annotation.CheckForNull java.lang.Object r2, java.lang.Object[] r3) throws java.lang.reflect.InvocationTargetException, java.lang.IllegalAccessException {
                r1 = this;
                java.lang.reflect.Method r0 = r1.method
                java.lang.Object r2 = r0.invoke(r2, r3)
                return r2
        }

        @Override // com.google.common.reflect.Invokable
        public final boolean isOverridable() {
                r1 = this;
                boolean r0 = r1.isFinal()
                if (r0 != 0) goto L22
                boolean r0 = r1.isPrivate()
                if (r0 != 0) goto L22
                boolean r0 = r1.isStatic()
                if (r0 != 0) goto L22
                java.lang.Class r0 = r1.getDeclaringClass()
                int r0 = r0.getModifiers()
                boolean r0 = java.lang.reflect.Modifier.isFinal(r0)
                if (r0 != 0) goto L22
                r0 = 1
                goto L23
            L22:
                r0 = 0
            L23:
                return r0
        }

        @Override // com.google.common.reflect.Invokable
        public final boolean isVarArgs() {
                r1 = this;
                java.lang.reflect.Method r0 = r1.method
                boolean r0 = r0.isVarArgs()
                return r0
        }
    }

    public <M extends java.lang.reflect.AccessibleObject & java.lang.reflect.Member> Invokable(M r1) {
            r0 = this;
            r0.<init>()
            com.google.common.base.Preconditions.checkNotNull(r1)
            r0.accessibleObject = r1
            java.lang.reflect.Member r1 = (java.lang.reflect.Member) r1
            r0.member = r1
            return
    }

    public static <T> com.google.common.reflect.Invokable<T, T> from(java.lang.reflect.Constructor<T> r1) {
            com.google.common.reflect.Invokable$ConstructorInvokable r0 = new com.google.common.reflect.Invokable$ConstructorInvokable
            r0.<init>(r1)
            return r0
    }

    public static com.google.common.reflect.Invokable<?, java.lang.Object> from(java.lang.reflect.Method r1) {
            com.google.common.reflect.Invokable$MethodInvokable r0 = new com.google.common.reflect.Invokable$MethodInvokable
            r0.<init>(r1)
            return r0
    }

    public boolean equals(@javax.annotation.CheckForNull java.lang.Object r4) {
            r3 = this;
            boolean r0 = r4 instanceof com.google.common.reflect.Invokable
            r1 = 0
            if (r0 == 0) goto L20
            com.google.common.reflect.Invokable r4 = (com.google.common.reflect.Invokable) r4
            com.google.common.reflect.TypeToken r0 = r3.getOwnerType()
            com.google.common.reflect.TypeToken r2 = r4.getOwnerType()
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L20
            java.lang.reflect.Member r0 = r3.member
            java.lang.reflect.Member r4 = r4.member
            boolean r4 = r0.equals(r4)
            if (r4 == 0) goto L20
            r1 = 1
        L20:
            return r1
    }

    @Override // java.lang.reflect.AnnotatedElement
    @javax.annotation.CheckForNull
    public final <A extends java.lang.annotation.Annotation> A getAnnotation(java.lang.Class<A> r2) {
            r1 = this;
            java.lang.reflect.AccessibleObject r0 = r1.accessibleObject
            java.lang.annotation.Annotation r2 = r0.getAnnotation(r2)
            return r2
    }

    @Override // java.lang.reflect.AnnotatedElement
    public final java.lang.annotation.Annotation[] getAnnotations() {
            r1 = this;
            java.lang.reflect.AccessibleObject r0 = r1.accessibleObject
            java.lang.annotation.Annotation[] r0 = r0.getAnnotations()
            return r0
    }

    @Override // java.lang.reflect.AnnotatedElement
    public final java.lang.annotation.Annotation[] getDeclaredAnnotations() {
            r1 = this;
            java.lang.reflect.AccessibleObject r0 = r1.accessibleObject
            java.lang.annotation.Annotation[] r0 = r0.getDeclaredAnnotations()
            return r0
    }

    @Override // java.lang.reflect.Member
    public final java.lang.Class<? super T> getDeclaringClass() {
            r1 = this;
            java.lang.reflect.Member r0 = r1.member
            java.lang.Class r0 = r0.getDeclaringClass()
            return r0
    }

    public final com.google.common.collect.ImmutableList<com.google.common.reflect.TypeToken<? extends java.lang.Throwable>> getExceptionTypes() {
            r5 = this;
            com.google.common.collect.ImmutableList$Builder r0 = com.google.common.collect.ImmutableList.builder()
            java.lang.reflect.Type[] r1 = r5.getGenericExceptionTypes()
            int r2 = r1.length
            r3 = 0
        La:
            if (r3 >= r2) goto L18
            r4 = r1[r3]
            com.google.common.reflect.TypeToken r4 = com.google.common.reflect.TypeToken.of(r4)
            r0.add(r4)
            int r3 = r3 + 1
            goto La
        L18:
            com.google.common.collect.ImmutableList r0 = r0.build()
            return r0
    }

    public abstract java.lang.reflect.Type[] getGenericExceptionTypes();

    public abstract java.lang.reflect.Type[] getGenericParameterTypes();

    public abstract java.lang.reflect.Type getGenericReturnType();

    @Override // java.lang.reflect.Member
    public final int getModifiers() {
            r1 = this;
            java.lang.reflect.Member r0 = r1.member
            int r0 = r0.getModifiers()
            return r0
    }

    @Override // java.lang.reflect.Member
    public final java.lang.String getName() {
            r1 = this;
            java.lang.reflect.Member r0 = r1.member
            java.lang.String r0 = r0.getName()
            return r0
    }

    public com.google.common.reflect.TypeToken<T> getOwnerType() {
            r1 = this;
            java.lang.Class r0 = r1.getDeclaringClass()
            com.google.common.reflect.TypeToken r0 = com.google.common.reflect.TypeToken.of(r0)
            return r0
    }

    public abstract java.lang.annotation.Annotation[][] getParameterAnnotations();

    public final com.google.common.collect.ImmutableList<com.google.common.reflect.Parameter> getParameters() {
            r7 = this;
            java.lang.reflect.Type[] r0 = r7.getGenericParameterTypes()
            java.lang.annotation.Annotation[][] r1 = r7.getParameterAnnotations()
            com.google.common.collect.ImmutableList$Builder r2 = com.google.common.collect.ImmutableList.builder()
            r3 = 0
        Ld:
            int r4 = r0.length
            if (r3 >= r4) goto L23
            com.google.common.reflect.Parameter r4 = new com.google.common.reflect.Parameter
            r5 = r0[r3]
            com.google.common.reflect.TypeToken r5 = com.google.common.reflect.TypeToken.of(r5)
            r6 = r1[r3]
            r4.<init>(r7, r3, r5, r6)
            r2.add(r4)
            int r3 = r3 + 1
            goto Ld
        L23:
            com.google.common.collect.ImmutableList r0 = r2.build()
            return r0
    }

    public final com.google.common.reflect.TypeToken<? extends R> getReturnType() {
            r1 = this;
            java.lang.reflect.Type r0 = r1.getGenericReturnType()
            com.google.common.reflect.TypeToken r0 = com.google.common.reflect.TypeToken.of(r0)
            return r0
    }

    public abstract java.lang.reflect.TypeVariable<?>[] getTypeParameters();

    public int hashCode() {
            r1 = this;
            java.lang.reflect.Member r0 = r1.member
            int r0 = r0.hashCode()
            return r0
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    @javax.annotation.CheckForNull
    public final R invoke(@javax.annotation.CheckForNull T r1, java.lang.Object... r2) throws java.lang.reflect.InvocationTargetException, java.lang.IllegalAccessException {
            r0 = this;
            java.lang.Object r2 = com.google.common.base.Preconditions.checkNotNull(r2)
            java.lang.Object[] r2 = (java.lang.Object[]) r2
            java.lang.Object r1 = r0.invokeInternal(r1, r2)
            return r1
    }

    @javax.annotation.CheckForNull
    public abstract java.lang.Object invokeInternal(@javax.annotation.CheckForNull java.lang.Object r1, java.lang.Object[] r2) throws java.lang.reflect.InvocationTargetException, java.lang.IllegalAccessException;

    public final boolean isAbstract() {
            r1 = this;
            int r0 = r1.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isAbstract(r0)
            return r0
    }

    public final boolean isAccessible() {
            r1 = this;
            java.lang.reflect.AccessibleObject r0 = r1.accessibleObject
            boolean r0 = r0.isAccessible()
            return r0
    }

    @Override // java.lang.reflect.AnnotatedElement
    public final boolean isAnnotationPresent(java.lang.Class<? extends java.lang.annotation.Annotation> r2) {
            r1 = this;
            java.lang.reflect.AccessibleObject r0 = r1.accessibleObject
            boolean r2 = r0.isAnnotationPresent(r2)
            return r2
    }

    public final boolean isFinal() {
            r1 = this;
            int r0 = r1.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isFinal(r0)
            return r0
    }

    public final boolean isNative() {
            r1 = this;
            int r0 = r1.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isNative(r0)
            return r0
    }

    public abstract boolean isOverridable();

    public final boolean isPackagePrivate() {
            r1 = this;
            boolean r0 = r1.isPrivate()
            if (r0 != 0) goto L14
            boolean r0 = r1.isPublic()
            if (r0 != 0) goto L14
            boolean r0 = r1.isProtected()
            if (r0 != 0) goto L14
            r0 = 1
            goto L15
        L14:
            r0 = 0
        L15:
            return r0
    }

    public final boolean isPrivate() {
            r1 = this;
            int r0 = r1.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isPrivate(r0)
            return r0
    }

    public final boolean isProtected() {
            r1 = this;
            int r0 = r1.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isProtected(r0)
            return r0
    }

    public final boolean isPublic() {
            r1 = this;
            int r0 = r1.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isPublic(r0)
            return r0
    }

    public final boolean isStatic() {
            r1 = this;
            int r0 = r1.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isStatic(r0)
            return r0
    }

    public final boolean isSynchronized() {
            r1 = this;
            int r0 = r1.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isSynchronized(r0)
            return r0
    }

    @Override // java.lang.reflect.Member
    public final boolean isSynthetic() {
            r1 = this;
            java.lang.reflect.Member r0 = r1.member
            boolean r0 = r0.isSynthetic()
            return r0
    }

    public abstract boolean isVarArgs();

    public final <R1 extends R> com.google.common.reflect.Invokable<T, R1> returning(com.google.common.reflect.TypeToken<R1> r6) {
            r5 = this;
            com.google.common.reflect.TypeToken r0 = r5.getReturnType()
            boolean r0 = r6.isSupertypeOf(r0)
            if (r0 == 0) goto Lb
            return r5
        Lb:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            com.google.common.reflect.TypeToken r1 = r5.getReturnType()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r6 = java.lang.String.valueOf(r6)
            int r2 = r1.length()
            int r2 = r2 + 35
            int r3 = r6.length()
            int r3 = r3 + r2
            java.lang.String r2 = "Invokable is known to return "
            java.lang.String r4 = ", not "
            java.lang.String r6 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r3, r2, r1, r4, r6)
            r0.<init>(r6)
            throw r0
    }

    public final <R1 extends R> com.google.common.reflect.Invokable<T, R1> returning(java.lang.Class<R1> r1) {
            r0 = this;
            com.google.common.reflect.TypeToken r1 = com.google.common.reflect.TypeToken.of(r1)
            com.google.common.reflect.Invokable r1 = r0.returning(r1)
            return r1
    }

    public final void setAccessible(boolean r2) {
            r1 = this;
            java.lang.reflect.AccessibleObject r0 = r1.accessibleObject
            r0.setAccessible(r2)
            return
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.reflect.Member r0 = r1.member
            java.lang.String r0 = r0.toString()
            return r0
    }

    public final boolean trySetAccessible() {
            r2 = this;
            java.lang.reflect.AccessibleObject r0 = r2.accessibleObject     // Catch: java.lang.RuntimeException -> L7
            r1 = 1
            r0.setAccessible(r1)     // Catch: java.lang.RuntimeException -> L7
            return r1
        L7:
            r0 = 0
            return r0
    }
}
