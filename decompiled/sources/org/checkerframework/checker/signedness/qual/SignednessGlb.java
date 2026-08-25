package org.checkerframework.checker.signedness.qual;

/* JADX INFO: loaded from: classes2.dex */
@java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE, java.lang.annotation.ElementType.TYPE_PARAMETER})
@org.checkerframework.framework.qual.QualifierForLiterals({org.checkerframework.framework.qual.LiteralKind.INT, org.checkerframework.framework.qual.LiteralKind.LONG, org.checkerframework.framework.qual.LiteralKind.CHAR})
@java.lang.annotation.Documented
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
@org.checkerframework.framework.qual.SubtypeOf({org.checkerframework.checker.signedness.qual.Unsigned.class, org.checkerframework.checker.signedness.qual.Signed.class})
public @interface SignednessGlb {
}
