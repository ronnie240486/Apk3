package com.google.android.material.badge;

/* JADX INFO: loaded from: classes3.dex */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
public final class BadgeState {
    private static final java.lang.String BADGE_RESOURCE_TAG = "badge";
    private static final int DEFAULT_MAX_BADGE_CHARACTER_COUNT = 4;
    public final float badgeRadius;
    public final float badgeWidePadding;
    public final float badgeWithTextRadius;
    private final com.google.android.material.badge.BadgeState.State currentState;
    private final com.google.android.material.badge.BadgeState.State overridingState;

    /* JADX INFO: loaded from: classes2.dex */
    public static final class State implements android.os.Parcelable {
        private static final int BADGE_NUMBER_NONE = -1;
        public static final android.os.Parcelable.Creator<com.google.android.material.badge.BadgeState.State> CREATOR = null;
        private static final int NOT_SET = -2;

        @androidx.annotation.Dimension(unit = 1)
        private java.lang.Integer additionalHorizontalOffset;

        @androidx.annotation.Dimension(unit = 1)
        private java.lang.Integer additionalVerticalOffset;
        private int alpha;

        @androidx.annotation.ColorInt
        private java.lang.Integer backgroundColor;
        private java.lang.Integer badgeGravity;

        @androidx.annotation.XmlRes
        private int badgeResId;

        @androidx.annotation.ColorInt
        private java.lang.Integer badgeTextColor;

        @androidx.annotation.StringRes
        private int contentDescriptionExceedsMaxBadgeNumberRes;

        @androidx.annotation.Nullable
        private java.lang.CharSequence contentDescriptionNumberless;

        @androidx.annotation.PluralsRes
        private int contentDescriptionQuantityStrings;

        @androidx.annotation.Dimension(unit = 1)
        private java.lang.Integer horizontalOffsetWithText;

        @androidx.annotation.Dimension(unit = 1)
        private java.lang.Integer horizontalOffsetWithoutText;
        private java.lang.Boolean isVisible;
        private int maxCharacterCount;
        private int number;
        private java.util.Locale numberLocale;

        @androidx.annotation.Dimension(unit = 1)
        private java.lang.Integer verticalOffsetWithText;

        @androidx.annotation.Dimension(unit = 1)
        private java.lang.Integer verticalOffsetWithoutText;


        static {
                com.google.android.material.badge.BadgeState$State$1 r0 = new com.google.android.material.badge.BadgeState$State$1
                r0.<init>()
                com.google.android.material.badge.BadgeState.State.CREATOR = r0
                return
        }

        public State() {
                r1 = this;
                r1.<init>()
                r0 = 255(0xff, float:3.57E-43)
                r1.alpha = r0
                r0 = -2
                r1.number = r0
                r1.maxCharacterCount = r0
                java.lang.Boolean r0 = java.lang.Boolean.TRUE
                r1.isVisible = r0
                return
        }

        public State(@androidx.annotation.NonNull android.os.Parcel r2) {
                r1 = this;
                r1.<init>()
                r0 = 255(0xff, float:3.57E-43)
                r1.alpha = r0
                r0 = -2
                r1.number = r0
                r1.maxCharacterCount = r0
                java.lang.Boolean r0 = java.lang.Boolean.TRUE
                r1.isVisible = r0
                int r0 = r2.readInt()
                r1.badgeResId = r0
                java.io.Serializable r0 = r2.readSerializable()
                java.lang.Integer r0 = (java.lang.Integer) r0
                r1.backgroundColor = r0
                java.io.Serializable r0 = r2.readSerializable()
                java.lang.Integer r0 = (java.lang.Integer) r0
                r1.badgeTextColor = r0
                int r0 = r2.readInt()
                r1.alpha = r0
                int r0 = r2.readInt()
                r1.number = r0
                int r0 = r2.readInt()
                r1.maxCharacterCount = r0
                java.lang.String r0 = r2.readString()
                r1.contentDescriptionNumberless = r0
                int r0 = r2.readInt()
                r1.contentDescriptionQuantityStrings = r0
                java.io.Serializable r0 = r2.readSerializable()
                java.lang.Integer r0 = (java.lang.Integer) r0
                r1.badgeGravity = r0
                java.io.Serializable r0 = r2.readSerializable()
                java.lang.Integer r0 = (java.lang.Integer) r0
                r1.horizontalOffsetWithoutText = r0
                java.io.Serializable r0 = r2.readSerializable()
                java.lang.Integer r0 = (java.lang.Integer) r0
                r1.verticalOffsetWithoutText = r0
                java.io.Serializable r0 = r2.readSerializable()
                java.lang.Integer r0 = (java.lang.Integer) r0
                r1.horizontalOffsetWithText = r0
                java.io.Serializable r0 = r2.readSerializable()
                java.lang.Integer r0 = (java.lang.Integer) r0
                r1.verticalOffsetWithText = r0
                java.io.Serializable r0 = r2.readSerializable()
                java.lang.Integer r0 = (java.lang.Integer) r0
                r1.additionalHorizontalOffset = r0
                java.io.Serializable r0 = r2.readSerializable()
                java.lang.Integer r0 = (java.lang.Integer) r0
                r1.additionalVerticalOffset = r0
                java.io.Serializable r0 = r2.readSerializable()
                java.lang.Boolean r0 = (java.lang.Boolean) r0
                r1.isVisible = r0
                java.io.Serializable r2 = r2.readSerializable()
                java.util.Locale r2 = (java.util.Locale) r2
                r1.numberLocale = r2
                return
        }

        public static /* synthetic */ int access$000(com.google.android.material.badge.BadgeState.State r0) {
                int r0 = r0.badgeResId
                return r0
        }

        public static /* synthetic */ int access$002(com.google.android.material.badge.BadgeState.State r0, int r1) {
                r0.badgeResId = r1
                return r1
        }

        public static /* synthetic */ int access$100(com.google.android.material.badge.BadgeState.State r0) {
                int r0 = r0.alpha
                return r0
        }

        public static /* synthetic */ java.lang.Integer access$1000(com.google.android.material.badge.BadgeState.State r0) {
                java.lang.Integer r0 = r0.badgeGravity
                return r0
        }

        public static /* synthetic */ java.lang.Integer access$1002(com.google.android.material.badge.BadgeState.State r0, java.lang.Integer r1) {
                r0.badgeGravity = r1
                return r1
        }

        public static /* synthetic */ int access$102(com.google.android.material.badge.BadgeState.State r0, int r1) {
                r0.alpha = r1
                return r1
        }

        public static /* synthetic */ java.lang.Integer access$1100(com.google.android.material.badge.BadgeState.State r0) {
                java.lang.Integer r0 = r0.horizontalOffsetWithoutText
                return r0
        }

        public static /* synthetic */ java.lang.Integer access$1102(com.google.android.material.badge.BadgeState.State r0, java.lang.Integer r1) {
                r0.horizontalOffsetWithoutText = r1
                return r1
        }

        public static /* synthetic */ java.lang.Integer access$1200(com.google.android.material.badge.BadgeState.State r0) {
                java.lang.Integer r0 = r0.verticalOffsetWithoutText
                return r0
        }

        public static /* synthetic */ java.lang.Integer access$1202(com.google.android.material.badge.BadgeState.State r0, java.lang.Integer r1) {
                r0.verticalOffsetWithoutText = r1
                return r1
        }

        public static /* synthetic */ java.lang.Integer access$1300(com.google.android.material.badge.BadgeState.State r0) {
                java.lang.Integer r0 = r0.horizontalOffsetWithText
                return r0
        }

        public static /* synthetic */ java.lang.Integer access$1302(com.google.android.material.badge.BadgeState.State r0, java.lang.Integer r1) {
                r0.horizontalOffsetWithText = r1
                return r1
        }

        public static /* synthetic */ java.lang.Integer access$1400(com.google.android.material.badge.BadgeState.State r0) {
                java.lang.Integer r0 = r0.verticalOffsetWithText
                return r0
        }

        public static /* synthetic */ java.lang.Integer access$1402(com.google.android.material.badge.BadgeState.State r0, java.lang.Integer r1) {
                r0.verticalOffsetWithText = r1
                return r1
        }

        public static /* synthetic */ java.lang.Integer access$1500(com.google.android.material.badge.BadgeState.State r0) {
                java.lang.Integer r0 = r0.additionalHorizontalOffset
                return r0
        }

        public static /* synthetic */ java.lang.Integer access$1502(com.google.android.material.badge.BadgeState.State r0, java.lang.Integer r1) {
                r0.additionalHorizontalOffset = r1
                return r1
        }

        public static /* synthetic */ java.lang.Integer access$1600(com.google.android.material.badge.BadgeState.State r0) {
                java.lang.Integer r0 = r0.additionalVerticalOffset
                return r0
        }

        public static /* synthetic */ java.lang.Integer access$1602(com.google.android.material.badge.BadgeState.State r0, java.lang.Integer r1) {
                r0.additionalVerticalOffset = r1
                return r1
        }

        public static /* synthetic */ java.util.Locale access$1700(com.google.android.material.badge.BadgeState.State r0) {
                java.util.Locale r0 = r0.numberLocale
                return r0
        }

        public static /* synthetic */ java.util.Locale access$1702(com.google.android.material.badge.BadgeState.State r0, java.util.Locale r1) {
                r0.numberLocale = r1
                return r1
        }

        public static /* synthetic */ java.lang.CharSequence access$200(com.google.android.material.badge.BadgeState.State r0) {
                java.lang.CharSequence r0 = r0.contentDescriptionNumberless
                return r0
        }

        public static /* synthetic */ java.lang.CharSequence access$202(com.google.android.material.badge.BadgeState.State r0, java.lang.CharSequence r1) {
                r0.contentDescriptionNumberless = r1
                return r1
        }

        public static /* synthetic */ int access$300(com.google.android.material.badge.BadgeState.State r0) {
                int r0 = r0.contentDescriptionQuantityStrings
                return r0
        }

        public static /* synthetic */ int access$302(com.google.android.material.badge.BadgeState.State r0, int r1) {
                r0.contentDescriptionQuantityStrings = r1
                return r1
        }

        public static /* synthetic */ int access$400(com.google.android.material.badge.BadgeState.State r0) {
                int r0 = r0.contentDescriptionExceedsMaxBadgeNumberRes
                return r0
        }

        public static /* synthetic */ int access$402(com.google.android.material.badge.BadgeState.State r0, int r1) {
                r0.contentDescriptionExceedsMaxBadgeNumberRes = r1
                return r1
        }

        public static /* synthetic */ java.lang.Boolean access$500(com.google.android.material.badge.BadgeState.State r0) {
                java.lang.Boolean r0 = r0.isVisible
                return r0
        }

        public static /* synthetic */ java.lang.Boolean access$502(com.google.android.material.badge.BadgeState.State r0, java.lang.Boolean r1) {
                r0.isVisible = r1
                return r1
        }

        public static /* synthetic */ int access$600(com.google.android.material.badge.BadgeState.State r0) {
                int r0 = r0.maxCharacterCount
                return r0
        }

        public static /* synthetic */ int access$602(com.google.android.material.badge.BadgeState.State r0, int r1) {
                r0.maxCharacterCount = r1
                return r1
        }

        public static /* synthetic */ int access$700(com.google.android.material.badge.BadgeState.State r0) {
                int r0 = r0.number
                return r0
        }

        public static /* synthetic */ int access$702(com.google.android.material.badge.BadgeState.State r0, int r1) {
                r0.number = r1
                return r1
        }

        public static /* synthetic */ java.lang.Integer access$800(com.google.android.material.badge.BadgeState.State r0) {
                java.lang.Integer r0 = r0.backgroundColor
                return r0
        }

        public static /* synthetic */ java.lang.Integer access$802(com.google.android.material.badge.BadgeState.State r0, java.lang.Integer r1) {
                r0.backgroundColor = r1
                return r1
        }

        public static /* synthetic */ java.lang.Integer access$900(com.google.android.material.badge.BadgeState.State r0) {
                java.lang.Integer r0 = r0.badgeTextColor
                return r0
        }

        public static /* synthetic */ java.lang.Integer access$902(com.google.android.material.badge.BadgeState.State r0, java.lang.Integer r1) {
                r0.badgeTextColor = r1
                return r1
        }

        @Override // android.os.Parcelable
        public int describeContents() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@androidx.annotation.NonNull android.os.Parcel r1, int r2) {
                r0 = this;
                int r2 = r0.badgeResId
                r1.writeInt(r2)
                java.lang.Integer r2 = r0.backgroundColor
                r1.writeSerializable(r2)
                java.lang.Integer r2 = r0.badgeTextColor
                r1.writeSerializable(r2)
                int r2 = r0.alpha
                r1.writeInt(r2)
                int r2 = r0.number
                r1.writeInt(r2)
                int r2 = r0.maxCharacterCount
                r1.writeInt(r2)
                java.lang.CharSequence r2 = r0.contentDescriptionNumberless
                if (r2 != 0) goto L24
                r2 = 0
                goto L28
            L24:
                java.lang.String r2 = r2.toString()
            L28:
                r1.writeString(r2)
                int r2 = r0.contentDescriptionQuantityStrings
                r1.writeInt(r2)
                java.lang.Integer r2 = r0.badgeGravity
                r1.writeSerializable(r2)
                java.lang.Integer r2 = r0.horizontalOffsetWithoutText
                r1.writeSerializable(r2)
                java.lang.Integer r2 = r0.verticalOffsetWithoutText
                r1.writeSerializable(r2)
                java.lang.Integer r2 = r0.horizontalOffsetWithText
                r1.writeSerializable(r2)
                java.lang.Integer r2 = r0.verticalOffsetWithText
                r1.writeSerializable(r2)
                java.lang.Integer r2 = r0.additionalHorizontalOffset
                r1.writeSerializable(r2)
                java.lang.Integer r2 = r0.additionalVerticalOffset
                r1.writeSerializable(r2)
                java.lang.Boolean r2 = r0.isVisible
                r1.writeSerializable(r2)
                java.util.Locale r2 = r0.numberLocale
                r1.writeSerializable(r2)
                return
        }
    }

    public BadgeState(android.content.Context r4, @androidx.annotation.XmlRes int r5, @androidx.annotation.AttrRes int r6, @androidx.annotation.StyleRes int r7, @androidx.annotation.Nullable com.google.android.material.badge.BadgeState.State r8) {
            r3 = this;
            r3.<init>()
            com.google.android.material.badge.BadgeState$State r0 = new com.google.android.material.badge.BadgeState$State
            r0.<init>()
            r3.currentState = r0
            if (r8 != 0) goto L11
            com.google.android.material.badge.BadgeState$State r8 = new com.google.android.material.badge.BadgeState$State
            r8.<init>()
        L11:
            if (r5 == 0) goto L16
            com.google.android.material.badge.BadgeState.State.access$002(r8, r5)
        L16:
            int r5 = com.google.android.material.badge.BadgeState.State.access$000(r8)
            android.content.res.TypedArray r5 = r3.generateTypedArray(r4, r5, r6, r7)
            android.content.res.Resources r6 = r4.getResources()
            int r7 = com.google.android.material.R.styleable.Badge_badgeRadius
            int r1 = com.google.android.material.R.dimen.mtrl_badge_radius
            int r1 = r6.getDimensionPixelSize(r1)
            int r7 = r5.getDimensionPixelSize(r7, r1)
            float r7 = (float) r7
            r3.badgeRadius = r7
            int r7 = com.google.android.material.R.styleable.Badge_badgeWidePadding
            int r1 = com.google.android.material.R.dimen.mtrl_badge_long_text_horizontal_padding
            int r1 = r6.getDimensionPixelSize(r1)
            int r7 = r5.getDimensionPixelSize(r7, r1)
            float r7 = (float) r7
            r3.badgeWidePadding = r7
            int r7 = com.google.android.material.R.styleable.Badge_badgeWithTextRadius
            int r1 = com.google.android.material.R.dimen.mtrl_badge_with_text_radius
            int r6 = r6.getDimensionPixelSize(r1)
            int r6 = r5.getDimensionPixelSize(r7, r6)
            float r6 = (float) r6
            r3.badgeWithTextRadius = r6
            int r6 = com.google.android.material.badge.BadgeState.State.access$100(r8)
            r7 = -2
            if (r6 != r7) goto L59
            r6 = 255(0xff, float:3.57E-43)
            goto L5d
        L59:
            int r6 = com.google.android.material.badge.BadgeState.State.access$100(r8)
        L5d:
            com.google.android.material.badge.BadgeState.State.access$102(r0, r6)
            java.lang.CharSequence r6 = com.google.android.material.badge.BadgeState.State.access$200(r8)
            if (r6 != 0) goto L6d
            int r6 = com.google.android.material.R.string.mtrl_badge_numberless_content_description
            java.lang.String r6 = r4.getString(r6)
            goto L71
        L6d:
            java.lang.CharSequence r6 = com.google.android.material.badge.BadgeState.State.access$200(r8)
        L71:
            com.google.android.material.badge.BadgeState.State.access$202(r0, r6)
            int r6 = com.google.android.material.badge.BadgeState.State.access$300(r8)
            if (r6 != 0) goto L7d
            int r6 = com.google.android.material.R.plurals.mtrl_badge_content_description
            goto L81
        L7d:
            int r6 = com.google.android.material.badge.BadgeState.State.access$300(r8)
        L81:
            com.google.android.material.badge.BadgeState.State.access$302(r0, r6)
            int r6 = com.google.android.material.badge.BadgeState.State.access$400(r8)
            if (r6 != 0) goto L8d
            int r6 = com.google.android.material.R.string.mtrl_exceed_max_badge_number_content_description
            goto L91
        L8d:
            int r6 = com.google.android.material.badge.BadgeState.State.access$400(r8)
        L91:
            com.google.android.material.badge.BadgeState.State.access$402(r0, r6)
            java.lang.Boolean r6 = com.google.android.material.badge.BadgeState.State.access$500(r8)
            r1 = 0
            if (r6 == 0) goto La8
            java.lang.Boolean r6 = com.google.android.material.badge.BadgeState.State.access$500(r8)
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto La6
            goto La8
        La6:
            r6 = 0
            goto La9
        La8:
            r6 = 1
        La9:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            com.google.android.material.badge.BadgeState.State.access$502(r0, r6)
            int r6 = com.google.android.material.badge.BadgeState.State.access$600(r8)
            if (r6 != r7) goto Lbe
            int r6 = com.google.android.material.R.styleable.Badge_maxCharacterCount
            r2 = 4
            int r6 = r5.getInt(r6, r2)
            goto Lc2
        Lbe:
            int r6 = com.google.android.material.badge.BadgeState.State.access$600(r8)
        Lc2:
            com.google.android.material.badge.BadgeState.State.access$602(r0, r6)
            int r6 = com.google.android.material.badge.BadgeState.State.access$700(r8)
            if (r6 == r7) goto Ld3
            int r6 = com.google.android.material.badge.BadgeState.State.access$700(r8)
            com.google.android.material.badge.BadgeState.State.access$702(r0, r6)
            goto Le7
        Ld3:
            int r6 = com.google.android.material.R.styleable.Badge_number
            boolean r7 = r5.hasValue(r6)
            if (r7 == 0) goto Le3
            int r6 = r5.getInt(r6, r1)
            com.google.android.material.badge.BadgeState.State.access$702(r0, r6)
            goto Le7
        Le3:
            r6 = -1
            com.google.android.material.badge.BadgeState.State.access$702(r0, r6)
        Le7:
            java.lang.Integer r6 = com.google.android.material.badge.BadgeState.State.access$800(r8)
            if (r6 != 0) goto Lf4
            int r6 = com.google.android.material.R.styleable.Badge_backgroundColor
            int r6 = readColorFromAttributes(r4, r5, r6)
            goto Lfc
        Lf4:
            java.lang.Integer r6 = com.google.android.material.badge.BadgeState.State.access$800(r8)
            int r6 = r6.intValue()
        Lfc:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            com.google.android.material.badge.BadgeState.State.access$802(r0, r6)
            java.lang.Integer r6 = com.google.android.material.badge.BadgeState.State.access$900(r8)
            if (r6 == 0) goto L111
            java.lang.Integer r4 = com.google.android.material.badge.BadgeState.State.access$900(r8)
            com.google.android.material.badge.BadgeState.State.access$902(r0, r4)
            goto L13b
        L111:
            int r6 = com.google.android.material.R.styleable.Badge_badgeTextColor
            boolean r7 = r5.hasValue(r6)
            if (r7 == 0) goto L125
            int r4 = readColorFromAttributes(r4, r5, r6)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            com.google.android.material.badge.BadgeState.State.access$902(r0, r4)
            goto L13b
        L125:
            com.google.android.material.resources.TextAppearance r6 = new com.google.android.material.resources.TextAppearance
            int r7 = com.google.android.material.R.style.TextAppearance_MaterialComponents_Badge
            r6.<init>(r4, r7)
            android.content.res.ColorStateList r4 = r6.getTextColor()
            int r4 = r4.getDefaultColor()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            com.google.android.material.badge.BadgeState.State.access$902(r0, r4)
        L13b:
            java.lang.Integer r4 = com.google.android.material.badge.BadgeState.State.access$1000(r8)
            if (r4 != 0) goto L14b
            int r4 = com.google.android.material.R.styleable.Badge_badgeGravity
            r6 = 8388661(0x800035, float:1.1755018E-38)
            int r4 = r5.getInt(r4, r6)
            goto L153
        L14b:
            java.lang.Integer r4 = com.google.android.material.badge.BadgeState.State.access$1000(r8)
            int r4 = r4.intValue()
        L153:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            com.google.android.material.badge.BadgeState.State.access$1002(r0, r4)
            java.lang.Integer r4 = com.google.android.material.badge.BadgeState.State.access$1100(r8)
            if (r4 != 0) goto L167
            int r4 = com.google.android.material.R.styleable.Badge_horizontalOffset
            int r4 = r5.getDimensionPixelOffset(r4, r1)
            goto L16f
        L167:
            java.lang.Integer r4 = com.google.android.material.badge.BadgeState.State.access$1100(r8)
            int r4 = r4.intValue()
        L16f:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            com.google.android.material.badge.BadgeState.State.access$1102(r0, r4)
            java.lang.Integer r4 = com.google.android.material.badge.BadgeState.State.access$1200(r8)
            if (r4 != 0) goto L183
            int r4 = com.google.android.material.R.styleable.Badge_verticalOffset
            int r4 = r5.getDimensionPixelOffset(r4, r1)
            goto L18b
        L183:
            java.lang.Integer r4 = com.google.android.material.badge.BadgeState.State.access$1200(r8)
            int r4 = r4.intValue()
        L18b:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            com.google.android.material.badge.BadgeState.State.access$1202(r0, r4)
            java.lang.Integer r4 = com.google.android.material.badge.BadgeState.State.access$1300(r8)
            if (r4 != 0) goto L1a7
            int r4 = com.google.android.material.R.styleable.Badge_horizontalOffsetWithText
            java.lang.Integer r6 = com.google.android.material.badge.BadgeState.State.access$1100(r0)
            int r6 = r6.intValue()
            int r4 = r5.getDimensionPixelOffset(r4, r6)
            goto L1af
        L1a7:
            java.lang.Integer r4 = com.google.android.material.badge.BadgeState.State.access$1300(r8)
            int r4 = r4.intValue()
        L1af:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            com.google.android.material.badge.BadgeState.State.access$1302(r0, r4)
            java.lang.Integer r4 = com.google.android.material.badge.BadgeState.State.access$1400(r8)
            if (r4 != 0) goto L1cb
            int r4 = com.google.android.material.R.styleable.Badge_verticalOffsetWithText
            java.lang.Integer r6 = com.google.android.material.badge.BadgeState.State.access$1200(r0)
            int r6 = r6.intValue()
            int r4 = r5.getDimensionPixelOffset(r4, r6)
            goto L1d3
        L1cb:
            java.lang.Integer r4 = com.google.android.material.badge.BadgeState.State.access$1400(r8)
            int r4 = r4.intValue()
        L1d3:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            com.google.android.material.badge.BadgeState.State.access$1402(r0, r4)
            java.lang.Integer r4 = com.google.android.material.badge.BadgeState.State.access$1500(r8)
            if (r4 != 0) goto L1e2
            r4 = 0
            goto L1ea
        L1e2:
            java.lang.Integer r4 = com.google.android.material.badge.BadgeState.State.access$1500(r8)
            int r4 = r4.intValue()
        L1ea:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            com.google.android.material.badge.BadgeState.State.access$1502(r0, r4)
            java.lang.Integer r4 = com.google.android.material.badge.BadgeState.State.access$1600(r8)
            if (r4 != 0) goto L1f8
            goto L200
        L1f8:
            java.lang.Integer r4 = com.google.android.material.badge.BadgeState.State.access$1600(r8)
            int r1 = r4.intValue()
        L200:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)
            com.google.android.material.badge.BadgeState.State.access$1602(r0, r4)
            r5.recycle()
            java.util.Locale r4 = com.google.android.material.badge.BadgeState.State.access$1700(r8)
            if (r4 != 0) goto L225
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 24
            if (r4 < r5) goto L21d
            java.util.Locale$Category r4 = java.util.Locale.Category.FORMAT
            java.util.Locale r4 = java.util.Locale.getDefault(r4)
            goto L221
        L21d:
            java.util.Locale r4 = java.util.Locale.getDefault()
        L221:
            com.google.android.material.badge.BadgeState.State.access$1702(r0, r4)
            goto L22c
        L225:
            java.util.Locale r4 = com.google.android.material.badge.BadgeState.State.access$1700(r8)
            com.google.android.material.badge.BadgeState.State.access$1702(r0, r4)
        L22c:
            r3.overridingState = r8
            return
    }

    private android.content.res.TypedArray generateTypedArray(android.content.Context r8, @androidx.annotation.XmlRes int r9, @androidx.annotation.AttrRes int r10, @androidx.annotation.StyleRes int r11) {
            r7 = this;
            r0 = 0
            if (r9 == 0) goto Lf
            java.lang.String r1 = "badge"
            android.util.AttributeSet r9 = com.google.android.material.drawable.DrawableUtils.parseDrawableXml(r8, r9, r1)
            int r1 = r9.getStyleAttribute()
            r2 = r9
            goto L12
        Lf:
            r9 = 0
            r2 = r9
            r1 = 0
        L12:
            if (r1 != 0) goto L16
            r5 = r11
            goto L17
        L16:
            r5 = r1
        L17:
            int[] r3 = com.google.android.material.R.styleable.Badge
            int[] r6 = new int[r0]
            r1 = r8
            r4 = r10
            android.content.res.TypedArray r8 = com.google.android.material.internal.ThemeEnforcement.obtainStyledAttributes(r1, r2, r3, r4, r5, r6)
            return r8
    }

    private static int readColorFromAttributes(android.content.Context r0, @androidx.annotation.NonNull android.content.res.TypedArray r1, @androidx.annotation.StyleableRes int r2) {
            android.content.res.ColorStateList r0 = com.google.android.material.resources.MaterialResources.getColorStateList(r0, r1, r2)
            int r0 = r0.getDefaultColor()
            return r0
    }

    public final void clearNumber() {
            r2 = this;
            com.google.android.material.badge.BadgeState$State r0 = r2.overridingState
            r1 = -1
            com.google.android.material.badge.BadgeState.State.access$702(r0, r1)
            com.google.android.material.badge.BadgeState$State r0 = r2.currentState
            com.google.android.material.badge.BadgeState.State.access$702(r0, r1)
            return
    }

    @androidx.annotation.Dimension(unit = 1)
    public final int getAdditionalHorizontalOffset() {
            r1 = this;
            com.google.android.material.badge.BadgeState$State r0 = r1.currentState
            java.lang.Integer r0 = com.google.android.material.badge.BadgeState.State.access$1500(r0)
            int r0 = r0.intValue()
            return r0
    }

    @androidx.annotation.Dimension(unit = 1)
    public final int getAdditionalVerticalOffset() {
            r1 = this;
            com.google.android.material.badge.BadgeState$State r0 = r1.currentState
            java.lang.Integer r0 = com.google.android.material.badge.BadgeState.State.access$1600(r0)
            int r0 = r0.intValue()
            return r0
    }

    public final int getAlpha() {
            r1 = this;
            com.google.android.material.badge.BadgeState$State r0 = r1.currentState
            int r0 = com.google.android.material.badge.BadgeState.State.access$100(r0)
            return r0
    }

    @androidx.annotation.ColorInt
    public final int getBackgroundColor() {
            r1 = this;
            com.google.android.material.badge.BadgeState$State r0 = r1.currentState
            java.lang.Integer r0 = com.google.android.material.badge.BadgeState.State.access$800(r0)
            int r0 = r0.intValue()
            return r0
    }

    public final int getBadgeGravity() {
            r1 = this;
            com.google.android.material.badge.BadgeState$State r0 = r1.currentState
            java.lang.Integer r0 = com.google.android.material.badge.BadgeState.State.access$1000(r0)
            int r0 = r0.intValue()
            return r0
    }

    @androidx.annotation.ColorInt
    public final int getBadgeTextColor() {
            r1 = this;
            com.google.android.material.badge.BadgeState$State r0 = r1.currentState
            java.lang.Integer r0 = com.google.android.material.badge.BadgeState.State.access$900(r0)
            int r0 = r0.intValue()
            return r0
    }

    @androidx.annotation.StringRes
    public final int getContentDescriptionExceedsMaxBadgeNumberStringResource() {
            r1 = this;
            com.google.android.material.badge.BadgeState$State r0 = r1.currentState
            int r0 = com.google.android.material.badge.BadgeState.State.access$400(r0)
            return r0
    }

    public final java.lang.CharSequence getContentDescriptionNumberless() {
            r1 = this;
            com.google.android.material.badge.BadgeState$State r0 = r1.currentState
            java.lang.CharSequence r0 = com.google.android.material.badge.BadgeState.State.access$200(r0)
            return r0
    }

    @androidx.annotation.PluralsRes
    public final int getContentDescriptionQuantityStrings() {
            r1 = this;
            com.google.android.material.badge.BadgeState$State r0 = r1.currentState
            int r0 = com.google.android.material.badge.BadgeState.State.access$300(r0)
            return r0
    }

    @androidx.annotation.Dimension(unit = 1)
    public final int getHorizontalOffsetWithText() {
            r1 = this;
            com.google.android.material.badge.BadgeState$State r0 = r1.currentState
            java.lang.Integer r0 = com.google.android.material.badge.BadgeState.State.access$1300(r0)
            int r0 = r0.intValue()
            return r0
    }

    @androidx.annotation.Dimension(unit = 1)
    public final int getHorizontalOffsetWithoutText() {
            r1 = this;
            com.google.android.material.badge.BadgeState$State r0 = r1.currentState
            java.lang.Integer r0 = com.google.android.material.badge.BadgeState.State.access$1100(r0)
            int r0 = r0.intValue()
            return r0
    }

    public final int getMaxCharacterCount() {
            r1 = this;
            com.google.android.material.badge.BadgeState$State r0 = r1.currentState
            int r0 = com.google.android.material.badge.BadgeState.State.access$600(r0)
            return r0
    }

    public final int getNumber() {
            r1 = this;
            com.google.android.material.badge.BadgeState$State r0 = r1.currentState
            int r0 = com.google.android.material.badge.BadgeState.State.access$700(r0)
            return r0
    }

    public final java.util.Locale getNumberLocale() {
            r1 = this;
            com.google.android.material.badge.BadgeState$State r0 = r1.currentState
            java.util.Locale r0 = com.google.android.material.badge.BadgeState.State.access$1700(r0)
            return r0
    }

    public final com.google.android.material.badge.BadgeState.State getOverridingState() {
            r1 = this;
            com.google.android.material.badge.BadgeState$State r0 = r1.overridingState
            return r0
    }

    @androidx.annotation.Dimension(unit = 1)
    public final int getVerticalOffsetWithText() {
            r1 = this;
            com.google.android.material.badge.BadgeState$State r0 = r1.currentState
            java.lang.Integer r0 = com.google.android.material.badge.BadgeState.State.access$1400(r0)
            int r0 = r0.intValue()
            return r0
    }

    @androidx.annotation.Dimension(unit = 1)
    public final int getVerticalOffsetWithoutText() {
            r1 = this;
            com.google.android.material.badge.BadgeState$State r0 = r1.currentState
            java.lang.Integer r0 = com.google.android.material.badge.BadgeState.State.access$1200(r0)
            int r0 = r0.intValue()
            return r0
    }

    public final boolean hasNumber() {
            r2 = this;
            com.google.android.material.badge.BadgeState$State r0 = r2.currentState
            int r0 = com.google.android.material.badge.BadgeState.State.access$700(r0)
            r1 = -1
            if (r0 == r1) goto Lb
            r0 = 1
            goto Lc
        Lb:
            r0 = 0
        Lc:
            return r0
    }

    public final boolean isVisible() {
            r1 = this;
            com.google.android.material.badge.BadgeState$State r0 = r1.currentState
            java.lang.Boolean r0 = com.google.android.material.badge.BadgeState.State.access$500(r0)
            boolean r0 = r0.booleanValue()
            return r0
    }

    public final void setAdditionalHorizontalOffset(@androidx.annotation.Dimension(unit = 1) int r3) {
            r2 = this;
            com.google.android.material.badge.BadgeState$State r0 = r2.overridingState
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            com.google.android.material.badge.BadgeState.State.access$1502(r0, r1)
            com.google.android.material.badge.BadgeState$State r0 = r2.currentState
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            com.google.android.material.badge.BadgeState.State.access$1502(r0, r3)
            return
    }

    public final void setAdditionalVerticalOffset(@androidx.annotation.Dimension(unit = 1) int r3) {
            r2 = this;
            com.google.android.material.badge.BadgeState$State r0 = r2.overridingState
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            com.google.android.material.badge.BadgeState.State.access$1602(r0, r1)
            com.google.android.material.badge.BadgeState$State r0 = r2.currentState
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            com.google.android.material.badge.BadgeState.State.access$1602(r0, r3)
            return
    }

    public final void setAlpha(int r2) {
            r1 = this;
            com.google.android.material.badge.BadgeState$State r0 = r1.overridingState
            com.google.android.material.badge.BadgeState.State.access$102(r0, r2)
            com.google.android.material.badge.BadgeState$State r0 = r1.currentState
            com.google.android.material.badge.BadgeState.State.access$102(r0, r2)
            return
    }

    public final void setBackgroundColor(@androidx.annotation.ColorInt int r3) {
            r2 = this;
            com.google.android.material.badge.BadgeState$State r0 = r2.overridingState
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            com.google.android.material.badge.BadgeState.State.access$802(r0, r1)
            com.google.android.material.badge.BadgeState$State r0 = r2.currentState
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            com.google.android.material.badge.BadgeState.State.access$802(r0, r3)
            return
    }

    public final void setBadgeGravity(int r3) {
            r2 = this;
            com.google.android.material.badge.BadgeState$State r0 = r2.overridingState
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            com.google.android.material.badge.BadgeState.State.access$1002(r0, r1)
            com.google.android.material.badge.BadgeState$State r0 = r2.currentState
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            com.google.android.material.badge.BadgeState.State.access$1002(r0, r3)
            return
    }

    public final void setBadgeTextColor(@androidx.annotation.ColorInt int r3) {
            r2 = this;
            com.google.android.material.badge.BadgeState$State r0 = r2.overridingState
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            com.google.android.material.badge.BadgeState.State.access$902(r0, r1)
            com.google.android.material.badge.BadgeState$State r0 = r2.currentState
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            com.google.android.material.badge.BadgeState.State.access$902(r0, r3)
            return
    }

    public final void setContentDescriptionExceedsMaxBadgeNumberStringResource(@androidx.annotation.StringRes int r2) {
            r1 = this;
            com.google.android.material.badge.BadgeState$State r0 = r1.overridingState
            com.google.android.material.badge.BadgeState.State.access$402(r0, r2)
            com.google.android.material.badge.BadgeState$State r0 = r1.currentState
            com.google.android.material.badge.BadgeState.State.access$402(r0, r2)
            return
    }

    public final void setContentDescriptionNumberless(java.lang.CharSequence r2) {
            r1 = this;
            com.google.android.material.badge.BadgeState$State r0 = r1.overridingState
            com.google.android.material.badge.BadgeState.State.access$202(r0, r2)
            com.google.android.material.badge.BadgeState$State r0 = r1.currentState
            com.google.android.material.badge.BadgeState.State.access$202(r0, r2)
            return
    }

    public final void setContentDescriptionQuantityStringsResource(@androidx.annotation.PluralsRes int r2) {
            r1 = this;
            com.google.android.material.badge.BadgeState$State r0 = r1.overridingState
            com.google.android.material.badge.BadgeState.State.access$302(r0, r2)
            com.google.android.material.badge.BadgeState$State r0 = r1.currentState
            com.google.android.material.badge.BadgeState.State.access$302(r0, r2)
            return
    }

    public final void setHorizontalOffsetWithText(@androidx.annotation.Dimension(unit = 1) int r3) {
            r2 = this;
            com.google.android.material.badge.BadgeState$State r0 = r2.overridingState
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            com.google.android.material.badge.BadgeState.State.access$1302(r0, r1)
            com.google.android.material.badge.BadgeState$State r0 = r2.currentState
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            com.google.android.material.badge.BadgeState.State.access$1302(r0, r3)
            return
    }

    public final void setHorizontalOffsetWithoutText(@androidx.annotation.Dimension(unit = 1) int r3) {
            r2 = this;
            com.google.android.material.badge.BadgeState$State r0 = r2.overridingState
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            com.google.android.material.badge.BadgeState.State.access$1102(r0, r1)
            com.google.android.material.badge.BadgeState$State r0 = r2.currentState
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            com.google.android.material.badge.BadgeState.State.access$1102(r0, r3)
            return
    }

    public final void setMaxCharacterCount(int r2) {
            r1 = this;
            com.google.android.material.badge.BadgeState$State r0 = r1.overridingState
            com.google.android.material.badge.BadgeState.State.access$602(r0, r2)
            com.google.android.material.badge.BadgeState$State r0 = r1.currentState
            com.google.android.material.badge.BadgeState.State.access$602(r0, r2)
            return
    }

    public final void setNumber(int r2) {
            r1 = this;
            com.google.android.material.badge.BadgeState$State r0 = r1.overridingState
            com.google.android.material.badge.BadgeState.State.access$702(r0, r2)
            com.google.android.material.badge.BadgeState$State r0 = r1.currentState
            com.google.android.material.badge.BadgeState.State.access$702(r0, r2)
            return
    }

    public final void setNumberLocale(java.util.Locale r2) {
            r1 = this;
            com.google.android.material.badge.BadgeState$State r0 = r1.overridingState
            com.google.android.material.badge.BadgeState.State.access$1702(r0, r2)
            com.google.android.material.badge.BadgeState$State r0 = r1.currentState
            com.google.android.material.badge.BadgeState.State.access$1702(r0, r2)
            return
    }

    public final void setVerticalOffsetWithText(@androidx.annotation.Dimension(unit = 1) int r3) {
            r2 = this;
            com.google.android.material.badge.BadgeState$State r0 = r2.overridingState
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            com.google.android.material.badge.BadgeState.State.access$1402(r0, r1)
            com.google.android.material.badge.BadgeState$State r0 = r2.currentState
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            com.google.android.material.badge.BadgeState.State.access$1402(r0, r3)
            return
    }

    public final void setVerticalOffsetWithoutText(@androidx.annotation.Dimension(unit = 1) int r3) {
            r2 = this;
            com.google.android.material.badge.BadgeState$State r0 = r2.overridingState
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            com.google.android.material.badge.BadgeState.State.access$1202(r0, r1)
            com.google.android.material.badge.BadgeState$State r0 = r2.currentState
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            com.google.android.material.badge.BadgeState.State.access$1202(r0, r3)
            return
    }

    public final void setVisible(boolean r3) {
            r2 = this;
            com.google.android.material.badge.BadgeState$State r0 = r2.overridingState
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r3)
            com.google.android.material.badge.BadgeState.State.access$502(r0, r1)
            com.google.android.material.badge.BadgeState$State r0 = r2.currentState
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            com.google.android.material.badge.BadgeState.State.access$502(r0, r3)
            return
    }
}
