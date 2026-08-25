.class public final Lcom/rencia/integration/RenciaIntegration$AckWorker;
.super Ljava/lang/Object;
.source "RenciaIntegration.java"

.implements Ljava/lang/Runnable;

.field private final context:Landroid/content/Context;
.field private final alertId:Ljava/lang/String;

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V
    iput-object p1, p0, Lcom/rencia/integration/RenciaIntegration$AckWorker;->context:Landroid/content/Context;
    iput-object p2, p0, Lcom/rencia/integration/RenciaIntegration$AckWorker;->alertId:Ljava/lang/String;
    return-void
.end method

.method public run()V
    .locals 7
    :try_start_0
    iget-object v0, p0, Lcom/rencia/integration/RenciaIntegration$AckWorker;->context:Landroid/content/Context;
    invoke-static {v0}, Lcom/rencia/integration/RenciaIntegration;->getMacForWorker(Landroid/content/Context;)Ljava/lang/String;
    move-result-object v0
    iget-object v1, p0, Lcom/rencia/integration/RenciaIntegration$AckWorker;->alertId:Ljava/lang/String;
    if-eqz v0, :cond_0
    if-eqz v1, :cond_0
    new-instance v2, Lorg/json/JSONObject;
    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V
    const-string v3, "mac"
    invoke-virtual {v2, v3, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    const-string v3, "alert_id"
    invoke-virtual {v2, v3, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    const-string v3, "https://renciaapp.manus.space/api/v5/list-notifications/ack"
    const-string v4, "POST"
    invoke-virtual {v2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;
    move-result-object v5
    invoke-static {v3, v4, v5}, Lcom/rencia/integration/RenciaIntegration;->request(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    :cond_0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    :catch_0
    return-void
.end method
