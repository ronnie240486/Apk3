package androidx.constraintlayout.core.widgets.analyzer;

/* JADX INFO: loaded from: classes2.dex */
public class DependencyGraph {
    private static final boolean USE_GROUPS = true;
    private androidx.constraintlayout.core.widgets.ConstraintWidgetContainer container;
    private androidx.constraintlayout.core.widgets.ConstraintWidgetContainer mContainer;
    public java.util.ArrayList<androidx.constraintlayout.core.widgets.analyzer.RunGroup> mGroups;
    private androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measure mMeasure;
    private androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measurer mMeasurer;
    private boolean mNeedBuildGraph;
    private boolean mNeedRedoMeasures;
    private java.util.ArrayList<androidx.constraintlayout.core.widgets.analyzer.WidgetRun> mRuns;
    private java.util.ArrayList<androidx.constraintlayout.core.widgets.analyzer.RunGroup> runGroups;

    public DependencyGraph(androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r2) {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.mNeedBuildGraph = r0
            r1.mNeedRedoMeasures = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.mRuns = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.runGroups = r0
            r0 = 0
            r1.mMeasurer = r0
            androidx.constraintlayout.core.widgets.analyzer.BasicMeasure$Measure r0 = new androidx.constraintlayout.core.widgets.analyzer.BasicMeasure$Measure
            r0.<init>()
            r1.mMeasure = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.mGroups = r0
            r1.container = r2
            r1.mContainer = r2
            return
    }

    private void applyGroup(androidx.constraintlayout.core.widgets.analyzer.DependencyNode r9, int r10, int r11, androidx.constraintlayout.core.widgets.analyzer.DependencyNode r12, java.util.ArrayList<androidx.constraintlayout.core.widgets.analyzer.RunGroup> r13, androidx.constraintlayout.core.widgets.analyzer.RunGroup r14) {
            r8 = this;
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun r9 = r9.run
            androidx.constraintlayout.core.widgets.analyzer.RunGroup r0 = r9.runGroup
            if (r0 != 0) goto L109
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r0 = r8.container
            androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun r1 = r0.horizontalRun
            if (r9 == r1) goto L109
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r0 = r0.verticalRun
            if (r9 != r0) goto L12
            goto L109
        L12:
            if (r14 != 0) goto L1c
            androidx.constraintlayout.core.widgets.analyzer.RunGroup r14 = new androidx.constraintlayout.core.widgets.analyzer.RunGroup
            r14.<init>(r9, r11)
            r13.add(r14)
        L1c:
            r9.runGroup = r14
            r14.add(r9)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r11 = r9.start
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.Dependency> r11 = r11.dependencies
            java.util.Iterator r11 = r11.iterator()
        L29:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L46
            java.lang.Object r0 = r11.next()
            androidx.constraintlayout.core.widgets.analyzer.Dependency r0 = (androidx.constraintlayout.core.widgets.analyzer.Dependency) r0
            boolean r1 = r0 instanceof androidx.constraintlayout.core.widgets.analyzer.DependencyNode
            if (r1 == 0) goto L29
            r1 = r0
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = (androidx.constraintlayout.core.widgets.analyzer.DependencyNode) r1
            r3 = 0
            r0 = r8
            r2 = r10
            r4 = r12
            r5 = r13
            r6 = r14
            r0.applyGroup(r1, r2, r3, r4, r5, r6)
            goto L29
        L46:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r11 = r9.end
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.Dependency> r11 = r11.dependencies
            java.util.Iterator r11 = r11.iterator()
        L4e:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L6b
            java.lang.Object r0 = r11.next()
            androidx.constraintlayout.core.widgets.analyzer.Dependency r0 = (androidx.constraintlayout.core.widgets.analyzer.Dependency) r0
            boolean r1 = r0 instanceof androidx.constraintlayout.core.widgets.analyzer.DependencyNode
            if (r1 == 0) goto L4e
            r1 = r0
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = (androidx.constraintlayout.core.widgets.analyzer.DependencyNode) r1
            r3 = 1
            r0 = r8
            r2 = r10
            r4 = r12
            r5 = r13
            r6 = r14
            r0.applyGroup(r1, r2, r3, r4, r5, r6)
            goto L4e
        L6b:
            r11 = 1
            if (r10 != r11) goto L9a
            boolean r0 = r9 instanceof androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun
            if (r0 == 0) goto L9a
            r0 = r9
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r0 = (androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun) r0
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r0.baseline
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.Dependency> r0 = r0.dependencies
            java.util.Iterator r7 = r0.iterator()
        L7d:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L9a
            java.lang.Object r0 = r7.next()
            androidx.constraintlayout.core.widgets.analyzer.Dependency r0 = (androidx.constraintlayout.core.widgets.analyzer.Dependency) r0
            boolean r1 = r0 instanceof androidx.constraintlayout.core.widgets.analyzer.DependencyNode
            if (r1 == 0) goto L7d
            r1 = r0
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = (androidx.constraintlayout.core.widgets.analyzer.DependencyNode) r1
            r3 = 2
            r0 = r8
            r2 = r10
            r4 = r12
            r5 = r13
            r6 = r14
            r0.applyGroup(r1, r2, r3, r4, r5, r6)
            goto L7d
        L9a:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r9.start
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r0 = r0.targets
            java.util.Iterator r7 = r0.iterator()
        La2:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto Lbd
            java.lang.Object r0 = r7.next()
            r1 = r0
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = (androidx.constraintlayout.core.widgets.analyzer.DependencyNode) r1
            if (r1 != r12) goto Lb3
            r14.dual = r11
        Lb3:
            r3 = 0
            r0 = r8
            r2 = r10
            r4 = r12
            r5 = r13
            r6 = r14
            r0.applyGroup(r1, r2, r3, r4, r5, r6)
            goto La2
        Lbd:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r9.end
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r0 = r0.targets
            java.util.Iterator r7 = r0.iterator()
        Lc5:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto Le0
            java.lang.Object r0 = r7.next()
            r1 = r0
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = (androidx.constraintlayout.core.widgets.analyzer.DependencyNode) r1
            if (r1 != r12) goto Ld6
            r14.dual = r11
        Ld6:
            r3 = 1
            r0 = r8
            r2 = r10
            r4 = r12
            r5 = r13
            r6 = r14
            r0.applyGroup(r1, r2, r3, r4, r5, r6)
            goto Lc5
        Le0:
            if (r10 != r11) goto L109
            boolean r11 = r9 instanceof androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun
            if (r11 == 0) goto L109
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r9 = (androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun) r9
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r9 = r9.baseline
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r9 = r9.targets
            java.util.Iterator r9 = r9.iterator()
        Lf0:
            boolean r11 = r9.hasNext()
            if (r11 == 0) goto L109
            java.lang.Object r11 = r9.next()
            r1 = r11
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = (androidx.constraintlayout.core.widgets.analyzer.DependencyNode) r1
            r3 = 2
            r0 = r8
            r2 = r10
            r4 = r12
            r5 = r13
            r6 = r14
            r0.applyGroup(r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L107
            goto Lf0
        L107:
            r9 = move-exception
            throw r9
        L109:
            return
    }

    private boolean basicMeasureWidgets(androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r17) {
            r16 = this;
            r0 = r17
            java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintWidget> r1 = r0.mChildren
            java.util.Iterator r1 = r1.iterator()
        L8:
            boolean r2 = r1.hasNext()
            r3 = 0
            if (r2 == 0) goto L342
            java.lang.Object r2 = r1.next()
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r2
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r4 = r2.mListDimensionBehaviors
            r5 = r4[r3]
            r10 = 1
            r4 = r4[r10]
            int r6 = r2.getVisibility()
            r7 = 8
            if (r6 != r7) goto L27
            r2.measured = r10
            goto L8
        L27:
            float r6 = r2.mMatchConstraintPercentWidth
            r11 = 1065353216(0x3f800000, float:1.0)
            r7 = 2
            int r6 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r6 >= 0) goto L36
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r6 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r5 != r6) goto L36
            r2.mMatchConstraintDefaultWidth = r7
        L36:
            float r6 = r2.mMatchConstraintPercentHeight
            int r6 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r6 >= 0) goto L42
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r6 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r4 != r6) goto L42
            r2.mMatchConstraintDefaultHeight = r7
        L42:
            float r6 = r2.getDimensionRatio()
            r8 = 0
            r9 = 3
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 <= 0) goto L78
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r6 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r5 != r6) goto L5b
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r8 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r4 == r8) goto L58
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r8 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            if (r4 != r8) goto L5b
        L58:
            r2.mMatchConstraintDefaultWidth = r9
            goto L78
        L5b:
            if (r4 != r6) goto L68
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r8 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r5 == r8) goto L65
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r8 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            if (r5 != r8) goto L68
        L65:
            r2.mMatchConstraintDefaultHeight = r9
            goto L78
        L68:
            if (r5 != r6) goto L78
            if (r4 != r6) goto L78
            int r6 = r2.mMatchConstraintDefaultWidth
            if (r6 != 0) goto L72
            r2.mMatchConstraintDefaultWidth = r9
        L72:
            int r6 = r2.mMatchConstraintDefaultHeight
            if (r6 != 0) goto L78
            r2.mMatchConstraintDefaultHeight = r9
        L78:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r6 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r5 != r6) goto L8e
            int r8 = r2.mMatchConstraintDefaultWidth
            if (r8 != r10) goto L8e
            androidx.constraintlayout.core.widgets.ConstraintAnchor r8 = r2.mLeft
            androidx.constraintlayout.core.widgets.ConstraintAnchor r8 = r8.mTarget
            if (r8 == 0) goto L8c
            androidx.constraintlayout.core.widgets.ConstraintAnchor r8 = r2.mRight
            androidx.constraintlayout.core.widgets.ConstraintAnchor r8 = r8.mTarget
            if (r8 != 0) goto L8e
        L8c:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r5 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
        L8e:
            r8 = r5
            if (r4 != r6) goto La3
            int r5 = r2.mMatchConstraintDefaultHeight
            if (r5 != r10) goto La3
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r2.mTop
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r5.mTarget
            if (r5 == 0) goto La1
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r2.mBottom
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r5.mTarget
            if (r5 != 0) goto La3
        La1:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r4 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
        La3:
            r12 = r4
            androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun r4 = r2.horizontalRun
            r4.dimensionBehavior = r8
            int r5 = r2.mMatchConstraintDefaultWidth
            r4.matchConstraintsType = r5
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r4 = r2.verticalRun
            r4.dimensionBehavior = r12
            int r13 = r2.mMatchConstraintDefaultHeight
            r4.matchConstraintsType = r13
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r4 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT
            if (r8 == r4) goto Lc0
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r14 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            if (r8 == r14) goto Lc0
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r14 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r8 != r14) goto Lcc
        Lc0:
            if (r12 == r4) goto L2ec
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r14 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            if (r12 == r14) goto L2ec
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r14 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r12 != r14) goto Lcc
            goto L2ec
        Lcc:
            r14 = 1056964608(0x3f000000, float:0.5)
            if (r8 != r6) goto L19e
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r15 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r12 == r15) goto Ld8
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r11 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            if (r12 != r11) goto L19e
        Ld8:
            if (r5 != r9) goto L114
            if (r12 != r15) goto Le6
            r7 = 0
            r9 = 0
            r4 = r16
            r5 = r2
            r6 = r15
            r8 = r15
            r4.measure(r5, r6, r7, r8, r9)
        Le6:
            int r9 = r2.getHeight()
            float r3 = (float) r9
            float r4 = r2.mDimensionRatio
            float r3 = r3 * r4
            float r3 = r3 + r14
            int r7 = (int) r3
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r8 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            r4 = r16
            r5 = r2
            r6 = r8
            r4.measure(r5, r6, r7, r8, r9)
            androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun r3 = r2.horizontalRun
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r3 = r3.dimension
            int r4 = r2.getWidth()
            r3.resolve(r4)
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r3 = r2.verticalRun
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r3 = r3.dimension
            int r4 = r2.getHeight()
            r3.resolve(r4)
            r2.measured = r10
            goto L8
        L114:
            if (r5 != r10) goto L12c
            r7 = 0
            r9 = 0
            r4 = r16
            r5 = r2
            r6 = r15
            r8 = r12
            r4.measure(r5, r6, r7, r8, r9)
            androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun r3 = r2.horizontalRun
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r3 = r3.dimension
            int r2 = r2.getWidth()
            r3.wrapValue = r2
            goto L8
        L12c:
            if (r5 != r7) goto L16c
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r11 = r0.mListDimensionBehaviors
            r15 = r11[r3]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r7 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            if (r15 == r7) goto L13a
            r11 = r11[r3]
            if (r11 != r4) goto L19e
        L13a:
            float r3 = r2.mMatchConstraintPercentWidth
            int r4 = r17.getWidth()
            float r4 = (float) r4
            float r3 = r3 * r4
            float r3 = r3 + r14
            int r3 = (int) r3
            int r9 = r2.getHeight()
            r4 = r16
            r5 = r2
            r6 = r7
            r7 = r3
            r8 = r12
            r4.measure(r5, r6, r7, r8, r9)
            androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun r3 = r2.horizontalRun
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r3 = r3.dimension
            int r4 = r2.getWidth()
            r3.resolve(r4)
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r3 = r2.verticalRun
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r3 = r3.dimension
            int r4 = r2.getHeight()
            r3.resolve(r4)
            r2.measured = r10
            goto L8
        L16c:
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r7 = r2.mListAnchors
            r11 = r7[r3]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r11.mTarget
            if (r11 == 0) goto L17a
            r7 = r7[r10]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r7 = r7.mTarget
            if (r7 != 0) goto L19e
        L17a:
            r7 = 0
            r9 = 0
            r4 = r16
            r5 = r2
            r6 = r15
            r8 = r12
            r4.measure(r5, r6, r7, r8, r9)
            androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun r3 = r2.horizontalRun
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r3 = r3.dimension
            int r4 = r2.getWidth()
            r3.resolve(r4)
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r3 = r2.verticalRun
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r3 = r3.dimension
            int r4 = r2.getHeight()
            r3.resolve(r4)
            r2.measured = r10
            goto L8
        L19e:
            if (r12 != r6) goto L27a
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r11 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r8 == r11) goto L1a8
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r7 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            if (r8 != r7) goto L27a
        L1a8:
            if (r13 != r9) goto L1ef
            if (r8 != r11) goto L1b6
            r7 = 0
            r9 = 0
            r4 = r16
            r5 = r2
            r6 = r11
            r8 = r11
            r4.measure(r5, r6, r7, r8, r9)
        L1b6:
            int r7 = r2.getWidth()
            float r3 = r2.mDimensionRatio
            int r4 = r2.getDimensionRatioSide()
            r5 = -1
            if (r4 != r5) goto L1c7
            r4 = 1065353216(0x3f800000, float:1.0)
            float r3 = r4 / r3
        L1c7:
            float r4 = (float) r7
            float r4 = r4 * r3
            float r4 = r4 + r14
            int r9 = (int) r4
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r8 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            r4 = r16
            r5 = r2
            r6 = r8
            r4.measure(r5, r6, r7, r8, r9)
            androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun r3 = r2.horizontalRun
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r3 = r3.dimension
            int r4 = r2.getWidth()
            r3.resolve(r4)
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r3 = r2.verticalRun
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r3 = r3.dimension
            int r4 = r2.getHeight()
            r3.resolve(r4)
            r2.measured = r10
            goto L8
        L1ef:
            if (r13 != r10) goto L207
            r7 = 0
            r9 = 0
            r4 = r16
            r5 = r2
            r6 = r8
            r8 = r11
            r4.measure(r5, r6, r7, r8, r9)
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r3 = r2.verticalRun
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r3 = r3.dimension
            int r2 = r2.getHeight()
            r3.wrapValue = r2
            goto L8
        L207:
            r7 = 2
            if (r13 != r7) goto L247
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r7 = r0.mListDimensionBehaviors
            r9 = r7[r10]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r11 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            if (r9 == r11) goto L216
            r7 = r7[r10]
            if (r7 != r4) goto L27a
        L216:
            float r3 = r2.mMatchConstraintPercentHeight
            int r7 = r2.getWidth()
            int r4 = r17.getHeight()
            float r4 = (float) r4
            float r3 = r3 * r4
            float r3 = r3 + r14
            int r9 = (int) r3
            r4 = r16
            r5 = r2
            r6 = r8
            r8 = r11
            r4.measure(r5, r6, r7, r8, r9)
            androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun r3 = r2.horizontalRun
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r3 = r3.dimension
            int r4 = r2.getWidth()
            r3.resolve(r4)
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r3 = r2.verticalRun
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r3 = r3.dimension
            int r4 = r2.getHeight()
            r3.resolve(r4)
            r2.measured = r10
            goto L8
        L247:
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r4 = r2.mListAnchors
            r7 = 2
            r15 = r4[r7]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r7 = r15.mTarget
            if (r7 == 0) goto L256
            r4 = r4[r9]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r4.mTarget
            if (r4 != 0) goto L27a
        L256:
            r7 = 0
            r9 = 0
            r4 = r16
            r5 = r2
            r6 = r11
            r8 = r12
            r4.measure(r5, r6, r7, r8, r9)
            androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun r3 = r2.horizontalRun
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r3 = r3.dimension
            int r4 = r2.getWidth()
            r3.resolve(r4)
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r3 = r2.verticalRun
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r3 = r3.dimension
            int r4 = r2.getHeight()
            r3.resolve(r4)
            r2.measured = r10
            goto L8
        L27a:
            if (r8 != r6) goto L8
            if (r12 != r6) goto L8
            if (r5 == r10) goto L2cb
            if (r13 != r10) goto L283
            goto L2cb
        L283:
            r4 = 2
            if (r13 != r4) goto L8
            if (r5 != r4) goto L8
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r4 = r0.mListDimensionBehaviors
            r3 = r4[r3]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r8 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            if (r3 != r8) goto L8
            r3 = r4[r10]
            if (r3 != r8) goto L8
            float r3 = r2.mMatchConstraintPercentWidth
            float r4 = r2.mMatchConstraintPercentHeight
            int r5 = r17.getWidth()
            float r5 = (float) r5
            float r3 = r3 * r5
            float r3 = r3 + r14
            int r7 = (int) r3
            int r3 = r17.getHeight()
            float r3 = (float) r3
            float r4 = r4 * r3
            float r4 = r4 + r14
            int r9 = (int) r4
            r4 = r16
            r5 = r2
            r6 = r8
            r4.measure(r5, r6, r7, r8, r9)
            androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun r3 = r2.horizontalRun
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r3 = r3.dimension
            int r4 = r2.getWidth()
            r3.resolve(r4)
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r3 = r2.verticalRun
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r3 = r3.dimension
            int r4 = r2.getHeight()
            r3.resolve(r4)
            r2.measured = r10
            goto L8
        L2cb:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r8 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            r7 = 0
            r9 = 0
            r4 = r16
            r5 = r2
            r6 = r8
            r4.measure(r5, r6, r7, r8, r9)
            androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun r3 = r2.horizontalRun
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r3 = r3.dimension
            int r4 = r2.getWidth()
            r3.wrapValue = r4
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r3 = r2.verticalRun
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r3 = r3.dimension
            int r2 = r2.getHeight()
            r3.wrapValue = r2
            goto L8
        L2ec:
            int r3 = r2.getWidth()
            if (r8 != r4) goto L305
            int r3 = r17.getWidth()
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r2.mLeft
            int r5 = r5.mMargin
            int r3 = r3 - r5
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r2.mRight
            int r5 = r5.mMargin
            int r3 = r3 - r5
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r5 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            r7 = r3
            r6 = r5
            goto L307
        L305:
            r7 = r3
            r6 = r8
        L307:
            int r3 = r2.getHeight()
            if (r12 != r4) goto L320
            int r3 = r17.getHeight()
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r2.mTop
            int r4 = r4.mMargin
            int r3 = r3 - r4
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r2.mBottom
            int r4 = r4.mMargin
            int r3 = r3 - r4
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r4 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            r9 = r3
            r8 = r4
            goto L322
        L320:
            r9 = r3
            r8 = r12
        L322:
            r4 = r16
            r5 = r2
            r4.measure(r5, r6, r7, r8, r9)
            androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun r3 = r2.horizontalRun
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r3 = r3.dimension
            int r4 = r2.getWidth()
            r3.resolve(r4)
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r3 = r2.verticalRun
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r3 = r3.dimension
            int r4 = r2.getHeight()
            r3.resolve(r4)
            r2.measured = r10
            goto L8
        L342:
            return r3
    }

    private int computeWrap(androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r7, int r8) {
            r6 = this;
            java.util.ArrayList<androidx.constraintlayout.core.widgets.analyzer.RunGroup> r0 = r6.mGroups
            int r0 = r0.size()
            r1 = 0
            r3 = 0
        L9:
            if (r3 >= r0) goto L1e
            java.util.ArrayList<androidx.constraintlayout.core.widgets.analyzer.RunGroup> r4 = r6.mGroups
            java.lang.Object r4 = r4.get(r3)
            androidx.constraintlayout.core.widgets.analyzer.RunGroup r4 = (androidx.constraintlayout.core.widgets.analyzer.RunGroup) r4
            long r4 = r4.computeWrapSize(r7, r8)
            long r1 = java.lang.Math.max(r1, r4)
            int r3 = r3 + 1
            goto L9
        L1e:
            int r7 = (int) r1
            return r7
    }

    private void displayGraph() {
            r4 = this;
            java.util.ArrayList<androidx.constraintlayout.core.widgets.analyzer.WidgetRun> r0 = r4.mRuns
            java.util.Iterator r0 = r0.iterator()
            java.lang.String r1 = "digraph {\n"
        L8:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L19
            java.lang.Object r2 = r0.next()
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun r2 = (androidx.constraintlayout.core.widgets.analyzer.WidgetRun) r2
            java.lang.String r1 = r4.generateDisplayGraph(r2, r1)
            goto L8
        L19:
            java.lang.String r0 = "\n}\n"
            java.lang.String r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r0)
            java.io.PrintStream r1 = java.lang.System.out
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "content:<<\n"
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = "\n>>"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.println(r0)
            return
    }

    private void findGroup(androidx.constraintlayout.core.widgets.analyzer.WidgetRun r11, int r12, java.util.ArrayList<androidx.constraintlayout.core.widgets.analyzer.RunGroup> r13) {
            r10 = this;
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r11.start
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.Dependency> r0 = r0.dependencies
            java.util.Iterator r0 = r0.iterator()
        L8:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L39
            java.lang.Object r1 = r0.next()
            androidx.constraintlayout.core.widgets.analyzer.Dependency r1 = (androidx.constraintlayout.core.widgets.analyzer.Dependency) r1
            boolean r2 = r1 instanceof androidx.constraintlayout.core.widgets.analyzer.DependencyNode
            if (r2 == 0) goto L26
            r4 = r1
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r4 = (androidx.constraintlayout.core.widgets.analyzer.DependencyNode) r4
            r6 = 0
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r7 = r11.end
            r9 = 0
            r3 = r10
            r5 = r12
            r8 = r13
            r3.applyGroup(r4, r5, r6, r7, r8, r9)
            goto L8
        L26:
            boolean r2 = r1 instanceof androidx.constraintlayout.core.widgets.analyzer.WidgetRun
            if (r2 == 0) goto L8
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun r1 = (androidx.constraintlayout.core.widgets.analyzer.WidgetRun) r1
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r3 = r1.start
            r5 = 0
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r6 = r11.end
            r8 = 0
            r2 = r10
            r4 = r12
            r7 = r13
            r2.applyGroup(r3, r4, r5, r6, r7, r8)
            goto L8
        L39:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r11.end
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.Dependency> r0 = r0.dependencies
            java.util.Iterator r0 = r0.iterator()
        L41:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L72
            java.lang.Object r1 = r0.next()
            androidx.constraintlayout.core.widgets.analyzer.Dependency r1 = (androidx.constraintlayout.core.widgets.analyzer.Dependency) r1
            boolean r2 = r1 instanceof androidx.constraintlayout.core.widgets.analyzer.DependencyNode
            if (r2 == 0) goto L5f
            r4 = r1
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r4 = (androidx.constraintlayout.core.widgets.analyzer.DependencyNode) r4
            r6 = 1
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r7 = r11.start
            r9 = 0
            r3 = r10
            r5 = r12
            r8 = r13
            r3.applyGroup(r4, r5, r6, r7, r8, r9)
            goto L41
        L5f:
            boolean r2 = r1 instanceof androidx.constraintlayout.core.widgets.analyzer.WidgetRun
            if (r2 == 0) goto L41
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun r1 = (androidx.constraintlayout.core.widgets.analyzer.WidgetRun) r1
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r3 = r1.end
            r5 = 1
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r6 = r11.start
            r8 = 0
            r2 = r10
            r4 = r12
            r7 = r13
            r2.applyGroup(r3, r4, r5, r6, r7, r8)
            goto L41
        L72:
            r0 = 1
            if (r12 != r0) goto L9c
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r11 = (androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun) r11
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r11 = r11.baseline
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.Dependency> r11 = r11.dependencies
            java.util.Iterator r11 = r11.iterator()
        L7f:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L9c
            java.lang.Object r0 = r11.next()
            androidx.constraintlayout.core.widgets.analyzer.Dependency r0 = (androidx.constraintlayout.core.widgets.analyzer.Dependency) r0
            boolean r1 = r0 instanceof androidx.constraintlayout.core.widgets.analyzer.DependencyNode
            if (r1 == 0) goto L7f
            r3 = r0
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r3 = (androidx.constraintlayout.core.widgets.analyzer.DependencyNode) r3
            r5 = 2
            r6 = 0
            r8 = 0
            r2 = r10
            r4 = r12
            r7 = r13
            r2.applyGroup(r3, r4, r5, r6, r7, r8)
            goto L7f
        L9c:
            return
    }

    private java.lang.String generateChainDisplayGraph(androidx.constraintlayout.core.widgets.analyzer.ChainRun r6, java.lang.String r7) {
            r5 = this;
            int r0 = r6.orientation
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "subgraph "
            r1.<init>(r2)
            java.lang.String r2 = "cluster_"
            r1.append(r2)
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = r6.widget
            java.lang.String r2 = r2.getDebugName()
            r1.append(r2)
            if (r0 != 0) goto L20
            java.lang.String r2 = "_h"
            r1.append(r2)
            goto L25
        L20:
            java.lang.String r2 = "_v"
            r1.append(r2)
        L25:
            java.lang.String r2 = " {\n"
            r1.append(r2)
            java.util.ArrayList<androidx.constraintlayout.core.widgets.analyzer.WidgetRun> r6 = r6.widgets
            java.util.Iterator r6 = r6.iterator()
            java.lang.String r2 = ""
        L32:
            boolean r3 = r6.hasNext()
            if (r3 == 0) goto L5e
            java.lang.Object r3 = r6.next()
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun r3 = (androidx.constraintlayout.core.widgets.analyzer.WidgetRun) r3
            androidx.constraintlayout.core.widgets.ConstraintWidget r4 = r3.widget
            java.lang.String r4 = r4.getDebugName()
            r1.append(r4)
            if (r0 != 0) goto L4f
            java.lang.String r4 = "_HORIZONTAL"
            r1.append(r4)
            goto L54
        L4f:
            java.lang.String r4 = "_VERTICAL"
            r1.append(r4)
        L54:
            java.lang.String r4 = ";\n"
            r1.append(r4)
            java.lang.String r2 = r5.generateDisplayGraph(r3, r2)
            goto L32
        L5e:
            java.lang.String r6 = "}\n"
            r1.append(r6)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r7)
            r6.append(r2)
            r6.append(r1)
            java.lang.String r6 = r6.toString()
            return r6
    }

    private java.lang.String generateDisplayGraph(androidx.constraintlayout.core.widgets.analyzer.WidgetRun r10, java.lang.String r11) {
            r9 = this;
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r10.start
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r10.end
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r11)
            boolean r3 = r10 instanceof androidx.constraintlayout.core.widgets.analyzer.HelperReferences
            if (r3 != 0) goto L2d
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.Dependency> r3 = r0.dependencies
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L2d
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.Dependency> r3 = r1.dependencies
            boolean r3 = r3.isEmpty()
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r4 = r0.targets
            boolean r4 = r4.isEmpty()
            r3 = r3 & r4
            if (r3 == 0) goto L2d
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r3 = r1.targets
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L2d
            return r11
        L2d:
            java.lang.String r3 = r9.nodeDefinition(r10)
            r2.append(r3)
            boolean r3 = r9.isCenteredConnection(r0, r1)
            java.lang.String r11 = r9.generateDisplayNode(r0, r3, r11)
            java.lang.String r11 = r9.generateDisplayNode(r1, r3, r11)
            boolean r4 = r10 instanceof androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun
            if (r4 == 0) goto L4d
            r5 = r10
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r5 = (androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun) r5
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r5 = r5.baseline
            java.lang.String r11 = r9.generateDisplayNode(r5, r3, r11)
        L4d:
            boolean r3 = r10 instanceof androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun
            r5 = 0
            java.lang.String r6 = " -> "
            java.lang.String r7 = "\n"
            if (r3 != 0) goto Lff
            boolean r3 = r10 instanceof androidx.constraintlayout.core.widgets.analyzer.ChainRun
            if (r3 == 0) goto L63
            r8 = r10
            androidx.constraintlayout.core.widgets.analyzer.ChainRun r8 = (androidx.constraintlayout.core.widgets.analyzer.ChainRun) r8
            int r8 = r8.orientation
            if (r8 != 0) goto L63
            goto Lff
        L63:
            if (r4 != 0) goto L6f
            if (r3 == 0) goto L18b
            r3 = r10
            androidx.constraintlayout.core.widgets.analyzer.ChainRun r3 = (androidx.constraintlayout.core.widgets.analyzer.ChainRun) r3
            int r3 = r3.orientation
            r4 = 1
            if (r3 != r4) goto L18b
        L6f:
            androidx.constraintlayout.core.widgets.ConstraintWidget r3 = r10.widget
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r3 = r3.getVerticalDimensionBehaviour()
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r4 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            if (r3 == r4) goto Lad
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r4 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r3 != r4) goto L7e
            goto Lad
        L7e:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r0 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r3 != r0) goto L18b
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r10.widget
            float r0 = r0.getDimensionRatio()
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 <= 0) goto L18b
            r2.append(r7)
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r10.widget
            java.lang.String r0 = r0.getDebugName()
            r2.append(r0)
            java.lang.String r0 = "_VERTICAL -> "
            r2.append(r0)
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r10.widget
            java.lang.String r0 = r0.getDebugName()
            r2.append(r0)
            java.lang.String r0 = "_HORIZONTAL;\n"
            r2.append(r0)
            goto L18b
        Lad:
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r3 = r0.targets
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto Ld6
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r3 = r1.targets
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto Ld6
            r2.append(r7)
            java.lang.String r1 = r1.name()
            r2.append(r1)
            r2.append(r6)
            java.lang.String r0 = r0.name()
            r2.append(r0)
            r2.append(r7)
            goto L18b
        Ld6:
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r3 = r0.targets
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L18b
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r3 = r1.targets
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L18b
            r2.append(r7)
            java.lang.String r0 = r0.name()
            r2.append(r0)
            r2.append(r6)
            java.lang.String r0 = r1.name()
            r2.append(r0)
            r2.append(r7)
            goto L18b
        Lff:
            androidx.constraintlayout.core.widgets.ConstraintWidget r3 = r10.widget
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r3 = r3.getHorizontalDimensionBehaviour()
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r4 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            if (r3 == r4) goto L13c
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r4 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r3 != r4) goto L10e
            goto L13c
        L10e:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r0 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r3 != r0) goto L18b
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r10.widget
            float r0 = r0.getDimensionRatio()
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 <= 0) goto L18b
            r2.append(r7)
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r10.widget
            java.lang.String r0 = r0.getDebugName()
            r2.append(r0)
            java.lang.String r0 = "_HORIZONTAL -> "
            r2.append(r0)
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r10.widget
            java.lang.String r0 = r0.getDebugName()
            r2.append(r0)
            java.lang.String r0 = "_VERTICAL;\n"
            r2.append(r0)
            goto L18b
        L13c:
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r3 = r0.targets
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L164
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r3 = r1.targets
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L164
            r2.append(r7)
            java.lang.String r1 = r1.name()
            r2.append(r1)
            r2.append(r6)
            java.lang.String r0 = r0.name()
            r2.append(r0)
            r2.append(r7)
            goto L18b
        L164:
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r3 = r0.targets
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L18b
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r3 = r1.targets
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L18b
            r2.append(r7)
            java.lang.String r0 = r0.name()
            r2.append(r0)
            r2.append(r6)
            java.lang.String r0 = r1.name()
            r2.append(r0)
            r2.append(r7)
        L18b:
            boolean r0 = r10 instanceof androidx.constraintlayout.core.widgets.analyzer.ChainRun
            if (r0 == 0) goto L196
            androidx.constraintlayout.core.widgets.analyzer.ChainRun r10 = (androidx.constraintlayout.core.widgets.analyzer.ChainRun) r10
            java.lang.String r10 = r9.generateChainDisplayGraph(r10, r11)
            return r10
        L196:
            java.lang.String r10 = r2.toString()
            return r10
    }

    private java.lang.String generateDisplayNode(androidx.constraintlayout.core.widgets.analyzer.DependencyNode r6, boolean r7, java.lang.String r8) {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r8)
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r8 = r6.targets
            java.util.Iterator r8 = r8.iterator()
        Lb:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L93
            java.lang.Object r1 = r8.next()
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = (androidx.constraintlayout.core.widgets.analyzer.DependencyNode) r1
            java.lang.String r2 = "\n"
            java.lang.StringBuilder r3 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r2)
            java.lang.String r4 = r6.name()
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = " -> "
            java.lang.StringBuilder r3 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m24m(r3, r4)
            java.lang.String r1 = r1.name()
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            int r3 = r6.margin
            if (r3 > 0) goto L45
            if (r7 != 0) goto L45
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun r3 = r6.run
            boolean r3 = r3 instanceof androidx.constraintlayout.core.widgets.analyzer.HelperReferences
            if (r3 == 0) goto L7f
        L45:
            java.lang.String r3 = "["
            java.lang.String r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r3)
            int r3 = r6.margin
            if (r3 <= 0) goto L65
            java.lang.String r3 = "label=\""
            java.lang.StringBuilder r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m24m(r1, r3)
            int r3 = r6.margin
            java.lang.String r4 = "\""
            java.lang.String r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r3, r4)
            if (r7 == 0) goto L65
            java.lang.String r3 = ","
            java.lang.String r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r3)
        L65:
            if (r7 == 0) goto L6d
            java.lang.String r3 = " style=dashed "
            java.lang.String r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r3)
        L6d:
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun r3 = r6.run
            boolean r3 = r3 instanceof androidx.constraintlayout.core.widgets.analyzer.HelperReferences
            if (r3 == 0) goto L79
            java.lang.String r3 = " style=bold,color=gray "
            java.lang.String r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r3)
        L79:
            java.lang.String r3 = "]"
            java.lang.String r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r3)
        L7f:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r1)
            r3.append(r2)
            java.lang.String r1 = r3.toString()
            r0.append(r1)
            goto Lb
        L93:
            java.lang.String r6 = r0.toString()
            return r6
    }

    private boolean isCenteredConnection(androidx.constraintlayout.core.widgets.analyzer.DependencyNode r5, androidx.constraintlayout.core.widgets.analyzer.DependencyNode r6) {
            r4 = this;
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r0 = r5.targets
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
            r2 = 0
        L8:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L19
            java.lang.Object r3 = r0.next()
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r3 = (androidx.constraintlayout.core.widgets.analyzer.DependencyNode) r3
            if (r3 == r6) goto L8
            int r2 = r2 + 1
            goto L8
        L19:
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r6 = r6.targets
            java.util.Iterator r6 = r6.iterator()
            r0 = 0
        L20:
            boolean r3 = r6.hasNext()
            if (r3 == 0) goto L31
            java.lang.Object r3 = r6.next()
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r3 = (androidx.constraintlayout.core.widgets.analyzer.DependencyNode) r3
            if (r3 == r5) goto L20
            int r0 = r0 + 1
            goto L20
        L31:
            if (r2 <= 0) goto L36
            if (r0 <= 0) goto L36
            r1 = 1
        L36:
            return r1
    }

    private void measure(androidx.constraintlayout.core.widgets.ConstraintWidget r2, androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour r3, int r4, androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour r5, int r6) {
            r1 = this;
            androidx.constraintlayout.core.widgets.analyzer.BasicMeasure$Measure r0 = r1.mMeasure
            r0.horizontalBehavior = r3
            r0.verticalBehavior = r5
            r0.horizontalDimension = r4
            r0.verticalDimension = r6
            androidx.constraintlayout.core.widgets.analyzer.BasicMeasure$Measurer r3 = r1.mMeasurer
            r3.measure(r2, r0)
            androidx.constraintlayout.core.widgets.analyzer.BasicMeasure$Measure r3 = r1.mMeasure
            int r3 = r3.measuredWidth
            r2.setWidth(r3)
            androidx.constraintlayout.core.widgets.analyzer.BasicMeasure$Measure r3 = r1.mMeasure
            int r3 = r3.measuredHeight
            r2.setHeight(r3)
            androidx.constraintlayout.core.widgets.analyzer.BasicMeasure$Measure r3 = r1.mMeasure
            boolean r3 = r3.measuredHasBaseline
            r2.setHasBaseline(r3)
            androidx.constraintlayout.core.widgets.analyzer.BasicMeasure$Measure r3 = r1.mMeasure
            int r3 = r3.measuredBaseline
            r2.setBaselineDistance(r3)
            return
    }

    private java.lang.String nodeDefinition(androidx.constraintlayout.core.widgets.analyzer.WidgetRun r10) {
            r9 = this;
            boolean r0 = r10 instanceof androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = r10.widget
            java.lang.String r1 = r1.getDebugName()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r1)
            androidx.constraintlayout.core.widgets.ConstraintWidget r3 = r10.widget
            if (r0 != 0) goto L16
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r3 = r3.getHorizontalDimensionBehaviour()
            goto L1a
        L16:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r3 = r3.getVerticalDimensionBehaviour()
        L1a:
            androidx.constraintlayout.core.widgets.analyzer.RunGroup r4 = r10.runGroup
            if (r0 != 0) goto L24
            java.lang.String r5 = "_HORIZONTAL"
            r2.append(r5)
            goto L29
        L24:
            java.lang.String r5 = "_VERTICAL"
            r2.append(r5)
        L29:
            java.lang.String r5 = " [shape=none, label=<"
            r2.append(r5)
            java.lang.String r5 = "<TABLE BORDER=\"0\" CELLSPACING=\"0\" CELLPADDING=\"2\">"
            r2.append(r5)
            java.lang.String r5 = "  <TR>"
            r2.append(r5)
            java.lang.String r5 = " BGCOLOR=\"green\""
            java.lang.String r6 = "    <TD "
            if (r0 != 0) goto L50
            r2.append(r6)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r7 = r10.start
            boolean r7 = r7.resolved
            if (r7 == 0) goto L4a
            r2.append(r5)
        L4a:
            java.lang.String r7 = " PORT=\"LEFT\" BORDER=\"1\">L</TD>"
            r2.append(r7)
            goto L61
        L50:
            r2.append(r6)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r7 = r10.start
            boolean r7 = r7.resolved
            if (r7 == 0) goto L5c
            r2.append(r5)
        L5c:
            java.lang.String r7 = " PORT=\"TOP\" BORDER=\"1\">T</TD>"
            r2.append(r7)
        L61:
            java.lang.String r7 = "    <TD BORDER=\"1\" "
            r2.append(r7)
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r7 = r10.dimension
            boolean r7 = r7.resolved
            if (r7 == 0) goto L78
            androidx.constraintlayout.core.widgets.ConstraintWidget r8 = r10.widget
            boolean r8 = r8.measured
            if (r8 != 0) goto L78
            java.lang.String r7 = " BGCOLOR=\"green\" "
            r2.append(r7)
            goto L8b
        L78:
            if (r7 == 0) goto L80
            java.lang.String r7 = " BGCOLOR=\"lightgray\" "
            r2.append(r7)
            goto L8b
        L80:
            androidx.constraintlayout.core.widgets.ConstraintWidget r7 = r10.widget
            boolean r7 = r7.measured
            if (r7 == 0) goto L8b
            java.lang.String r7 = " BGCOLOR=\"yellow\" "
            r2.append(r7)
        L8b:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r7 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r3 != r7) goto L95
            java.lang.String r3 = "style=\"dashed\""
            r2.append(r3)
        L95:
            java.lang.String r3 = ">"
            r2.append(r3)
            r2.append(r1)
            if (r4 == 0) goto Lba
            java.lang.String r1 = " ["
            r2.append(r1)
            int r1 = r4.groupIndex
            int r1 = r1 + 1
            r2.append(r1)
            java.lang.String r1 = "/"
            r2.append(r1)
            int r1 = androidx.constraintlayout.core.widgets.analyzer.RunGroup.index
            r2.append(r1)
            java.lang.String r1 = "]"
            r2.append(r1)
        Lba:
            java.lang.String r1 = " </TD>"
            r2.append(r1)
            if (r0 != 0) goto Ld3
            r2.append(r6)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r10 = r10.end
            boolean r10 = r10.resolved
            if (r10 == 0) goto Lcd
            r2.append(r5)
        Lcd:
            java.lang.String r10 = " PORT=\"RIGHT\" BORDER=\"1\">R</TD>"
            r2.append(r10)
            goto Lf8
        Ld3:
            r2.append(r6)
            r0 = r10
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r0 = (androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun) r0
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r0.baseline
            boolean r0 = r0.resolved
            if (r0 == 0) goto Le2
            r2.append(r5)
        Le2:
            java.lang.String r0 = " PORT=\"BASELINE\" BORDER=\"1\">b</TD>"
            r2.append(r0)
            r2.append(r6)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r10 = r10.end
            boolean r10 = r10.resolved
            if (r10 == 0) goto Lf3
            r2.append(r5)
        Lf3:
            java.lang.String r10 = " PORT=\"BOTTOM\" BORDER=\"1\">B</TD>"
            r2.append(r10)
        Lf8:
            java.lang.String r10 = "  </TR></TABLE>"
            java.lang.String r0 = ">];\n"
            java.lang.String r10 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r2, r10, r0)
            return r10
    }

    public void buildGraph() {
            r4 = this;
            java.util.ArrayList<androidx.constraintlayout.core.widgets.analyzer.WidgetRun> r0 = r4.mRuns
            r4.buildGraph(r0)
            java.util.ArrayList<androidx.constraintlayout.core.widgets.analyzer.RunGroup> r0 = r4.mGroups
            r0.clear()
            r0 = 0
            androidx.constraintlayout.core.widgets.analyzer.RunGroup.index = r0
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r1 = r4.container
            androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun r1 = r1.horizontalRun
            java.util.ArrayList<androidx.constraintlayout.core.widgets.analyzer.RunGroup> r2 = r4.mGroups
            r4.findGroup(r1, r0, r2)
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r1 = r4.container
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r1 = r1.verticalRun
            java.util.ArrayList<androidx.constraintlayout.core.widgets.analyzer.RunGroup> r2 = r4.mGroups
            r3 = 1
            r4.findGroup(r1, r3, r2)
            r4.mNeedBuildGraph = r0
            return
    }

    public void buildGraph(java.util.ArrayList<androidx.constraintlayout.core.widgets.analyzer.WidgetRun> r6) {
            r5 = this;
            r6.clear()
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r0 = r5.mContainer
            androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun r0 = r0.horizontalRun
            r0.clear()
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r0 = r5.mContainer
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r0 = r0.verticalRun
            r0.clear()
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r0 = r5.mContainer
            androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun r0 = r0.horizontalRun
            r6.add(r0)
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r0 = r5.mContainer
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r0 = r0.verticalRun
            r6.add(r0)
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r0 = r5.mContainer
            java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintWidget> r0 = r0.mChildren
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
        L28:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L96
            java.lang.Object r2 = r0.next()
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r2
            boolean r3 = r2 instanceof androidx.constraintlayout.core.widgets.Guideline
            if (r3 == 0) goto L41
            androidx.constraintlayout.core.widgets.analyzer.GuidelineReference r3 = new androidx.constraintlayout.core.widgets.analyzer.GuidelineReference
            r3.<init>(r2)
            r6.add(r3)
            goto L28
        L41:
            boolean r3 = r2.isInHorizontalChain()
            if (r3 == 0) goto L60
            androidx.constraintlayout.core.widgets.analyzer.ChainRun r3 = r2.horizontalChainRun
            if (r3 != 0) goto L53
            androidx.constraintlayout.core.widgets.analyzer.ChainRun r3 = new androidx.constraintlayout.core.widgets.analyzer.ChainRun
            r4 = 0
            r3.<init>(r2, r4)
            r2.horizontalChainRun = r3
        L53:
            if (r1 != 0) goto L5a
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
        L5a:
            androidx.constraintlayout.core.widgets.analyzer.ChainRun r3 = r2.horizontalChainRun
            r1.add(r3)
            goto L65
        L60:
            androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun r3 = r2.horizontalRun
            r6.add(r3)
        L65:
            boolean r3 = r2.isInVerticalChain()
            if (r3 == 0) goto L84
            androidx.constraintlayout.core.widgets.analyzer.ChainRun r3 = r2.verticalChainRun
            if (r3 != 0) goto L77
            androidx.constraintlayout.core.widgets.analyzer.ChainRun r3 = new androidx.constraintlayout.core.widgets.analyzer.ChainRun
            r4 = 1
            r3.<init>(r2, r4)
            r2.verticalChainRun = r3
        L77:
            if (r1 != 0) goto L7e
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
        L7e:
            androidx.constraintlayout.core.widgets.analyzer.ChainRun r3 = r2.verticalChainRun
            r1.add(r3)
            goto L89
        L84:
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r3 = r2.verticalRun
            r6.add(r3)
        L89:
            boolean r3 = r2 instanceof androidx.constraintlayout.core.widgets.HelperWidget
            if (r3 == 0) goto L28
            androidx.constraintlayout.core.widgets.analyzer.HelperReferences r3 = new androidx.constraintlayout.core.widgets.analyzer.HelperReferences
            r3.<init>(r2)
            r6.add(r3)
            goto L28
        L96:
            if (r1 == 0) goto L9b
            r6.addAll(r1)
        L9b:
            java.util.Iterator r0 = r6.iterator()
        L9f:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Laf
            java.lang.Object r1 = r0.next()
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun r1 = (androidx.constraintlayout.core.widgets.analyzer.WidgetRun) r1
            r1.clear()
            goto L9f
        Laf:
            java.util.Iterator r6 = r6.iterator()
        Lb3:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto Lca
            java.lang.Object r0 = r6.next()
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun r0 = (androidx.constraintlayout.core.widgets.analyzer.WidgetRun) r0
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = r0.widget
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r2 = r5.mContainer
            if (r1 != r2) goto Lc6
            goto Lb3
        Lc6:
            r0.apply()
            goto Lb3
        Lca:
            return
    }

    public void defineTerminalWidgets(androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour r7, androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour r8) {
            r6 = this;
            boolean r0 = r6.mNeedBuildGraph
            if (r0 == 0) goto L4e
            r6.buildGraph()
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r0 = r6.container
            java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintWidget> r0 = r0.mChildren
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
            r2 = 0
        L11:
            boolean r3 = r0.hasNext()
            r4 = 1
            if (r3 == 0) goto L2a
            java.lang.Object r3 = r0.next()
            androidx.constraintlayout.core.widgets.ConstraintWidget r3 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r3
            boolean[] r5 = r3.isTerminalWidget
            r5[r1] = r4
            r5[r4] = r4
            boolean r3 = r3 instanceof androidx.constraintlayout.core.widgets.Barrier
            if (r3 == 0) goto L11
            r2 = 1
            goto L11
        L2a:
            if (r2 != 0) goto L4e
            java.util.ArrayList<androidx.constraintlayout.core.widgets.analyzer.RunGroup> r0 = r6.mGroups
            java.util.Iterator r0 = r0.iterator()
        L32:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L4e
            java.lang.Object r2 = r0.next()
            androidx.constraintlayout.core.widgets.analyzer.RunGroup r2 = (androidx.constraintlayout.core.widgets.analyzer.RunGroup) r2
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r3 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r7 != r3) goto L44
            r5 = 1
            goto L45
        L44:
            r5 = 0
        L45:
            if (r8 != r3) goto L49
            r3 = 1
            goto L4a
        L49:
            r3 = 0
        L4a:
            r2.defineTerminalWidgets(r5, r3)
            goto L32
        L4e:
            return
    }

    public boolean directMeasure(boolean r10) {
            r9 = this;
            r0 = 1
            r10 = r10 & r0
            boolean r1 = r9.mNeedBuildGraph
            r2 = 0
            if (r1 != 0) goto Lb
            boolean r1 = r9.mNeedRedoMeasures
            if (r1 == 0) goto L46
        Lb:
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r1 = r9.container
            java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintWidget> r1 = r1.mChildren
            java.util.Iterator r1 = r1.iterator()
        L13:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L2f
            java.lang.Object r3 = r1.next()
            androidx.constraintlayout.core.widgets.ConstraintWidget r3 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r3
            r3.ensureWidgetRuns()
            r3.measured = r2
            androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun r4 = r3.horizontalRun
            r4.reset()
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r3 = r3.verticalRun
            r3.reset()
            goto L13
        L2f:
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r1 = r9.container
            r1.ensureWidgetRuns()
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r1 = r9.container
            r1.measured = r2
            androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun r1 = r1.horizontalRun
            r1.reset()
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r1 = r9.container
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r1 = r1.verticalRun
            r1.reset()
            r9.mNeedRedoMeasures = r2
        L46:
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r1 = r9.mContainer
            boolean r1 = r9.basicMeasureWidgets(r1)
            if (r1 == 0) goto L4f
            return r2
        L4f:
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r1 = r9.container
            r1.setX(r2)
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r1 = r9.container
            r1.setY(r2)
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r1 = r9.container
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r1 = r1.getDimensionBehaviour(r2)
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r3 = r9.container
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r3 = r3.getDimensionBehaviour(r0)
            boolean r4 = r9.mNeedBuildGraph
            if (r4 == 0) goto L6c
            r9.buildGraph()
        L6c:
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r4 = r9.container
            int r4 = r4.getX()
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r5 = r9.container
            int r5 = r5.getY()
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r6 = r9.container
            androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun r6 = r6.horizontalRun
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r6 = r6.start
            r6.resolve(r4)
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r6 = r9.container
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r6 = r6.verticalRun
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r6 = r6.start
            r6.resolve(r5)
            r9.measureWidgets()
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r6 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r1 == r6) goto L93
            if (r3 != r6) goto Lf4
        L93:
            if (r10 == 0) goto Lae
            java.util.ArrayList<androidx.constraintlayout.core.widgets.analyzer.WidgetRun> r6 = r9.mRuns
            java.util.Iterator r6 = r6.iterator()
        L9b:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto Lae
            java.lang.Object r7 = r6.next()
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun r7 = (androidx.constraintlayout.core.widgets.analyzer.WidgetRun) r7
            boolean r7 = r7.supportsWrapComputation()
            if (r7 != 0) goto L9b
            r10 = 0
        Lae:
            if (r10 == 0) goto Ld1
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r6 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r1 != r6) goto Ld1
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r6 = r9.container
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r7 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            r6.setHorizontalDimensionBehaviour(r7)
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r6 = r9.container
            int r7 = r9.computeWrap(r6, r2)
            r6.setWidth(r7)
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r6 = r9.container
            androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun r7 = r6.horizontalRun
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r7 = r7.dimension
            int r6 = r6.getWidth()
            r7.resolve(r6)
        Ld1:
            if (r10 == 0) goto Lf4
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r10 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r3 != r10) goto Lf4
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r10 = r9.container
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r6 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            r10.setVerticalDimensionBehaviour(r6)
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r10 = r9.container
            int r6 = r9.computeWrap(r10, r0)
            r10.setHeight(r6)
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r10 = r9.container
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r6 = r10.verticalRun
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r6 = r6.dimension
            int r10 = r10.getHeight()
            r6.resolve(r10)
        Lf4:
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r10 = r9.container
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r6 = r10.mListDimensionBehaviors
            r7 = r6[r2]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r8 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            if (r7 == r8) goto L107
            r6 = r6[r2]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r7 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT
            if (r6 != r7) goto L105
            goto L107
        L105:
            r10 = 0
            goto L14c
        L107:
            int r10 = r10.getWidth()
            int r10 = r10 + r4
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r6 = r9.container
            androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun r6 = r6.horizontalRun
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r6 = r6.end
            r6.resolve(r10)
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r6 = r9.container
            androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun r6 = r6.horizontalRun
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r6 = r6.dimension
            int r10 = r10 - r4
            r6.resolve(r10)
            r9.measureWidgets()
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r10 = r9.container
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r4 = r10.mListDimensionBehaviors
            r6 = r4[r0]
            if (r6 == r8) goto L130
            r4 = r4[r0]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r6 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT
            if (r4 != r6) goto L148
        L130:
            int r10 = r10.getHeight()
            int r10 = r10 + r5
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r4 = r9.container
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r4 = r4.verticalRun
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r4 = r4.end
            r4.resolve(r10)
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r4 = r9.container
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r4 = r4.verticalRun
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r4 = r4.dimension
            int r10 = r10 - r5
            r4.resolve(r10)
        L148:
            r9.measureWidgets()
            r10 = 1
        L14c:
            java.util.ArrayList<androidx.constraintlayout.core.widgets.analyzer.WidgetRun> r4 = r9.mRuns
            java.util.Iterator r4 = r4.iterator()
        L152:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L16d
            java.lang.Object r5 = r4.next()
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun r5 = (androidx.constraintlayout.core.widgets.analyzer.WidgetRun) r5
            androidx.constraintlayout.core.widgets.ConstraintWidget r6 = r5.widget
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r7 = r9.container
            if (r6 != r7) goto L169
            boolean r6 = r5.resolved
            if (r6 != 0) goto L169
            goto L152
        L169:
            r5.applyToWidget()
            goto L152
        L16d:
            java.util.ArrayList<androidx.constraintlayout.core.widgets.analyzer.WidgetRun> r4 = r9.mRuns
            java.util.Iterator r4 = r4.iterator()
        L173:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L1aa
            java.lang.Object r5 = r4.next()
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun r5 = (androidx.constraintlayout.core.widgets.analyzer.WidgetRun) r5
            if (r10 != 0) goto L188
            androidx.constraintlayout.core.widgets.ConstraintWidget r6 = r5.widget
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r7 = r9.container
            if (r6 != r7) goto L188
            goto L173
        L188:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r6 = r5.start
            boolean r6 = r6.resolved
            if (r6 != 0) goto L190
        L18e:
            r0 = 0
            goto L1aa
        L190:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r6 = r5.end
            boolean r6 = r6.resolved
            if (r6 != 0) goto L19b
            boolean r6 = r5 instanceof androidx.constraintlayout.core.widgets.analyzer.GuidelineReference
            if (r6 != 0) goto L19b
            goto L18e
        L19b:
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r6 = r5.dimension
            boolean r6 = r6.resolved
            if (r6 != 0) goto L173
            boolean r6 = r5 instanceof androidx.constraintlayout.core.widgets.analyzer.ChainRun
            if (r6 != 0) goto L173
            boolean r5 = r5 instanceof androidx.constraintlayout.core.widgets.analyzer.GuidelineReference
            if (r5 != 0) goto L173
            goto L18e
        L1aa:
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r10 = r9.container
            r10.setHorizontalDimensionBehaviour(r1)
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r10 = r9.container
            r10.setVerticalDimensionBehaviour(r3)
            return r0
    }

    public boolean directMeasureSetup(boolean r5) {
            r4 = this;
            boolean r5 = r4.mNeedBuildGraph
            r0 = 0
            if (r5 == 0) goto L59
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r5 = r4.container
            java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintWidget> r5 = r5.mChildren
            java.util.Iterator r5 = r5.iterator()
        Ld:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L35
            java.lang.Object r1 = r5.next()
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r1
            r1.ensureWidgetRuns()
            r1.measured = r0
            androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun r2 = r1.horizontalRun
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r3 = r2.dimension
            r3.resolved = r0
            r2.resolved = r0
            r2.reset()
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r1 = r1.verticalRun
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r2 = r1.dimension
            r2.resolved = r0
            r1.resolved = r0
            r1.reset()
            goto Ld
        L35:
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r5 = r4.container
            r5.ensureWidgetRuns()
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r5 = r4.container
            r5.measured = r0
            androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun r5 = r5.horizontalRun
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r1 = r5.dimension
            r1.resolved = r0
            r5.resolved = r0
            r5.reset()
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r5 = r4.container
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r5 = r5.verticalRun
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r1 = r5.dimension
            r1.resolved = r0
            r5.resolved = r0
            r5.reset()
            r4.buildGraph()
        L59:
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r5 = r4.mContainer
            boolean r5 = r4.basicMeasureWidgets(r5)
            if (r5 == 0) goto L62
            return r0
        L62:
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r5 = r4.container
            r5.setX(r0)
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r5 = r4.container
            r5.setY(r0)
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r5 = r4.container
            androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun r5 = r5.horizontalRun
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r5 = r5.start
            r5.resolve(r0)
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r5 = r4.container
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r5 = r5.verticalRun
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r5 = r5.start
            r5.resolve(r0)
            r5 = 1
            return r5
    }

    public boolean directMeasureWithOrientation(boolean r10, int r11) {
            r9 = this;
            r0 = 1
            r10 = r10 & r0
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r1 = r9.container
            r2 = 0
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r1 = r1.getDimensionBehaviour(r2)
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r3 = r9.container
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r3 = r3.getDimensionBehaviour(r0)
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r4 = r9.container
            int r4 = r4.getX()
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r5 = r9.container
            int r5 = r5.getY()
            if (r10 == 0) goto L89
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r6 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r1 == r6) goto L23
            if (r3 != r6) goto L89
        L23:
            java.util.ArrayList<androidx.constraintlayout.core.widgets.analyzer.WidgetRun> r6 = r9.mRuns
            java.util.Iterator r6 = r6.iterator()
        L29:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L40
            java.lang.Object r7 = r6.next()
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun r7 = (androidx.constraintlayout.core.widgets.analyzer.WidgetRun) r7
            int r8 = r7.orientation
            if (r8 != r11) goto L29
            boolean r7 = r7.supportsWrapComputation()
            if (r7 != 0) goto L29
            r10 = 0
        L40:
            if (r11 != 0) goto L66
            if (r10 == 0) goto L89
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r10 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r1 != r10) goto L89
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r10 = r9.container
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r6 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            r10.setHorizontalDimensionBehaviour(r6)
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r10 = r9.container
            int r6 = r9.computeWrap(r10, r2)
            r10.setWidth(r6)
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r10 = r9.container
            androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun r6 = r10.horizontalRun
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r6 = r6.dimension
            int r10 = r10.getWidth()
            r6.resolve(r10)
            goto L89
        L66:
            if (r10 == 0) goto L89
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r10 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r3 != r10) goto L89
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r10 = r9.container
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r6 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            r10.setVerticalDimensionBehaviour(r6)
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r10 = r9.container
            int r6 = r9.computeWrap(r10, r0)
            r10.setHeight(r6)
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r10 = r9.container
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r6 = r10.verticalRun
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r6 = r6.dimension
            int r10 = r10.getHeight()
            r6.resolve(r10)
        L89:
            if (r11 != 0) goto Lb4
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r10 = r9.container
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r5 = r10.mListDimensionBehaviors
            r6 = r5[r2]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r7 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            if (r6 == r7) goto L9b
            r5 = r5[r2]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r6 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT
            if (r5 != r6) goto Lc5
        L9b:
            int r10 = r10.getWidth()
            int r10 = r10 + r4
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r5 = r9.container
            androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun r5 = r5.horizontalRun
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r5 = r5.end
            r5.resolve(r10)
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r5 = r9.container
            androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun r5 = r5.horizontalRun
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r5 = r5.dimension
            int r10 = r10 - r4
            r5.resolve(r10)
            goto Ldf
        Lb4:
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r10 = r9.container
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r4 = r10.mListDimensionBehaviors
            r6 = r4[r0]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r7 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            if (r6 == r7) goto Lc7
            r4 = r4[r0]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r6 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT
            if (r4 != r6) goto Lc5
            goto Lc7
        Lc5:
            r10 = 0
            goto Le0
        Lc7:
            int r10 = r10.getHeight()
            int r10 = r10 + r5
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r4 = r9.container
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r4 = r4.verticalRun
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r4 = r4.end
            r4.resolve(r10)
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r4 = r9.container
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r4 = r4.verticalRun
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r4 = r4.dimension
            int r10 = r10 - r5
            r4.resolve(r10)
        Ldf:
            r10 = 1
        Le0:
            r9.measureWidgets()
            java.util.ArrayList<androidx.constraintlayout.core.widgets.analyzer.WidgetRun> r4 = r9.mRuns
            java.util.Iterator r4 = r4.iterator()
        Le9:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L109
            java.lang.Object r5 = r4.next()
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun r5 = (androidx.constraintlayout.core.widgets.analyzer.WidgetRun) r5
            int r6 = r5.orientation
            if (r6 == r11) goto Lfa
            goto Le9
        Lfa:
            androidx.constraintlayout.core.widgets.ConstraintWidget r6 = r5.widget
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r7 = r9.container
            if (r6 != r7) goto L105
            boolean r6 = r5.resolved
            if (r6 != 0) goto L105
            goto Le9
        L105:
            r5.applyToWidget()
            goto Le9
        L109:
            java.util.ArrayList<androidx.constraintlayout.core.widgets.analyzer.WidgetRun> r4 = r9.mRuns
            java.util.Iterator r4 = r4.iterator()
        L10f:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L143
            java.lang.Object r5 = r4.next()
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun r5 = (androidx.constraintlayout.core.widgets.analyzer.WidgetRun) r5
            int r6 = r5.orientation
            if (r6 == r11) goto L120
            goto L10f
        L120:
            if (r10 != 0) goto L129
            androidx.constraintlayout.core.widgets.ConstraintWidget r6 = r5.widget
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r7 = r9.container
            if (r6 != r7) goto L129
            goto L10f
        L129:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r6 = r5.start
            boolean r6 = r6.resolved
            if (r6 != 0) goto L131
        L12f:
            r0 = 0
            goto L143
        L131:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r6 = r5.end
            boolean r6 = r6.resolved
            if (r6 != 0) goto L138
            goto L12f
        L138:
            boolean r6 = r5 instanceof androidx.constraintlayout.core.widgets.analyzer.ChainRun
            if (r6 != 0) goto L10f
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r5 = r5.dimension
            boolean r5 = r5.resolved
            if (r5 != 0) goto L10f
            goto L12f
        L143:
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r10 = r9.container
            r10.setHorizontalDimensionBehaviour(r1)
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r10 = r9.container
            r10.setVerticalDimensionBehaviour(r3)
            return r0
    }

    public void invalidateGraph() {
            r1 = this;
            r0 = 1
            r1.mNeedBuildGraph = r0
            return
    }

    public void invalidateMeasures() {
            r1 = this;
            r0 = 1
            r1.mNeedRedoMeasures = r0
            return
    }

    public void measureWidgets() {
            r12 = this;
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r0 = r12.container
            java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintWidget> r0 = r0.mChildren
            java.util.Iterator r0 = r0.iterator()
        L8:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Lc9
            java.lang.Object r1 = r0.next()
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r1
            boolean r2 = r1.measured
            if (r2 == 0) goto L19
            goto L8
        L19:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r2 = r1.mListDimensionBehaviors
            r3 = 0
            r8 = r2[r3]
            r9 = 1
            r10 = r2[r9]
            int r2 = r1.mMatchConstraintDefaultWidth
            int r4 = r1.mMatchConstraintDefaultHeight
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r6 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r8 == r6) goto L32
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r5 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r8 != r5) goto L30
            if (r2 != r9) goto L30
            goto L32
        L30:
            r2 = 0
            goto L33
        L32:
            r2 = 1
        L33:
            if (r10 == r6) goto L3b
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r5 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r10 != r5) goto L3c
            if (r4 != r9) goto L3c
        L3b:
            r3 = 1
        L3c:
            androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun r4 = r1.horizontalRun
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r4 = r4.dimension
            boolean r5 = r4.resolved
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r7 = r1.verticalRun
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r7 = r7.dimension
            boolean r11 = r7.resolved
            if (r5 == 0) goto L5b
            if (r11 == 0) goto L5b
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r6 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            int r5 = r4.value
            int r7 = r7.value
            r2 = r12
            r3 = r1
            r4 = r6
            r2.measure(r3, r4, r5, r6, r7)
            r1.measured = r9
            goto Lb6
        L5b:
            if (r5 == 0) goto L89
            if (r3 == 0) goto L89
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r5 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            int r8 = r4.value
            int r7 = r7.value
            r2 = r12
            r3 = r1
            r4 = r5
            r5 = r8
            r2.measure(r3, r4, r5, r6, r7)
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r2 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r10 != r2) goto L7b
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r2 = r1.verticalRun
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r2 = r2.dimension
            int r3 = r1.getHeight()
            r2.wrapValue = r3
            goto Lb6
        L7b:
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r2 = r1.verticalRun
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r2 = r2.dimension
            int r3 = r1.getHeight()
            r2.resolve(r3)
            r1.measured = r9
            goto Lb6
        L89:
            if (r11 == 0) goto Lb6
            if (r2 == 0) goto Lb6
            int r5 = r4.value
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r10 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            int r7 = r7.value
            r2 = r12
            r3 = r1
            r4 = r6
            r6 = r10
            r2.measure(r3, r4, r5, r6, r7)
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r2 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r8 != r2) goto La9
            androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun r2 = r1.horizontalRun
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r2 = r2.dimension
            int r3 = r1.getWidth()
            r2.wrapValue = r3
            goto Lb6
        La9:
            androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun r2 = r1.horizontalRun
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r2 = r2.dimension
            int r3 = r1.getWidth()
            r2.resolve(r3)
            r1.measured = r9
        Lb6:
            boolean r2 = r1.measured
            if (r2 == 0) goto L8
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r2 = r1.verticalRun
            androidx.constraintlayout.core.widgets.analyzer.BaselineDimensionDependency r2 = r2.baselineDimension
            if (r2 == 0) goto L8
            int r1 = r1.getBaselineDistance()
            r2.resolve(r1)
            goto L8
        Lc9:
            return
    }

    public void setMeasurer(androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measurer r1) {
            r0 = this;
            r0.mMeasurer = r1
            return
    }
}
