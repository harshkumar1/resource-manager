"use strict";
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};
var platform_browser_dynamic_1 = require('@angular/platform-browser-dynamic');
var core_1 = require('@angular/core');
var _1 = require('./app/');
var login_component_1 = require('./app/login/login.component');
var home_component_1 = require('./app/home/home.component');
var users_component_1 = require('./app/users/users.component');
var core_2 = require('@angular/core');
var forms_1 = require('@angular/forms');
var platform_browser_1 = require('@angular/platform-browser');
var sidenav_1 = require('@angular2-material/sidenav/sidenav');
var toolbar_1 = require('@angular2-material/toolbar/toolbar');
var list_1 = require('@angular2-material/list/list');
var icon_1 = require('@angular2-material/icon/icon');
var button_1 = require('@angular2-material/button/button');
var input_1 = require('@angular2-material/input/input');
var card_1 = require('@angular2-material/card/card');
var app_routing_1 = require('./app/app.routing');
var authentication_service_1 = require('./app/services/authentication.service');
var ClientAppModule = (function () {
    function ClientAppModule(_appRef) {
        this._appRef = _appRef;
    }
    ClientAppModule.prototype.ngDoBootstrap = function () {
        this._appRef.bootstrap(_1.AppComponent);
    };
    ClientAppModule = __decorate([
        core_2.NgModule({
            imports: [
                app_routing_1.routing,
                forms_1.FormsModule,
                platform_browser_1.BrowserModule,
                sidenav_1.MdSidenavModule,
                toolbar_1.MdToolbarModule,
                list_1.MdListModule,
                icon_1.MdIconModule,
                button_1.MdButtonModule,
                input_1.MdInputModule,
                card_1.MdCardModule
            ],
            declarations: [_1.AppComponent, login_component_1.LoginComponent, home_component_1.HomeComponent, users_component_1.UsersComponent],
            providers: [authentication_service_1.AuthenticationService],
            entryComponents: [_1.AppComponent, home_component_1.HomeComponent],
        }), 
        __metadata('design:paramtypes', [core_2.ApplicationRef])
    ], ClientAppModule);
    return ClientAppModule;
}());
exports.ClientAppModule = ClientAppModule;
if (_1.environment.production) {
    core_1.enableProdMode();
}
platform_browser_dynamic_1.platformBrowserDynamic().bootstrapModule(ClientAppModule);
//# sourceMappingURL=main.js.map