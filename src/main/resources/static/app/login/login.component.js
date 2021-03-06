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
var core_1 = require('@angular/core');
var router_1 = require('@angular/router');
var authentication_service_1 = require('../services/authentication.service');
var LoginComponent = (function () {
    function LoginComponent(_router, _authService) {
        this._router = _router;
        this._authService = _authService;
        this.user = new authentication_service_1.LoginInfo('', '', '');
        this.errors = '';
    }
    LoginComponent.prototype.ngOnInit = function () {
        localStorage.removeItem("user");
    };
    LoginComponent.prototype.login = function (user) {
        var _this = this;
        this.user.username = user.username;
        this.user.password = user.password;
        console.log(this.user);
        this._authService.login(user)
            .then(function (user) {
            if (user !== undefined) {
                console.log(user);
                localStorage.setItem("user", JSON.stringify(user));
                _this._router.navigate(['']);
            }
            else {
                _this.errors = "Failed to load data";
            }
        })
            .catch(function (error) { return _this.errors = error; });
    };
    LoginComponent = __decorate([
        core_1.Component({
            moduleId: module.id,
            selector: 'app-login',
            templateUrl: 'login.component.html',
            styleUrls: ['login.component.css']
        }), 
        __metadata('design:paramtypes', [router_1.Router, authentication_service_1.AuthenticationService])
    ], LoginComponent);
    return LoginComponent;
}());
exports.LoginComponent = LoginComponent;
//# sourceMappingURL=login.component.js.map