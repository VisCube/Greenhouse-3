from django.contrib import admin

from .models import Device, Sensor, Actuator

admin.site.register(Device)
admin.site.register(Sensor)
admin.site.register(Actuator)
