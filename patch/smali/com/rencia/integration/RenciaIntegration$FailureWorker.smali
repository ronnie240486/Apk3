.class public final Lcom/rencia/integration/RenciaIntegration$FailureWorker;
.super Ljava/lang/Object;
.source "RenciaIntegration.java"

.implements Ljava/lang/Runnable;

.field private final context:Landroid/content/Context;
.field private final listNumber:I

.method public constructor <init>(Landroid/content/Context;I)V
    .locals 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V
    iput-object p1, p0, Lcom/rencia/integration/RenciaIntegration$FailureWorker;->context:Landroid/content/Context;
    iput p2, p0, Lcom/rencia/integration/RenciaIntegration$FailureWorker;->listNumber:I
    return-void
.end method

.method public run()V
    .locals 7
    :try_start_0
    iget-object v0, p0, Lcom/rencia/integration/RenciaIntegration$FailureWorker;->context:Landroid/content/Context;
    invoke-static {v0}, Lcom/rencia/integration/RenciaIntegration;->getMacForWorker(Landroid/content/Context;)Ljava/lang/String;
    move-result-object v0
    if-eqz v0, :cond_0
    invoke-virtual {v0}, Ljava/lang/String;->length()I
    move-result v1
    if-lez v1, :cond_0
    new-instance v1, Lorg/json/JSONObject;
    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V
    const-string v2, "mac"
    invoke-virtual {v1, v2, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    const-string v2, "active_list_number"
    iget v3, p0, Lcom/rencia/integration/RenciaIntegration$FailureWorker;->listNumber:I
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    move-result-object v3
    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    const-string v2, "https://renciaapp.manus.space/api/v5/playback-failure"
    const-string v3, "POST"
    invoke-virtual {v1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;
    move-result-object v4
    invoke-static {v2, v3, v4}, Lcom/rencia/integration/RenciaIntegration;->request(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    :cond_0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    :catch_0
    return-void
.end method
