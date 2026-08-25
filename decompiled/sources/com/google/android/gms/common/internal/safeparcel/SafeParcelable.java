package com.google.android.gms.common.internal.safeparcel;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public interface SafeParcelable extends android.os.Parcelable {

    @androidx.annotation.NonNull
    public static final java.lang.String NULL = "SAFE_PARCELABLE_NULL_STRING";

    /* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
    /* JADX INFO: loaded from: classes.dex */
    public @interface Class {
        @androidx.annotation.NonNull
        java.lang.String creator();

        boolean doNotParcelTypeDefaultValues() default false;

        boolean validate() default false;
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
    /* JADX INFO: loaded from: classes.dex */
    public @interface Constructor {
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
    public @interface Field {
        @androidx.annotation.NonNull
        java.lang.String defaultValue() default "SAFE_PARCELABLE_NULL_STRING";

        @androidx.annotation.NonNull
        java.lang.String defaultValueUnchecked() default "SAFE_PARCELABLE_NULL_STRING";

        @androidx.annotation.NonNull
        java.lang.String getter() default "SAFE_PARCELABLE_NULL_STRING";

        int id();

        @androidx.annotation.NonNull
        java.lang.String type() default "SAFE_PARCELABLE_NULL_STRING";
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
    /* JADX INFO: loaded from: classes2.dex */
    public @interface Indicator {
        @androidx.annotation.NonNull
        java.lang.String getter() default "SAFE_PARCELABLE_NULL_STRING";
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
    /* JADX INFO: loaded from: classes2.dex */
    public @interface Param {
        int id();
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
    /* JADX INFO: loaded from: classes.dex */
    public @interface Reserved {
        @androidx.annotation.NonNull
        int[] value();
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
    /* JADX INFO: loaded from: classes2.dex */
    public @interface VersionField {
        @androidx.annotation.NonNull
        java.lang.String getter() default "SAFE_PARCELABLE_NULL_STRING";

        int id();

        @androidx.annotation.NonNull
        java.lang.String type() default "SAFE_PARCELABLE_NULL_STRING";
    }
}
