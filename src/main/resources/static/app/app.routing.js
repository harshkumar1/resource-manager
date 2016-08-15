"use strict";
var router_1 = require('@angular/router');
var login_component_1 = require('./login/login.component');
var home_component_1 = require('./home/home.component');
var users_component_1 = require('./users/users.component');
var appRoutes = [
    {
        path: 'login',
        component: login_component_1.LoginComponent,
        pathMatch: 'full'
    },
    {
        path: '',
        component: home_component_1.HomeComponent
    },
    {
        path: 'users',
        component: users_component_1.UsersComponent
    }
];
exports.routing = router_1.RouterModule.forRoot(appRoutes);
//# sourceMappingURL=app.routing.js.map