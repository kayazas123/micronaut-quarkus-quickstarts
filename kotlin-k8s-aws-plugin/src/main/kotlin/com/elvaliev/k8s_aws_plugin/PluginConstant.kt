package com.elvaliev.k8s_aws_plugin

class PluginConstant {

    companion object {
        const val Aws = "aws"
        const val AwsLocal = "awsLocal"
        const val AwsPackage = "awsPackage"
        const val AwsTaskDescription = "Tasks for creating and packaging Amazon Lambda"
        const val Kubernetes = "kubernetes"
        const val KubernetesDeploy = "kubernetesDeploy"
        const val KubernetesRedeploy = "kubernetesRedeploy"
        const val KubernetesTaskDescription = "Tasks for creating/redeploying application on Kubernetes"
        const val Openshift = "openshift"
        const val OpenshiftDeploy = "openshiftDeploy"
        const val OpenshiftRedeploy = "OpenshiftRedeploy"
        const val OpenshiftTaskDescription = "Tasks for creating/redeploying application on Openshift"
    }
}