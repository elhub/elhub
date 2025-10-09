import no.elhub.devxp.build.configuration.pipeline.constants.Group
import no.elhub.devxp.build.configuration.pipeline.dsl.elhubProject

elhubProject(Group.YOURGROUPHERE, "your-project-name-here") {
    pipeline {
        sequential {
            // Jobs in this block are dependent and must run in sequence.
        }
        parallel {
            // Jobs in this block are independent and can run in parallel.
        }
    }
}

// For documentation on how to write these pipelines, see
// https://docs.elhub.cloud/enabling-systems/devxp/devxp-build-configuration/user-guide.html
