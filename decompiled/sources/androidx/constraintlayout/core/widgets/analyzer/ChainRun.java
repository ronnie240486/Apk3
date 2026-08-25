package androidx.constraintlayout.core.widgets.analyzer;

/* JADX INFO: loaded from: classes.dex */
public class ChainRun extends androidx.constraintlayout.core.widgets.analyzer.WidgetRun {
    private int chainStyle;
    public java.util.ArrayList<androidx.constraintlayout.core.widgets.analyzer.WidgetRun> widgets;

    public ChainRun(androidx.constraintlayout.core.widgets.ConstraintWidget r1, int r2) {
            r0 = this;
            r0.<init>(r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.widgets = r1
            r0.orientation = r2
            r0.build()
            return
    }

    private void build() {
            r5 = this;
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r5.widget
            int r1 = r5.orientation
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = r0.getPreviousChainMember(r1)
        L8:
            r4 = r1
            r1 = r0
            r0 = r4
            if (r0 == 0) goto L14
            int r1 = r5.orientation
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = r0.getPreviousChainMember(r1)
            goto L8
        L14:
            r5.widget = r1
            java.util.ArrayList<androidx.constraintlayout.core.widgets.analyzer.WidgetRun> r0 = r5.widgets
            int r2 = r5.orientation
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun r2 = r1.getRun(r2)
            r0.add(r2)
            int r0 = r5.orientation
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r1.getNextChainMember(r0)
        L27:
            if (r0 == 0) goto L3b
            java.util.ArrayList<androidx.constraintlayout.core.widgets.analyzer.WidgetRun> r1 = r5.widgets
            int r2 = r5.orientation
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun r2 = r0.getRun(r2)
            r1.add(r2)
            int r1 = r5.orientation
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r0.getNextChainMember(r1)
            goto L27
        L3b:
            java.util.ArrayList<androidx.constraintlayout.core.widgets.analyzer.WidgetRun> r0 = r5.widgets
            java.util.Iterator r0 = r0.iterator()
        L41:
            boolean r1 = r0.hasNext()
            r2 = 1
            if (r1 == 0) goto L5e
            java.lang.Object r1 = r0.next()
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun r1 = (androidx.constraintlayout.core.widgets.analyzer.WidgetRun) r1
            int r3 = r5.orientation
            if (r3 != 0) goto L57
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = r1.widget
            r1.horizontalChainRun = r5
            goto L41
        L57:
            if (r3 != r2) goto L41
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = r1.widget
            r1.verticalChainRun = r5
            goto L41
        L5e:
            int r0 = r5.orientation
            if (r0 != 0) goto L72
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r5.widget
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r0.getParent()
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r0 = (androidx.constraintlayout.core.widgets.ConstraintWidgetContainer) r0
            boolean r0 = r0.isRtl()
            if (r0 == 0) goto L72
            r0 = 1
            goto L73
        L72:
            r0 = 0
        L73:
            if (r0 == 0) goto L8e
            java.util.ArrayList<androidx.constraintlayout.core.widgets.analyzer.WidgetRun> r0 = r5.widgets
            int r0 = r0.size()
            if (r0 <= r2) goto L8e
            java.util.ArrayList<androidx.constraintlayout.core.widgets.analyzer.WidgetRun> r0 = r5.widgets
            int r1 = r0.size()
            int r1 = r1 - r2
            java.lang.Object r0 = r0.get(r1)
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun r0 = (androidx.constraintlayout.core.widgets.analyzer.WidgetRun) r0
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r0.widget
            r5.widget = r0
        L8e:
            int r0 = r5.orientation
            if (r0 != 0) goto L99
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r5.widget
            int r0 = r0.getHorizontalChainStyle()
            goto L9f
        L99:
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r5.widget
            int r0 = r0.getVerticalChainStyle()
        L9f:
            r5.chainStyle = r0
            return
    }

    private androidx.constraintlayout.core.widgets.ConstraintWidget getFirstVisibleWidget() {
            r4 = this;
            r0 = 0
        L1:
            java.util.ArrayList<androidx.constraintlayout.core.widgets.analyzer.WidgetRun> r1 = r4.widgets
            int r1 = r1.size()
            if (r0 >= r1) goto L21
            java.util.ArrayList<androidx.constraintlayout.core.widgets.analyzer.WidgetRun> r1 = r4.widgets
            java.lang.Object r1 = r1.get(r0)
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun r1 = (androidx.constraintlayout.core.widgets.analyzer.WidgetRun) r1
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = r1.widget
            int r2 = r2.getVisibility()
            r3 = 8
            if (r2 == r3) goto L1e
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r1.widget
            return r0
        L1e:
            int r0 = r0 + 1
            goto L1
        L21:
            r0 = 0
            return r0
    }

    private androidx.constraintlayout.core.widgets.ConstraintWidget getLastVisibleWidget() {
            r4 = this;
            java.util.ArrayList<androidx.constraintlayout.core.widgets.analyzer.WidgetRun> r0 = r4.widgets
            int r0 = r0.size()
            int r0 = r0 + (-1)
        L8:
            if (r0 < 0) goto L22
            java.util.ArrayList<androidx.constraintlayout.core.widgets.analyzer.WidgetRun> r1 = r4.widgets
            java.lang.Object r1 = r1.get(r0)
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun r1 = (androidx.constraintlayout.core.widgets.analyzer.WidgetRun) r1
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = r1.widget
            int r2 = r2.getVisibility()
            r3 = 8
            if (r2 == r3) goto L1f
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r1.widget
            return r0
        L1f:
            int r0 = r0 + (-1)
            goto L8
        L22:
            r0 = 0
            return r0
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public final void apply() {
            r5 = this;
            java.util.ArrayList<androidx.constraintlayout.core.widgets.analyzer.WidgetRun> r0 = r5.widgets
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L16
            java.lang.Object r1 = r0.next()
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun r1 = (androidx.constraintlayout.core.widgets.analyzer.WidgetRun) r1
            r1.apply()
            goto L6
        L16:
            java.util.ArrayList<androidx.constraintlayout.core.widgets.analyzer.WidgetRun> r0 = r5.widgets
            int r0 = r0.size()
            r1 = 1
            if (r0 >= r1) goto L20
            return
        L20:
            java.util.ArrayList<androidx.constraintlayout.core.widgets.analyzer.WidgetRun> r2 = r5.widgets
            r3 = 0
            java.lang.Object r2 = r2.get(r3)
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun r2 = (androidx.constraintlayout.core.widgets.analyzer.WidgetRun) r2
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = r2.widget
            java.util.ArrayList<androidx.constraintlayout.core.widgets.analyzer.WidgetRun> r4 = r5.widgets
            int r0 = r0 - r1
            java.lang.Object r0 = r4.get(r0)
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun r0 = (androidx.constraintlayout.core.widgets.analyzer.WidgetRun) r0
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r0.widget
            int r4 = r5.orientation
            if (r4 != 0) goto L76
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r2.mLeft
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r0.mRight
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r2 = r5.getTarget(r1, r3)
            int r1 = r1.getMargin()
            androidx.constraintlayout.core.widgets.ConstraintWidget r4 = r5.getFirstVisibleWidget()
            if (r4 == 0) goto L52
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r4.mLeft
            int r1 = r1.getMargin()
        L52:
            if (r2 == 0) goto L59
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r4 = r5.start
            r5.addTarget(r4, r2, r1)
        L59:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r5.getTarget(r0, r3)
            int r0 = r0.getMargin()
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = r5.getLastVisibleWidget()
            if (r2 == 0) goto L6d
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r2.mRight
            int r0 = r0.getMargin()
        L6d:
            if (r1 == 0) goto Lb1
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r2 = r5.end
            int r0 = -r0
            r5.addTarget(r2, r1, r0)
            goto Lb1
        L76:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r2.mTop
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r0.mBottom
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r3 = r5.getTarget(r2, r1)
            int r2 = r2.getMargin()
            androidx.constraintlayout.core.widgets.ConstraintWidget r4 = r5.getFirstVisibleWidget()
            if (r4 == 0) goto L8e
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r4.mTop
            int r2 = r2.getMargin()
        L8e:
            if (r3 == 0) goto L95
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r4 = r5.start
            r5.addTarget(r4, r3, r2)
        L95:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r5.getTarget(r0, r1)
            int r0 = r0.getMargin()
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = r5.getLastVisibleWidget()
            if (r2 == 0) goto La9
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r2.mBottom
            int r0 = r0.getMargin()
        La9:
            if (r1 == 0) goto Lb1
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r2 = r5.end
            int r0 = -r0
            r5.addTarget(r2, r1, r0)
        Lb1:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r5.start
            r0.updateDelegate = r5
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r5.end
            r0.updateDelegate = r5
            return
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public void applyToWidget() {
            r2 = this;
            r0 = 0
        L1:
            java.util.ArrayList<androidx.constraintlayout.core.widgets.analyzer.WidgetRun> r1 = r2.widgets
            int r1 = r1.size()
            if (r0 >= r1) goto L17
            java.util.ArrayList<androidx.constraintlayout.core.widgets.analyzer.WidgetRun> r1 = r2.widgets
            java.lang.Object r1 = r1.get(r0)
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun r1 = (androidx.constraintlayout.core.widgets.analyzer.WidgetRun) r1
            r1.applyToWidget()
            int r0 = r0 + 1
            goto L1
        L17:
            return
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public final void clear() {
            r2 = this;
            r0 = 0
            r2.runGroup = r0
            java.util.ArrayList<androidx.constraintlayout.core.widgets.analyzer.WidgetRun> r0 = r2.widgets
            java.util.Iterator r0 = r0.iterator()
        L9:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L19
            java.lang.Object r1 = r0.next()
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun r1 = (androidx.constraintlayout.core.widgets.analyzer.WidgetRun) r1
            r1.clear()
            goto L9
        L19:
            return
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public long getWrapDimension() {
            r7 = this;
            java.util.ArrayList<androidx.constraintlayout.core.widgets.analyzer.WidgetRun> r0 = r7.widgets
            int r0 = r0.size()
            r1 = 0
            r3 = 0
        L9:
            if (r3 >= r0) goto L27
            java.util.ArrayList<androidx.constraintlayout.core.widgets.analyzer.WidgetRun> r4 = r7.widgets
            java.lang.Object r4 = r4.get(r3)
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun r4 = (androidx.constraintlayout.core.widgets.analyzer.WidgetRun) r4
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r5 = r4.start
            int r5 = r5.margin
            long r5 = (long) r5
            long r1 = r1 + r5
            long r5 = r4.getWrapDimension()
            long r5 = r5 + r1
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r4.end
            int r1 = r1.margin
            long r1 = (long) r1
            long r1 = r1 + r5
            int r3 = r3 + 1
            goto L9
        L27:
            return r1
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public final boolean supportsWrapComputation() {
            r4 = this;
            java.util.ArrayList<androidx.constraintlayout.core.widgets.analyzer.WidgetRun> r0 = r4.widgets
            int r0 = r0.size()
            r1 = 0
            r2 = 0
        L8:
            if (r2 >= r0) goto L1c
            java.util.ArrayList<androidx.constraintlayout.core.widgets.analyzer.WidgetRun> r3 = r4.widgets
            java.lang.Object r3 = r3.get(r2)
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun r3 = (androidx.constraintlayout.core.widgets.analyzer.WidgetRun) r3
            boolean r3 = r3.supportsWrapComputation()
            if (r3 != 0) goto L19
            return r1
        L19:
            int r2 = r2 + 1
            goto L8
        L1c:
            r0 = 1
            return r0
    }

    public java.lang.String toString() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "ChainRun "
            r0.<init>(r1)
            int r1 = r4.orientation
            if (r1 != 0) goto Le
            java.lang.String r1 = "horizontal : "
            goto L11
        Le:
            java.lang.String r1 = "vertical : "
        L11:
            r0.append(r1)
            java.util.ArrayList<androidx.constraintlayout.core.widgets.analyzer.WidgetRun> r1 = r4.widgets
            java.util.Iterator r1 = r1.iterator()
        L1a:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L34
            java.lang.Object r2 = r1.next()
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun r2 = (androidx.constraintlayout.core.widgets.analyzer.WidgetRun) r2
            java.lang.String r3 = "<"
            r0.append(r3)
            r0.append(r2)
            java.lang.String r2 = "> "
            r0.append(r2)
            goto L1a
        L34:
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun, androidx.constraintlayout.core.widgets.analyzer.Dependency
    public void update(androidx.constraintlayout.core.widgets.analyzer.Dependency r27) {
            r26 = this;
            r0 = r26
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r0.start
            boolean r1 = r1.resolved
            if (r1 == 0) goto L429
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r0.end
            boolean r1 = r1.resolved
            if (r1 != 0) goto L10
            goto L429
        L10:
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = r0.widget
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = r1.getParent()
            boolean r2 = r1 instanceof androidx.constraintlayout.core.widgets.ConstraintWidgetContainer
            if (r2 == 0) goto L21
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r1 = (androidx.constraintlayout.core.widgets.ConstraintWidgetContainer) r1
            boolean r1 = r1.isRtl()
            goto L22
        L21:
            r1 = 0
        L22:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r2 = r0.end
            int r2 = r2.value
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r4 = r0.start
            int r4 = r4.value
            int r2 = r2 - r4
            java.util.ArrayList<androidx.constraintlayout.core.widgets.analyzer.WidgetRun> r4 = r0.widgets
            int r4 = r4.size()
            r5 = 0
        L32:
            r6 = -1
            r7 = 8
            if (r5 >= r4) goto L4a
            java.util.ArrayList<androidx.constraintlayout.core.widgets.analyzer.WidgetRun> r8 = r0.widgets
            java.lang.Object r8 = r8.get(r5)
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun r8 = (androidx.constraintlayout.core.widgets.analyzer.WidgetRun) r8
            androidx.constraintlayout.core.widgets.ConstraintWidget r8 = r8.widget
            int r8 = r8.getVisibility()
            if (r8 != r7) goto L4b
            int r5 = r5 + 1
            goto L32
        L4a:
            r5 = -1
        L4b:
            int r8 = r4 + (-1)
            r9 = r8
        L4e:
            if (r9 < 0) goto L64
            java.util.ArrayList<androidx.constraintlayout.core.widgets.analyzer.WidgetRun> r10 = r0.widgets
            java.lang.Object r10 = r10.get(r9)
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun r10 = (androidx.constraintlayout.core.widgets.analyzer.WidgetRun) r10
            androidx.constraintlayout.core.widgets.ConstraintWidget r10 = r10.widget
            int r10 = r10.getVisibility()
            if (r10 != r7) goto L63
            int r9 = r9 + (-1)
            goto L4e
        L63:
            r6 = r9
        L64:
            r9 = 0
        L65:
            r11 = 2
            if (r9 >= r11) goto L109
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
        L6f:
            if (r13 >= r4) goto Lfb
            java.util.ArrayList<androidx.constraintlayout.core.widgets.analyzer.WidgetRun> r3 = r0.widgets
            java.lang.Object r3 = r3.get(r13)
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun r3 = (androidx.constraintlayout.core.widgets.analyzer.WidgetRun) r3
            androidx.constraintlayout.core.widgets.ConstraintWidget r11 = r3.widget
            int r11 = r11.getVisibility()
            if (r11 != r7) goto L83
            goto Lf4
        L83:
            int r16 = r16 + 1
            if (r13 <= 0) goto L8e
            if (r13 < r5) goto L8e
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r11 = r3.start
            int r11 = r11.margin
            int r14 = r14 + r11
        L8e:
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r11 = r3.dimension
            int r7 = r11.value
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r10 = r3.dimensionBehavior
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r12 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r10 == r12) goto L9a
            r10 = 1
            goto L9b
        L9a:
            r10 = 0
        L9b:
            if (r10 == 0) goto Lbd
            int r11 = r0.orientation
            if (r11 != 0) goto Lac
            androidx.constraintlayout.core.widgets.ConstraintWidget r12 = r3.widget
            androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun r12 = r12.horizontalRun
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r12 = r12.dimension
            boolean r12 = r12.resolved
            if (r12 != 0) goto Lac
            return
        Lac:
            r12 = 1
            if (r11 != r12) goto Lba
            androidx.constraintlayout.core.widgets.ConstraintWidget r11 = r3.widget
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r11 = r11.verticalRun
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r11 = r11.dimension
            boolean r11 = r11.resolved
            if (r11 != 0) goto Lba
            return
        Lba:
            r19 = r7
            goto Ld3
        Lbd:
            r19 = r7
            r12 = 1
            int r7 = r3.matchConstraintsType
            if (r7 != r12) goto Lcb
            if (r9 != 0) goto Lcb
            int r7 = r11.wrapValue
            int r15 = r15 + 1
            goto Ld1
        Lcb:
            boolean r7 = r11.resolved
            if (r7 == 0) goto Ld3
            r7 = r19
        Ld1:
            r10 = 1
            goto Ld5
        Ld3:
            r7 = r19
        Ld5:
            if (r10 != 0) goto Le9
            int r15 = r15 + 1
            androidx.constraintlayout.core.widgets.ConstraintWidget r7 = r3.widget
            float[] r7 = r7.mWeight
            int r10 = r0.orientation
            r7 = r7[r10]
            r10 = 0
            int r11 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r11 < 0) goto Lea
            float r17 = r17 + r7
            goto Lea
        Le9:
            int r14 = r14 + r7
        Lea:
            if (r13 >= r8) goto Lf4
            if (r13 >= r6) goto Lf4
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r3 = r3.end
            int r3 = r3.margin
            int r3 = -r3
            int r14 = r14 + r3
        Lf4:
            int r13 = r13 + 1
            r7 = 8
            r11 = 2
            goto L6f
        Lfb:
            if (r14 < r2) goto L106
            if (r15 != 0) goto L100
            goto L106
        L100:
            int r9 = r9 + 1
            r7 = 8
            goto L65
        L106:
            r3 = r16
            goto L10e
        L109:
            r3 = 0
            r14 = 0
            r15 = 0
            r17 = 0
        L10e:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r7 = r0.start
            int r7 = r7.value
            if (r1 == 0) goto L118
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r7 = r0.end
            int r7 = r7.value
        L118:
            r9 = 1056964608(0x3f000000, float:0.5)
            if (r14 <= r2) goto L12f
            r10 = 1073741824(0x40000000, float:2.0)
            if (r1 == 0) goto L128
            int r11 = r14 - r2
            float r11 = (float) r11
            float r11 = r11 / r10
            float r11 = r11 + r9
            int r10 = (int) r11
            int r7 = r7 + r10
            goto L12f
        L128:
            int r11 = r14 - r2
            float r11 = (float) r11
            float r11 = r11 / r10
            float r11 = r11 + r9
            int r10 = (int) r11
            int r7 = r7 - r10
        L12f:
            if (r15 <= 0) goto L227
            int r10 = r2 - r14
            float r10 = (float) r10
            float r11 = (float) r15
            float r11 = r10 / r11
            float r11 = r11 + r9
            int r11 = (int) r11
            r12 = 0
            r13 = 0
        L13b:
            if (r12 >= r4) goto L1d9
            java.util.ArrayList<androidx.constraintlayout.core.widgets.analyzer.WidgetRun> r9 = r0.widgets
            java.lang.Object r9 = r9.get(r12)
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun r9 = (androidx.constraintlayout.core.widgets.analyzer.WidgetRun) r9
            r19 = r11
            androidx.constraintlayout.core.widgets.ConstraintWidget r11 = r9.widget
            int r11 = r11.getVisibility()
            r20 = r14
            r14 = 8
            if (r11 != r14) goto L155
            goto L1bf
        L155:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r11 = r9.dimensionBehavior
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r14 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r11 != r14) goto L1bf
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r11 = r9.dimension
            boolean r14 = r11.resolved
            if (r14 != 0) goto L1bf
            r14 = 0
            int r18 = (r17 > r14 ? 1 : (r17 == r14 ? 0 : -1))
            if (r18 <= 0) goto L179
            androidx.constraintlayout.core.widgets.ConstraintWidget r14 = r9.widget
            float[] r14 = r14.mWeight
            r21 = r7
            int r7 = r0.orientation
            r7 = r14[r7]
            float r7 = r7 * r10
            float r7 = r7 / r17
            r14 = 1056964608(0x3f000000, float:0.5)
            float r7 = r7 + r14
            int r7 = (int) r7
            goto L17d
        L179:
            r21 = r7
            r7 = r19
        L17d:
            int r14 = r0.orientation
            if (r14 != 0) goto L18c
            androidx.constraintlayout.core.widgets.ConstraintWidget r14 = r9.widget
            r22 = r10
            int r10 = r14.mMatchConstraintMaxWidth
            int r14 = r14.mMatchConstraintMinWidth
            r23 = r1
            goto L19b
        L18c:
            r22 = r10
            androidx.constraintlayout.core.widgets.ConstraintWidget r10 = r9.widget
            int r14 = r10.mMatchConstraintMaxHeight
            int r10 = r10.mMatchConstraintMinHeight
            r23 = r1
            r25 = r14
            r14 = r10
            r10 = r25
        L19b:
            int r1 = r9.matchConstraintsType
            r24 = r3
            r3 = 1
            if (r1 != r3) goto L1a9
            int r1 = r11.wrapValue
            int r1 = java.lang.Math.min(r7, r1)
            goto L1aa
        L1a9:
            r1 = r7
        L1aa:
            int r1 = java.lang.Math.max(r14, r1)
            if (r10 <= 0) goto L1b4
            int r1 = java.lang.Math.min(r10, r1)
        L1b4:
            if (r1 == r7) goto L1b9
            int r13 = r13 + 1
            r7 = r1
        L1b9:
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r1 = r9.dimension
            r1.resolve(r7)
            goto L1c7
        L1bf:
            r23 = r1
            r24 = r3
            r21 = r7
            r22 = r10
        L1c7:
            int r12 = r12 + 1
            r11 = r19
            r14 = r20
            r7 = r21
            r10 = r22
            r1 = r23
            r3 = r24
            r9 = 1056964608(0x3f000000, float:0.5)
            goto L13b
        L1d9:
            r23 = r1
            r24 = r3
            r21 = r7
            r20 = r14
            if (r13 <= 0) goto L218
            int r15 = r15 - r13
            r1 = 0
            r3 = 0
        L1e6:
            if (r1 >= r4) goto L216
            java.util.ArrayList<androidx.constraintlayout.core.widgets.analyzer.WidgetRun> r7 = r0.widgets
            java.lang.Object r7 = r7.get(r1)
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun r7 = (androidx.constraintlayout.core.widgets.analyzer.WidgetRun) r7
            androidx.constraintlayout.core.widgets.ConstraintWidget r9 = r7.widget
            int r9 = r9.getVisibility()
            r10 = 8
            if (r9 != r10) goto L1fb
            goto L213
        L1fb:
            if (r1 <= 0) goto L204
            if (r1 < r5) goto L204
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r9 = r7.start
            int r9 = r9.margin
            int r3 = r3 + r9
        L204:
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r9 = r7.dimension
            int r9 = r9.value
            int r3 = r3 + r9
            if (r1 >= r8) goto L213
            if (r1 >= r6) goto L213
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r7 = r7.end
            int r7 = r7.margin
            int r7 = -r7
            int r3 = r3 + r7
        L213:
            int r1 = r1 + 1
            goto L1e6
        L216:
            r14 = r3
            goto L21a
        L218:
            r14 = r20
        L21a:
            int r1 = r0.chainStyle
            r3 = 2
            if (r1 != r3) goto L225
            if (r13 != 0) goto L225
            r1 = 0
            r0.chainStyle = r1
            goto L231
        L225:
            r1 = 0
            goto L231
        L227:
            r23 = r1
            r24 = r3
            r21 = r7
            r20 = r14
            r1 = 0
            r3 = 2
        L231:
            if (r14 <= r2) goto L235
            r0.chainStyle = r3
        L235:
            if (r24 <= 0) goto L23d
            if (r15 != 0) goto L23d
            if (r5 != r6) goto L23d
            r0.chainStyle = r3
        L23d:
            int r3 = r0.chainStyle
            r7 = 1
            if (r3 != r7) goto L2e1
            r9 = r24
            if (r9 <= r7) goto L24b
            int r2 = r2 - r14
            int r3 = r9 + (-1)
            int r2 = r2 / r3
            goto L252
        L24b:
            if (r9 != r7) goto L251
            int r2 = r2 - r14
            r3 = 2
            int r2 = r2 / r3
            goto L252
        L251:
            r2 = 0
        L252:
            if (r15 <= 0) goto L255
            r2 = 0
        L255:
            r7 = r21
            r3 = 0
        L258:
            if (r3 >= r4) goto L429
            if (r23 == 0) goto L261
            int r1 = r3 + 1
            int r1 = r4 - r1
            goto L262
        L261:
            r1 = r3
        L262:
            java.util.ArrayList<androidx.constraintlayout.core.widgets.analyzer.WidgetRun> r9 = r0.widgets
            java.lang.Object r1 = r9.get(r1)
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun r1 = (androidx.constraintlayout.core.widgets.analyzer.WidgetRun) r1
            androidx.constraintlayout.core.widgets.ConstraintWidget r9 = r1.widget
            int r9 = r9.getVisibility()
            r10 = 8
            if (r9 != r10) goto L27f
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r9 = r1.start
            r9.resolve(r7)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r1.end
            r1.resolve(r7)
            goto L2dd
        L27f:
            if (r3 <= 0) goto L286
            if (r23 == 0) goto L285
            int r7 = r7 - r2
            goto L286
        L285:
            int r7 = r7 + r2
        L286:
            if (r3 <= 0) goto L297
            if (r3 < r5) goto L297
            if (r23 == 0) goto L292
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r9 = r1.start
            int r9 = r9.margin
            int r7 = r7 - r9
            goto L297
        L292:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r9 = r1.start
            int r9 = r9.margin
            int r7 = r7 + r9
        L297:
            if (r23 == 0) goto L29f
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r9 = r1.end
            r9.resolve(r7)
            goto L2a4
        L29f:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r9 = r1.start
            r9.resolve(r7)
        L2a4:
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r9 = r1.dimension
            int r10 = r9.value
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r11 = r1.dimensionBehavior
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r12 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r11 != r12) goto L2b5
            int r11 = r1.matchConstraintsType
            r12 = 1
            if (r11 != r12) goto L2b5
            int r10 = r9.wrapValue
        L2b5:
            if (r23 == 0) goto L2b9
            int r7 = r7 - r10
            goto L2ba
        L2b9:
            int r7 = r7 + r10
        L2ba:
            if (r23 == 0) goto L2c2
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r9 = r1.start
            r9.resolve(r7)
            goto L2c7
        L2c2:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r9 = r1.end
            r9.resolve(r7)
        L2c7:
            r9 = 1
            r1.resolved = r9
            if (r3 >= r8) goto L2dd
            if (r3 >= r6) goto L2dd
            if (r23 == 0) goto L2d7
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r1.end
            int r1 = r1.margin
            int r1 = -r1
            int r7 = r7 - r1
            goto L2dd
        L2d7:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r1.end
            int r1 = r1.margin
            int r1 = -r1
            int r7 = r7 + r1
        L2dd:
            int r3 = r3 + 1
            goto L258
        L2e1:
            r9 = r24
            if (r3 != 0) goto L378
            int r2 = r2 - r14
            r3 = 1
            int r7 = r9 + 1
            int r2 = r2 / r7
            if (r15 <= 0) goto L2ed
            r2 = 0
        L2ed:
            r7 = r21
            r3 = 0
        L2f0:
            if (r3 >= r4) goto L429
            if (r23 == 0) goto L2f9
            int r1 = r3 + 1
            int r1 = r4 - r1
            goto L2fa
        L2f9:
            r1 = r3
        L2fa:
            java.util.ArrayList<androidx.constraintlayout.core.widgets.analyzer.WidgetRun> r9 = r0.widgets
            java.lang.Object r1 = r9.get(r1)
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun r1 = (androidx.constraintlayout.core.widgets.analyzer.WidgetRun) r1
            androidx.constraintlayout.core.widgets.ConstraintWidget r9 = r1.widget
            int r9 = r9.getVisibility()
            r10 = 8
            if (r9 != r10) goto L317
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r9 = r1.start
            r9.resolve(r7)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r1.end
            r1.resolve(r7)
            goto L374
        L317:
            if (r23 == 0) goto L31b
            int r7 = r7 - r2
            goto L31c
        L31b:
            int r7 = r7 + r2
        L31c:
            if (r3 <= 0) goto L32d
            if (r3 < r5) goto L32d
            if (r23 == 0) goto L328
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r9 = r1.start
            int r9 = r9.margin
            int r7 = r7 - r9
            goto L32d
        L328:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r9 = r1.start
            int r9 = r9.margin
            int r7 = r7 + r9
        L32d:
            if (r23 == 0) goto L335
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r9 = r1.end
            r9.resolve(r7)
            goto L33a
        L335:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r9 = r1.start
            r9.resolve(r7)
        L33a:
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r9 = r1.dimension
            int r10 = r9.value
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r11 = r1.dimensionBehavior
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r12 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r11 != r12) goto L34f
            int r11 = r1.matchConstraintsType
            r12 = 1
            if (r11 != r12) goto L34f
            int r9 = r9.wrapValue
            int r10 = java.lang.Math.min(r10, r9)
        L34f:
            if (r23 == 0) goto L353
            int r7 = r7 - r10
            goto L354
        L353:
            int r7 = r7 + r10
        L354:
            if (r23 == 0) goto L35c
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r9 = r1.start
            r9.resolve(r7)
            goto L361
        L35c:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r9 = r1.end
            r9.resolve(r7)
        L361:
            if (r3 >= r8) goto L374
            if (r3 >= r6) goto L374
            if (r23 == 0) goto L36e
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r1.end
            int r1 = r1.margin
            int r1 = -r1
            int r7 = r7 - r1
            goto L374
        L36e:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r1.end
            int r1 = r1.margin
            int r1 = -r1
            int r7 = r7 + r1
        L374:
            int r3 = r3 + 1
            goto L2f0
        L378:
            r7 = 2
            if (r3 != r7) goto L429
            int r3 = r0.orientation
            if (r3 != 0) goto L386
            androidx.constraintlayout.core.widgets.ConstraintWidget r3 = r0.widget
            float r3 = r3.getHorizontalBiasPercent()
            goto L38c
        L386:
            androidx.constraintlayout.core.widgets.ConstraintWidget r3 = r0.widget
            float r3 = r3.getVerticalBiasPercent()
        L38c:
            if (r23 == 0) goto L392
            r7 = 1065353216(0x3f800000, float:1.0)
            float r3 = r7 - r3
        L392:
            int r2 = r2 - r14
            float r2 = (float) r2
            float r2 = r2 * r3
            r3 = 1056964608(0x3f000000, float:0.5)
            float r2 = r2 + r3
            int r2 = (int) r2
            if (r2 < 0) goto L39e
            if (r15 <= 0) goto L39f
        L39e:
            r2 = 0
        L39f:
            if (r23 == 0) goto L3a4
            int r7 = r21 - r2
            goto L3a6
        L3a4:
            int r7 = r21 + r2
        L3a6:
            r3 = 0
        L3a7:
            if (r3 >= r4) goto L429
            if (r23 == 0) goto L3b0
            int r1 = r3 + 1
            int r1 = r4 - r1
            goto L3b1
        L3b0:
            r1 = r3
        L3b1:
            java.util.ArrayList<androidx.constraintlayout.core.widgets.analyzer.WidgetRun> r2 = r0.widgets
            java.lang.Object r1 = r2.get(r1)
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun r1 = (androidx.constraintlayout.core.widgets.analyzer.WidgetRun) r1
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = r1.widget
            int r2 = r2.getVisibility()
            r9 = 8
            if (r2 != r9) goto L3cf
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r2 = r1.start
            r2.resolve(r7)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r1.end
            r1.resolve(r7)
            r12 = 1
            goto L425
        L3cf:
            if (r3 <= 0) goto L3e0
            if (r3 < r5) goto L3e0
            if (r23 == 0) goto L3db
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r2 = r1.start
            int r2 = r2.margin
            int r7 = r7 - r2
            goto L3e0
        L3db:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r2 = r1.start
            int r2 = r2.margin
            int r7 = r7 + r2
        L3e0:
            if (r23 == 0) goto L3e8
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r2 = r1.end
            r2.resolve(r7)
            goto L3ed
        L3e8:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r2 = r1.start
            r2.resolve(r7)
        L3ed:
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r2 = r1.dimension
            int r10 = r2.value
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r11 = r1.dimensionBehavior
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r12 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r11 != r12) goto L3ff
            int r11 = r1.matchConstraintsType
            r12 = 1
            if (r11 != r12) goto L400
            int r10 = r2.wrapValue
            goto L400
        L3ff:
            r12 = 1
        L400:
            if (r23 == 0) goto L404
            int r7 = r7 - r10
            goto L405
        L404:
            int r7 = r7 + r10
        L405:
            if (r23 == 0) goto L40d
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r2 = r1.start
            r2.resolve(r7)
            goto L412
        L40d:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r2 = r1.end
            r2.resolve(r7)
        L412:
            if (r3 >= r8) goto L425
            if (r3 >= r6) goto L425
            if (r23 == 0) goto L41f
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r1.end
            int r1 = r1.margin
            int r1 = -r1
            int r7 = r7 - r1
            goto L425
        L41f:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r1.end
            int r1 = r1.margin
            int r1 = -r1
            int r7 = r7 + r1
        L425:
            int r3 = r3 + 1
            goto L3a7
        L429:
            return
    }
}
