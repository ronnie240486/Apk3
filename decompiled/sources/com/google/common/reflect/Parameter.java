package com.google.common.reflect;

/* JADX INFO: loaded from: classes2.dex */
@com.google.common.annotations.Beta
@com.google.common.reflect.ElementTypesAreNonnullByDefault
public final class Parameter implements java.lang.reflect.AnnotatedElement {
    private final com.google.common.collect.ImmutableList<java.lang.annotation.Annotation> annotations;
    private final com.google.common.reflect.Invokable<?, ?> declaration;
    private final int position;
    private final com.google.common.reflect.TypeToken<?> type;

    public Parameter(com.google.common.reflect.Invokable<?, ?> r1, int r2, com.google.common.reflect.TypeToken<?> r3, java.lang.annotation.Annotation[] r4) {
            r0 = this;
            r0.<init>()
            r0.declaration = r1
            r0.position = r2
            r0.type = r3
            com.google.common.collect.ImmutableList r1 = com.google.common.collect.ImmutableList.copyOf(r4)
            r0.annotations = r1
            return
    }

    public boolean equals(@javax.annotation.CheckForNull java.lang.Object r4) {
            r3 = this;
            boolean r0 = r4 instanceof com.google.common.reflect.Parameter
            r1 = 0
            if (r0 == 0) goto L18
            com.google.common.reflect.Parameter r4 = (com.google.common.reflect.Parameter) r4
            int r0 = r3.position
            int r2 = r4.position
            if (r0 != r2) goto L18
            com.google.common.reflect.Invokable<?, ?> r0 = r3.declaration
            com.google.common.reflect.Invokable<?, ?> r4 = r4.declaration
            boolean r4 = r0.equals(r4)
            if (r4 == 0) goto L18
            r1 = 1
        L18:
            return r1
    }

    @Override // java.lang.reflect.AnnotatedElement
    @javax.annotation.CheckForNull
    public <A extends java.lang.annotation.Annotation> A getAnnotation(java.lang.Class<A> r4) {
            r3 = this;
            com.google.common.base.Preconditions.checkNotNull(r4)
            com.google.common.collect.ImmutableList<java.lang.annotation.Annotation> r0 = r3.annotations
            com.google.common.collect.UnmodifiableIterator r0 = r0.iterator()
        L9:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L22
            java.lang.Object r1 = r0.next()
            java.lang.annotation.Annotation r1 = (java.lang.annotation.Annotation) r1
            boolean r2 = r4.isInstance(r1)
            if (r2 == 0) goto L9
            java.lang.Object r4 = r4.cast(r1)
            java.lang.annotation.Annotation r4 = (java.lang.annotation.Annotation) r4
            return r4
        L22:
            r4 = 0
            return r4
    }

    @Override // java.lang.reflect.AnnotatedElement
    public java.lang.annotation.Annotation[] getAnnotations() {
            r1 = this;
            java.lang.annotation.Annotation[] r0 = r1.getDeclaredAnnotations()
            return r0
    }

    @Override // java.lang.reflect.AnnotatedElement
    public <A extends java.lang.annotation.Annotation> A[] getAnnotationsByType(java.lang.Class<A> r1) {
            r0 = this;
            java.lang.annotation.Annotation[] r1 = r0.getDeclaredAnnotationsByType(r1)
            return r1
    }

    @Override // java.lang.reflect.AnnotatedElement
    @javax.annotation.CheckForNull
    public <A extends java.lang.annotation.Annotation> A getDeclaredAnnotation(java.lang.Class<A> r2) {
            r1 = this;
            com.google.common.base.Preconditions.checkNotNull(r2)
            com.google.common.collect.ImmutableList<java.lang.annotation.Annotation> r0 = r1.annotations
            com.google.common.collect.FluentIterable r0 = com.google.common.collect.FluentIterable.from(r0)
            com.google.common.collect.FluentIterable r2 = r0.filter(r2)
            com.google.common.base.Optional r2 = r2.first()
            java.lang.Object r2 = r2.orNull()
            java.lang.annotation.Annotation r2 = (java.lang.annotation.Annotation) r2
            return r2
    }

    @Override // java.lang.reflect.AnnotatedElement
    public java.lang.annotation.Annotation[] getDeclaredAnnotations() {
            r2 = this;
            com.google.common.collect.ImmutableList<java.lang.annotation.Annotation> r0 = r2.annotations
            r1 = 0
            java.lang.annotation.Annotation[] r1 = new java.lang.annotation.Annotation[r1]
            java.lang.Object[] r0 = r0.toArray(r1)
            java.lang.annotation.Annotation[] r0 = (java.lang.annotation.Annotation[]) r0
            return r0
    }

    @Override // java.lang.reflect.AnnotatedElement
    public <A extends java.lang.annotation.Annotation> A[] getDeclaredAnnotationsByType(java.lang.Class<A> r2) {
            r1 = this;
            com.google.common.collect.ImmutableList<java.lang.annotation.Annotation> r0 = r1.annotations
            com.google.common.collect.FluentIterable r0 = com.google.common.collect.FluentIterable.from(r0)
            com.google.common.collect.FluentIterable r0 = r0.filter(r2)
            java.lang.Object[] r2 = r0.toArray(r2)
            java.lang.annotation.Annotation[] r2 = (java.lang.annotation.Annotation[]) r2
            return r2
    }

    public com.google.common.reflect.Invokable<?, ?> getDeclaringInvokable() {
            r1 = this;
            com.google.common.reflect.Invokable<?, ?> r0 = r1.declaration
            return r0
    }

    public com.google.common.reflect.TypeToken<?> getType() {
            r1 = this;
            com.google.common.reflect.TypeToken<?> r0 = r1.type
            return r0
    }

    public int hashCode() {
            r1 = this;
            int r0 = r1.position
            return r0
    }

    @Override // java.lang.reflect.AnnotatedElement
    public boolean isAnnotationPresent(java.lang.Class<? extends java.lang.annotation.Annotation> r1) {
            r0 = this;
            java.lang.annotation.Annotation r1 = r0.getAnnotation(r1)
            if (r1 == 0) goto L8
            r1 = 1
            goto L9
        L8:
            r1 = 0
        L9:
            return r1
    }

    public java.lang.String toString() {
            r4 = this;
            com.google.common.reflect.TypeToken<?> r0 = r4.type
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r1 = r4.position
            int r2 = r0.length()
            int r2 = r2 + 15
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            r3.append(r0)
            java.lang.String r0 = " arg"
            r3.append(r0)
            r3.append(r1)
            java.lang.String r0 = r3.toString()
            return r0
    }
}
