# Application that reproduces the bug in grails functional tests plugin.
Bug summary: when we pass system variable with ```-D``` functional test itself 'see' this variable, but application that is launched by functional tests - doesn't see it.
